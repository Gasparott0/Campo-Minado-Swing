package br.com.gasparotto.cm.visao;

import javax.swing.JFrame;

import br.com.gasparotto.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {

	public TelaPrincipal() {

		Tabuleiro tabuleiro = new Tabuleiro(10, 10, 10);

		add(new PainelTabuleiro(tabuleiro));

		setTitle("Campo Minado");
		setSize(690, 498);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {

		new TelaPrincipal();
	}
}
