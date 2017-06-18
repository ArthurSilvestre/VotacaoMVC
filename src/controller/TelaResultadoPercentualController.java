package controller;

import java.awt.Label;
import java.util.Map;

import model.TelaResultadoPercentual;

public class TelaResultadoPercentualController {
	
	private TelaResultadoPercentual telaResultadoPercentual;
	
	public TelaResultadoPercentualController(TelaResultadoPercentual telaResultadoPercentual){
		this.telaResultadoPercentual = telaResultadoPercentual;
	}

	public Map<String, Label> novoVoto(Map<String, Label> labels, Map<String, Integer> votos, int totalVotos) {
		return telaResultadoPercentual.novoVoto(labels, votos, totalVotos);
	}	
	
}
