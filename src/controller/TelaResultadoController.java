package controller;

import java.awt.Label;
import java.util.Map;

import model.TelaResultado;

public class TelaResultadoController {
	private TelaResultado telaResultado;
	
	public TelaResultadoController(TelaResultado telaResultado){
		this.telaResultado = telaResultado;
	}
	
    public Map<String,Label> novoVoto(Map<String,Label> labels, String opcao, int nvotos) {
        return telaResultado.novoVoto(labels, opcao, nvotos);
    }	
}
