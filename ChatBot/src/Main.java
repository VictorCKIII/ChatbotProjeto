
import java.util.HashMap;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application  {
        public static void main(String[] args) {
          launch(args);             
          
            // PersoTest geralt = personagens.get("Geralt");
            //PersoTest ciri = personagens.get("Ciri");
      
           // Capitulos raiz = capitulos.get("ENCONTRO");                    
        

         //   raiz.mostrar();


        }

        @Override
        public void start(Stage arg0) throws Exception {
          FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("screen.fxml"));
          Parent parent = fxmlLoader.load();
          Scene scene = new Scene(parent);

          arg0.setTitle("Olá Manito");
          arg0.setScene(scene);
          arg0.show();


         //arg0.setTitle("Titulo");
         //Button botao = new Button("Clique");
         //botao.setOnAction(new EventHandler<ActionEvent>() {

         // @Override
         // public void handle(ActionEvent arg0) {
         //   System.out.println("Paertou");
         // }
          
       //  });
        // StackPane root = new StackPane();
        //  root.getChildren().addAll(botao);
        // arg0.setScene(new Scene(root,300,250));
        // arg0.show(); 
        }
     
  

}