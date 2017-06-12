package controller;

import java.util.ArrayList;
import java.util.Map;

import model.Votacao;

public class TelaVotacaoController {

	private Votacao _votacao;
	
	public TelaVotacaoController(Votacao votacao){
		this._votacao = votacao;
	}
	
	public void adicionaOpcao(String opcao) {
		this._votacao.adicionaOpcao(opcao);
	}
	
	public void votar(String opcao) {
		this._votacao.votar(opcao);
	}

	public int getTotalVotos() {
		return this._votacao.getTotalVotos();
	}

	public int getVotos(String opcao) {
		return this._votacao.getVotos(opcao);
	}
	
	public Map<String, Integer> get_opcoes() {
		return this._votacao.get_opcoes();
	}	
	
	public ArrayList<String> get_listaOpcoes() {
		return this._votacao.get_listaOpcoes();
	}
	
}
