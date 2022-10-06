import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class Controlador {
             HashMap<String, PersoTest> personagens; 
             HashMap<String,Capitulos> capitulos; 
    @FXML
    private Button botao;

    @FXML
    private VBox espacoBotoes;

    @FXML
    private Label imagemCapitulo;

    @FXML
    private TextArea textoCapitulo;

    @FXML
    void carregar(ActionEvent event) {
        LeitorCarregador leitor = new LeitorCarregador();
        personagens =  leitor.lerPersonagens("rsc/personagens.txt");
        capitulos = leitor.lerCapitulos("rsc/capii.txt", personagens);
        Capitulos raiz = capitulos.get("ENCONTRO");
        mostrarCapitulo(raiz);
    }

    void mostrarCapitulo(Capitulos capitulo)
    {
        textoCapitulo.clear();
        textoCapitulo.clear();
        espacoBotoes.getChildren().clear();
        textoCapitulo.setText(
            capitulo.getNome() + "\n" + 
            capitulo.getTexto() + "\n" + 
            capitulo.alterarEnergiaPerso());

             if(capitulo.getEscolhas().size() > 0)
             {
        for (Escolha abacate : capitulo.getEscolhas()) {

            Button botao = new Button(abacate.getTexto());
         botao.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent arg0) {
            mostrarCapitulo(abacate.getProx());
            
          }
          
         });     
         espacoBotoes.getChildren().add(botao);
        }  
      }            
    }
}
