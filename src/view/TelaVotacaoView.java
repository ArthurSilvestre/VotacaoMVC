package view;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import controller.TelaResultadoController;
import controller.TelaResultadoPercentualController;
import controller.TelaVotacaoController;
import model.TelaResultado;
import model.TelaResultadoPercentual;

@SuppressWarnings("serial")
public class TelaVotacaoView extends Frame implements ActionListener  {
	
	private TelaVotacaoController _telaVotacaoController; 
	
	private TelaResultadoView telaResultadoView;
	
	private TelaResultadoPercentualView telaResultadoPercentualView;
	
	@SuppressWarnings("deprecation")
	public TelaVotacaoView(TelaVotacaoController telaVotacaoController) {
		super("Tela de Votação - Enquete");

		this._telaVotacaoController = telaVotacaoController;
		
		telaResultadoView = new TelaResultadoView(this, new TelaResultadoController(new TelaResultado()));
		telaResultadoView.setLocation(120, 5);
		telaResultadoPercentualView = new TelaResultadoPercentualView(this, new TelaResultadoPercentualController(new TelaResultadoPercentual()));
		telaResultadoPercentualView.setLocation(250, 5);

		criarBotoes();

		telaResultadoView.inicializar(_telaVotacaoController.get_listaOpcoes());
		telaResultadoPercentualView.inicializar(_telaVotacaoController.get_listaOpcoes());

		this.setSize(100, 120);
		this.setLayout(new GridLayout(0, 1));

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().hide();
				System.exit(0);
			}
		});

		this.show();
		telaResultadoView.show();
		telaResultadoPercentualView.show();
	}	


	public void criarBotoes() {
		Button botao;
		for (String opcao : _telaVotacaoController.get_listaOpcoes()) {
			botao = new Button(opcao);
			botao.setActionCommand(opcao);
			botao.addActionListener(this);
			this.add(botao);
		}
	}

	public void actionPerformed(ActionEvent event) {
		String opcao = event.getActionCommand();

		this._telaVotacaoController.votar(opcao);

		telaResultadoView.novoVoto(opcao, _telaVotacaoController.getVotos(opcao));

		telaResultadoPercentualView.novoVoto(_telaVotacaoController.get_opcoes(), _telaVotacaoController.getTotalVotos());
		
	}
	
}
