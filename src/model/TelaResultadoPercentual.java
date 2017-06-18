package model;

import java.awt.Label;
import java.util.Map;

public class TelaResultadoPercentual {

	public Map<String, Label> novoVoto(Map<String, Label> labels, Map<String, Integer> votos, int totalVotos) {
		for (Map.Entry<String, Label> label : labels.entrySet())
			label.getValue().setText((votos.get(label.getKey()) * 100 / totalVotos) + "%");
		
		return labels;
	}	
	
}
