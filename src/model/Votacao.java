package model;

import java.util.ArrayList;
import java.util.Map;

public class Votacao {

	private Map<String, Integer> _opcoes;

	private ArrayList<String> _listaOpcoes;	
	
	public Votacao(Map<String, Integer> opcoes, ArrayList<String> listaOpcoes){
		this._opcoes = opcoes;
		this._listaOpcoes = listaOpcoes;
	}

	public void adicionaOpcao(String opcao) {
		this._listaOpcoes.add(opcao);
		this._opcoes.put(opcao, new Integer(0));
	}	

	public void votar(String opcao) {
		int votoAtual = ((Integer) this._opcoes.get(opcao)).intValue();

		this._opcoes.put(opcao, new Integer(++votoAtual));
	}

	public int getTotalVotos() {
		int total = 0;
		for (Integer votos : _opcoes.values()) {
			total += votos.intValue();
		}
		return total;
	}

	public int getVotos(String opcao) {
		return ((Integer) this._opcoes.get(opcao)).intValue();
	}

	//GETs e SETs
	
	public Map<String, Integer> get_opcoes() {
		return _opcoes;
	}

	public ArrayList<String> get_listaOpcoes() {
		return _listaOpcoes;
	}
	
}
