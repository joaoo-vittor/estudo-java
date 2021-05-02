[Fonte Do Artigo](https://www.digitalocean.com/community/tutorials/how-to-install-mysql-on-ubuntu-20-04-pt)

### Passo 1 — Instalando o MySQL

No Ubuntu 20.04, é possível instalar o MySQL usando o repositório de pacotes APT.
No momento em que este artigo foi escrito, a versão do MySQL disponível no
repositório padrão do Ubuntu era a versão 8.0.19.

Para instalar o MySQL, atualize o índice de pacotes em seu servidor se
ainda não tiver feito isso:

```
sudo apt update
```

Depois disso, instale o pacote mysql-server:

```
sudo apt install mysql-server
```

Isso instalará o MySQL, mas não solicitará que você defina uma senha ou que
faça outras alterações de configuração. Como isso deixa sua instalação do
MySQL não segura, abordaremos isso a seguir.

### Passo 2 — Configurando o MySQL

Se quiser novas instalações do MySQL, execute o script de segurança incluído do DBMS.
Esse script modifica algumas das opções padrão menos seguras referentes,
por exemplo, a logins root remotos e usuários de exemplo.

Execute o script de segurança com o sudo:

```
sudo mysql_secure_installation
```

Isso levará você através de uma série de prompts onde é possível fazer algumas
alterações nas opções de segurança de sua instalação do MySQL. O primeiro prompt
perguntará se você gostaria de definir o plug-in de validar senha, que pode ser
usado para testar a força de sua senha do MySQL.

Caso você escolha configurar o plug-in de validar senha, o script solicitará
que você escolha um nível de validação de senha. O nível mais forte — que você
seleciona ao digitar 2 — exigirá que sua senha tenha pelo menos oito
caracteres de tamanho e inclua uma mistura de caracteres em maiúsculo,
minúsculo, numérico e especial:

```
Output
Securing the MySQL server deployment.

Connecting to MySQL using a blank password.

VALIDATE PASSWORD COMPONENT can be used to test passwords
and improve security. It checks the strength of password
and allows the users to set only those passwords which are
secure enough. Would you like to setup VALIDATE PASSWORD component?

Press y|Y for Yes, any other key for No: Y

There are three levels of password validation policy:

LOW    Length >= 8
MEDIUM Length >= 8, numeric, mixed case, and special characters
STRONG Length >= 8, numeric, mixed case, special characters and dictionary file

Please enter 0 = LOW, 1 = MEDIUM and 2 = STRONG:
2
```

Independentemente de você escolher configurar o plug-in de validar senha,
o próximo prompt será o de definir uma senha para o usuário root do MySQL.
Digite e, em seguida, confirme uma senha segura de sua escolha:

```
Output
Please set the password for root here.


New password:

Re-enter new password:
Caso tenha usado o plug-in de validar senha, você receberá o feedback da força dela.
Então, o script perguntará se você deseja continuar com a senha que acabou de digitar,
ou se quer digitar uma nova. Supondo que esteja satisfeito com a força da
senha que acabou de digitar, digite Y para continuar o script:

Output
Estimated strength of the password: 100
Do you wish to continue with the password provided?(Press y|Y for Yes, any other key for No) : Y
```

A partir daí, pressione Y e, depois, ENTER para aceitar as configurações padrão
para todas as perguntas subsequentes. Isso removerá alguns usuários anônimos e
o banco de dados de teste, desativará os logins remotos para a raiz e carregará
essas novas regras para que o MySQL respeite imediatamente as alterações que você fez.

Note que, embora tenha definido uma senha para o usuário root do MySQL, este
usuário não está configurado para autenticar-se com uma senha ao conectar-se
ao shell do MySQL. Se quiser, é possível ajustar esta configuração seguindo o Passo 3.

### Passo 3 — (Opcional) Ajustando a autenticação e os privilégios do usuário
Nos sistemas Ubuntu que executam o MySQL 5.7 (e as versões posteriores), por
padrão, o usuário root do MySQL é configurado para autenticar usando o plug-in
auth_socket e não com uma senha. Isso permite maior segurança e a usabilidade
na maioria dos casos, mas também pode complicar as coisas quando for necessário
permitir que um programa externo (por exemplo, o phpMyAdmin) acesse o usuário.

Para usar uma senha para conectar-se ao MySQL como root, será necessário mudar
seu método de autenticação de auth_socket para outro plug-in, como o
caching_sha2_password ou o mysql_native_password. Para fazer isso, abra o
prompt do MySQL do seu terminal:

```
sudo mysql

Em seguida, verifique quais os métodos de autenticação cada conta de usuário do seu MySQL utilizam com o seguinte comando:

SELECT user,authentication_string,plugin,host FROM mysql.user;

Output
+------------------+------------------------------------------------------------------------+-----------------------+-----------+
| user             | authentication_string                                                  | plugin                | host      |
+------------------+------------------------------------------------------------------------+-----------------------+-----------+
| debian-sys-maint | $A$005$lS|M#3K #XslZ.xXUq.crEqTjMvhgOIX7B/zki5DeLA3JB9nh0KwENtwQ4 | caching_sha2_password | localhost |
| mysql.infoschema | $A$005$THISISACOMBINATIONOFINVALIDSALTANDPASSWORDTHATMUSTNEVERBRBEUSED | caching_sha2_password | localhost |
| mysql.session    | $A$005$THISISACOMBINATIONOFINVALIDSALTANDPASSWORDTHATMUSTNEVERBRBEUSED | caching_sha2_password | localhost |
| mysql.sys        | $A$005$THISISACOMBINATIONOFINVALIDSALTANDPASSWORDTHATMUSTNEVERBRBEUSED | caching_sha2_password | localhost |
| root             |                                                                        | auth_socket           | localhost |
+------------------+------------------------------------------------------------------------+-----------------------+-----------+
5 rows in set (0.00 sec)
```

Neste exemplo, é possível ver que o usuário root autenticou usando o plug-in auth_socket. Para configurar a conta root para autenticar-se com uma senha, execute uma instrução ALTER USER para alterar qual plug-in de autenticação ela utiliza e configure uma nova senha.

Certifique-se de alterar a password para uma senha forte de sua escolha. Saiba que este comando mudará a senha root que você definiu no Passo 2:

```
ALTER USER 'root'@'localhost' IDENTIFIED WITH caching_sha2_password BY 'password';
```

Nota: a instrução anterior, ALTER USER, configura o usuário root do MySQL para autenticar-se com o plug-in caching_sha2_password. De acordo com a documentação oficial do MySQL, o caching_sha2_password é o plug-in de autenticação preferencial do MySQL, pois ele fornece uma criptografia de senha mais segura do que o mysql_native_password, que é o plug-in mais antigo (mas ainda assim bastante utilizado).

No entanto, muitos aplicativos PHP (phpMyAdmin, por exemplo) não funcionam de maneira confiável com o caching_sha2_password. Se planeja utilizar este banco de dados com um aplicativo PHP você pode, em vez disso, querer definir o root para autenticar-se com o mysql_native_password:

```
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';
```

Então, execute o comando FLUSH  o qual diz para o servidor recarregar as tabelas de permissões e colocar as suas alterações em vigor:

```
FLUSH PRIVILEGES;

Verifique novamente os métodos de autenticação utilizados pelos seus usuários para confirmar que o *root já não autentica utilizando o plug-in auth_socket:

SELECT user,authentication_string,plugin,host FROM mysql.user;

Output
+------------------+------------------------------------------------------------------------+-----------------------+-----------+
| user             | authentication_string                                                  | plugin                | host      |
+------------------+------------------------------------------------------------------------+-----------------------+-----------+
| debian-sys-maint | $A$005$lS|M#3K #XslZ.xXUq.crEqTjMvhgOIX7B/zki5DeLA3JB9nh0KwENtwQ4 | caching_sha2_password | localhost |
| mysql.infoschema | $A$005$THISISACOMBINATIONOFINVALIDSALTANDPASSWORDTHATMUSTNEVERBRBEUSED | caching_sha2_password | localhost |
| mysql.session    | $A$005$THISISACOMBINATIONOFINVALIDSALTANDPASSWORDTHATMUSTNEVERBRBEUSED | caching_sha2_password | localhost |
| mysql.sys        | $A$005$THISISACOMBINATIONOFINVALIDSALTANDPASSWORDTHATMUSTNEVERBRBEUSED | caching_sha2_password | localhost |
| root             | *3636DACC8616D997782ADD0839F92C1571D6D78F                              | caching_sha2_password | localhost |
+------------------+------------------------------------------------------------------------+-----------------------+-----------+
5 rows in set (0.00 sec)
```

Neste exemplo de saída, é possível ver que agora o usuário root do MySQL autentica-se utilizando o plug-in caching_sha2_password. Assim que confirmar isso no seu servidor, saia do shell MySQL:

```
exit
```

Como alternativa, alguns usuários podem preferir se conectar ao MySQL com um usuário dedicado. Para criar esse usuário, abra o shell do MySQL novamente:

```
sudo mysql
```

Nota: se tiver a autenticação por senha habilitada para root (como descrito nos parágrafos anteriores), será necessário usar um comando diferente para acessar o shell do MySQL. A sintaxe abaixo executará o seu cliente MySQL com privilégios regulares de usuário. Você somente terá privilégios de administrador dentro do banco de dados através desta autenticação:

```
mysql -u root -p
```

A partir daí, crie um novo usuário e dê a ele uma senha forte:

```
CREATE USER 'sammy'@'localhost' IDENTIFIED BY 'password';
```

Então, conceda ao seu novo usuário os privilégios adequados. Por exemplo, é possível conceder os privilégios de usuário para todas as tabelas dentro do banco de dados, além do poder de adicionar, alterar e remover os privilégios de usuário, com este comando:

```
GRANT ALL PRIVILEGES ON *.* TO 'sammy'@'localhost' WITH GRANT OPTION;
```

Note que, neste ponto, não é necessário que você execute o comando FLUSH PRIVILEGES novamente. Este comando só é necessário quando você modificar as tabelas de concessão utilizando instruções como INSERT, UPDATE ou DELETE. Como você criou um novo usuário em vez de modificar um já existente, o FLUSH PRIVILEGES não é necessário aqui.

Em seguida, saia do shell do MySQL:

```
exit
```

Por fim, vamos testar a instalação do MySQL.

### Passo 4 — Testando o MySQL
Independentemente de como você o instalou, o MySQL já deve ter sido inicializado automaticamente. Para testar isso, verifique o status dele.

```
systemctl status mysql.service
```

Você verá um resultado similar ao seguinte:

```
Output
● mysql.service - MySQL Community Server
     Loaded: loaded (/lib/systemd/system/mysql.service; enabled; vendor preset: enabled)
     Active: active (running) since Tue 2020-04-21 12:56:48 UTC; 6min ago
   Main PID: 10382 (mysqld)
     Status: "Server is operational"
      Tasks: 39 (limit: 1137)
     Memory: 370.0M
     CGroup: /system.slice/mysql.service
             └─10382 /usr/sbin/mysqld
```

Se o MySQL não estiver funcionando, inicie-o com o comando sudo systemctl start mysql.

Como verificação adicional, tente se conectar ao banco de dados usando a ferramenta mysqladmin. Esta ferramenta é um cliente que permite que você execute comandos administrativos. Por exemplo, este comando diz para se conectar ao MySQL como root (u-root), solicitar uma senha (-p) e retornar a versão.

```
sudo mysqladmin -p -u root version
```

Você deve ver um resultado similar a este:

```
Output
mysqladmin  Ver 8.0.19-0ubuntu5 for Linux on x86_64 ((Ubuntu))
Copyright (c) 2000, 2020, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Server version      8.0.19-0ubuntu5
Protocol version    10
Connection      Localhost via UNIX socket
UNIX socket     /var/run/mysqld/mysqld.sock
Uptime:         10 min 44 sec

Threads: 2  Questions: 25  Slow queries: 0  Opens: 149  Flush tables: 3  Open tables: 69  Queries per second avg: 0.038
```

Isso significa que o MySQL está funcionando.
