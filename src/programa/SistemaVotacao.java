package programa;

import java.util.ArrayList;
import java.util.HashMap;

import controller.TelaVotacaoController;
import model.Votacao;
import view.TelaVotacaoView;

public class SistemaVotacao {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Votacao votacao = new Votacao(new HashMap<String, Integer>(), new ArrayList<String>());
		
		TelaVotacaoController telaVotacaoController = new TelaVotacaoController(votacao);
		
		telaVotacaoController.adicionaOpcao("Op��o 1");
		telaVotacaoController.adicionaOpcao("Op��o 2");
		telaVotacaoController.adicionaOpcao("Op��o 3");
		telaVotacaoController.adicionaOpcao("Op��o 4");
		
		TelaVotacaoView telaVotacao = new TelaVotacaoView(telaVotacaoController);
	}
}
