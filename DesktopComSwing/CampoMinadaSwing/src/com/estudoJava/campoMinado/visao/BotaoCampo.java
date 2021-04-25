package CampoMinadaSwing.src.com.estudoJava.campoMinado.visao;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputListener;

import java.awt.*;
import java.awt.event.MouseEvent;

import CampoMinadaSwing.src.com.estudoJava.campoMinado.modelo.Campo;
import CampoMinadaSwing.src.com.estudoJava.campoMinado.modelo.CampoEvento;
import CampoMinadaSwing.src.com.estudoJava.campoMinado.modelo.CampoObservador;

public class BotaoCampo extends JButton implements CampoObservador, MouseInputListener {

  private final Color BG_PADRAO = new Color(184,184,184);
  private final Color BG_MARCADO = new Color(8,179,247);
  private final Color BG_EXPLODIR = new Color(189,66,68);
  private final Color TEXTO_VERDE = new Color(0,100,0);

  private Campo campo;

  public BotaoCampo(Campo campo) {
    this.campo = campo;
    setBackground(BG_PADRAO);
    setBorder(BorderFactory.createBevelBorder(0));

    addMouseListener(this);
    campo.registrarObservador(this);
  }

  @Override
  public void eventoOcorreu(Campo campo, CampoEvento evento) {
    switch (evento) {
      case ABRIR:
        aplicarEstiloAbrir();
        break;
      case MARCAR:
        aplicarEstiloMarcar();
        break;
      case EXPLODIR:
        aplicarEstiloExplodir();
        break;
      default:
        aplicarEstiloPadrao();
        break;
    }

    SwingUtilities.invokeLater(() -> {
      repaint();
      validate();
    });
  }

  private void aplicarEstiloPadrao() {
    setBorder(BorderFactory.createBevelBorder(0));
    setBackground(BG_PADRAO);
    setText("");
  }

  private void aplicarEstiloExplodir() {
    setBackground(BG_EXPLODIR);
    setForeground(Color.WHITE);
    setText("X");
  }

  private void aplicarEstiloMarcar() {
    setBackground(BG_MARCADO);
    setForeground(Color.BLACK);
    setText("M");
  }

  private void aplicarEstiloAbrir() {

    setBorder(BorderFactory.createLineBorder(Color.GRAY));

    if (campo.isMinado()) {
      setBackground(BG_EXPLODIR);
      return;
    }

    setBackground(BG_PADRAO);

    switch (campo.minasNaVizinhanca()) {
      case 1:
        setForeground(TEXTO_VERDE);
        break;
      case 2:
        setForeground(Color.BLUE);
        break;
      case 3:
        setForeground(Color.YELLOW);
        break;
      case 4:
      case 5:
      case 6:
        setForeground(Color.RED);
        break;
      default:
        setForeground(Color.PINK);
        break;
    }

    String valor = !campo.vizinhacaSegura() ?
                    campo.minasNaVizinhanca()+"" : "";

    setText(valor);
  }

  // Interface dos Eventos do mouse

  @Override
  public void mousePressed(MouseEvent e) {
    if (e.getButton() == 1) {
      campo.abrir();
    } else {
      campo.alternarMarcacao();
    }
  }

  public void mouseClicked(MouseEvent e){}
  public void mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {}
  public void mouseDragged(MouseEvent e) {}
  public void mouseMoved(MouseEvent e) {}

}