package view;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Window;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import controller.TelaResultadoController;

@SuppressWarnings("serial")
public class TelaResultadoView extends Window {

	private Map<String,Label> labels = new HashMap<String,Label>();	
	
	private TelaResultadoController telaResultadoController;
	
    public TelaResultadoView(Frame parent, TelaResultadoController telaResultadoController){
        super(parent);
        
        this.telaResultadoController = telaResultadoController;
        
        this.setSize(110,120);
        this.setLayout(new GridLayout(0,2));
        
        this.add(new Label("Votos"));
        this.add(new Label());
    }
	
    public void inicializar(ArrayList<String> opcoes) {

        Label label;
        Label votos;
        
        for(String opcao : opcoes){
            if(!labels.containsKey(opcao)){
                label = new Label(opcao+" - ");
                votos = new Label(""+0);
                labels.put(opcao,votos);
                this.add(label);
                this.add(votos);
            }
        }
    } 
    
    public void novoVoto(String opcao, int nvotos) {
        this.labels = telaResultadoController.novoVoto(this.labels, opcao, nvotos);
    }    
    
}
