package view;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Window;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import controller.TelaResultadoPercentualController;

@SuppressWarnings("serial")
public class TelaResultadoPercentualView extends Window {

	private Map<String, Label> labels = new HashMap<String, Label>();

	private TelaResultadoPercentualController telaResultadoPercentualController;
	
	public TelaResultadoPercentualView(Frame parent, TelaResultadoPercentualController telaResultadoPercentualController) {
		super(parent);
		
		this.telaResultadoPercentualController = telaResultadoPercentualController;
		
		this.setSize(110, 120);
		this.setLayout(new GridLayout(0, 2));

		this.add(new Label("Votos"));
		this.add(new Label());
	}
	
	public void inicializar(ArrayList<String> opcoes) {

		Label label;
		Label votos;
		
		for (String opcao : opcoes) {
			if (!labels.containsKey(opcao)) {
				label = new Label(opcao + " - ");
				votos = new Label("" + 0);
				labels.put(opcao, votos);
				this.add(label);
				this.add(votos);
			}
		}
	}
	
	public void novoVoto(Map<String, Integer> votos, int totalVotos) {
		this.labels =  telaResultadoPercentualController.novoVoto(this.labels, votos, totalVotos);
	}	
	
}
