package model;

import java.awt.Label;
import java.util.Map;

public class TelaResultado {
    public Map<String,Label> novoVoto(Map<String,Label> labels, String opcao, int nvotos) {
        Label votos;
        votos = labels.get(opcao);
        votos.setText(""+nvotos);
        return labels;
    } 
}
