package view;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Window;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class TelaResultadoPercentualView extends Window {

	private Map<String, Label> labels = new HashMap<String, Label>();

	public TelaResultadoPercentualView(Frame parent) {
		super(parent);
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
		for (Map.Entry<String, Label> label : labels.entrySet())
			label.getValue().setText((votos.get(label.getKey()) * 100 / totalVotos) + "%");
	}	
	
}
