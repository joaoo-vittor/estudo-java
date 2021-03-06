<<<<<<< HEAD
package CampoMinado.com.estudoJava.campoMinado.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
=======
package com.estudoJava.campoMinado.modelo;

import static org.junit.jupiter.api.Assertions.*;

import com.estudoJava.campoMinado.Excecao.ExplosaoExeption;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

<<<<<<< HEAD
import CampoMinado.src.com.estudoJava.campoMinado.Excecao.ExplosaoExeption;
import CampoMinado.src.com.estudoJava.campoMinado.modelo.Campo;

=======
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce
public class CampoTeste {

  private Campo campo;

  @BeforeEach
  void iniciarCampo() {
    campo = new Campo(3, 3);
  }

  @Test
  void testeVizinhoDistancia1Esquerda() {
    Campo vizinho = new Campo(3, 2);
    boolean resultado = campo.adicionarVizinho(vizinho);
    assertTrue(resultado);
  }

  @Test
  void testeVizinhoDistancia1Direita() {
    Campo vizinho = new Campo(3, 4);
    boolean resultado = campo.adicionarVizinho(vizinho);
    assertTrue(resultado);
  }

  @Test
  void testeVizinhoDistancia1Cima() {
    Campo vizinho = new Campo(2, 3);
    boolean resultado = campo.adicionarVizinho(vizinho);
    assertTrue(resultado);
  }

  @Test
  void testeVizinhoDistancia1baixo() {
    Campo vizinho = new Campo(4, 3);
    boolean resultado = campo.adicionarVizinho(vizinho);
    assertTrue(resultado);
  }

  @Test
  void testeVizinhoDistancia2() {
    Campo vizinho = new Campo(2, 2);
    boolean resultado = campo.adicionarVizinho(vizinho);
    assertTrue(resultado);
  }

  @Test
  void testeNãoVizinho() {
    Campo vizinho = new Campo(1, 1);
    boolean resultado = campo.adicionarVizinho(vizinho);
    assertFalse(resultado);
  }

  @Test
  void testeValorPadraoAtributoMarcado() {
    assertFalse(campo.isMarcado());
  }

  @Test
  void testeAlterarMarcado() {
    campo.alternarMarcacao();
    assertTrue(campo.isMarcado());
  }

  @Test
  void testeAlterarMarcadoDuasChamadas() {
    campo.alternarMarcacao();
    campo.alternarMarcacao();
    assertFalse(campo.isMarcado());
  }

  @Test
  void testeAbrirNaoMinadoNaoMarcado() {
    assertTrue(campo.abrir());
  }

  @Test
  void testeAbrirNaoMinadoMarcado() {
    campo.alternarMarcacao();
    assertFalse(campo.abrir());
  }

  @Test
  void testeAbrirMinadoMarcado() {
    campo.alternarMarcacao();
    campo.minar();
    assertFalse(campo.abrir());
  }

  @Test
  void testeAbrirMinadoNaoMarcado() {
    campo.minar();

    assertThrows(ExplosaoExeption.class, () -> {
      campo.abrir();
    });
  }

  @Test
  void testeAbrirComVizinho1() {

    Campo campo11 = new Campo(1, 1);
    Campo campo22 = new Campo(2, 2);

    campo22.adicionarVizinho(campo11);
    campo.adicionarVizinho(campo22);

    campo.abrir();

    assertTrue(campo22.isAberto() && campo11.isAberto());
  }

  @Test
  void testeAbrirComVizinho2() {

    Campo campo11 = new Campo(1, 1);
    Campo campo12 = new Campo(1, 1);
    Campo campo22 = new Campo(2, 2);

    campo12.minar();

    campo22.adicionarVizinho(campo11);
    campo22.adicionarVizinho(campo12);
    campo.adicionarVizinho(campo22);

    campo.abrir();

    assertTrue(campo22.isAberto() && campo11.isFechado());
  }

}
