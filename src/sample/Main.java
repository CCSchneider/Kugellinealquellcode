/*package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}*/
package sample;
        import javafx.application.*;
//import javafx.fxml.FXMLLoader;
        import javafx.scene.*;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
//import javafx.scene.layout.AnchorPane;
        import javafx.scene.layout.VBox;
        import javafx.stage.*;



public class Main extends Application{

    Scene s_mainMenu, s_newGame, s_loadGame, s_settings, s_highscore, s_game, s_difficulty;
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Kugellineal");
        //AnchorPane root = FXMLLoader.load(Controller.class.getResource("settings.fxml"));

        //--Main Menu--
        //Text in Window
        Label label1 = new Label("Main Menu");
        //create buttons and give them names
        Button b_newGame, b_loadGame, b_settings, b_highscore, b_exit;
        b_newGame = new Button("New Game");
        b_loadGame = new Button("Load Game");
        b_settings = new Button("Settings");
        b_highscore = new Button("Highscore");
        b_exit = new Button("Exit");
        //actionhandlers
        b_newGame.setOnAction(e -> primaryStage.setScene(s_newGame));
        b_loadGame.setOnAction(e -> primaryStage.setScene(s_loadGame));
        b_settings.setOnAction(e -> primaryStage.setScene(s_settings));
        b_highscore.setOnAction(e -> primaryStage.setScene(s_highscore));
        b_exit.setOnAction(e -> primaryStage.close());
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, b_newGame, b_loadGame, b_settings, b_highscore, b_exit);
        s_mainMenu = new Scene(layout1, 300, 275);


        //--New Game--
        //Text in Window
        Label label2 = new Label("New Game");
        //create buttons and give them names
        Button b_cancel, b_continue;
        b_cancel = new Button("Cancel");
        b_continue = new Button("Continue");
        //actionhandlers
        b_cancel.setOnAction(e -> primaryStage.setScene(s_mainMenu));
        b_continue.setOnAction(e -> primaryStage.setScene(s_difficulty));
        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(label2, b_cancel, b_continue);
        s_newGame = new Scene(layout2, 300, 275);


        //--Choose a Difficulty--
        //Text in Window
        Label label7 = new Label("Choose a Difficulty");
        //create buttons and give them names
        Button b_cancel7, b_continue7;
        b_cancel7 = new Button("Cancel");
        b_continue7 = new Button("Continue");
        //actionhandlers
        b_cancel7.setOnAction(e -> primaryStage.setScene(s_newGame));
        b_continue7.setOnAction(e -> primaryStage.setScene(s_game));
        VBox layout7 = new VBox(20);
        layout7.getChildren().addAll(label7, b_cancel7, b_continue7);
        s_difficulty = new Scene(layout7, 300, 275);


        //--Game--
        //Text in Window
        Label label6 = new Label("Game");
        VBox layout6 = new VBox(20);
        layout6.getChildren().add(label6);
        s_game = new Scene(layout6, 300, 275);


        //--Load Game--
        //Text in Window
        Label label4 = new Label("Load Game");
        //create buttons and give them names
        Button b_cancel3, b_continue3;
        b_cancel3 = new Button("Cancel");
        b_continue3 = new Button("Continue");
        //actionhandlers
        b_cancel3.setOnAction(e -> primaryStage.setScene(s_mainMenu));
        b_continue3.setOnAction(e -> primaryStage.setScene(s_game));
        VBox layout3 = new VBox(20);
        layout3.getChildren().addAll(label4, b_cancel3, b_continue3);
        s_loadGame = new Scene(layout3, 300, 275);


        //--Settings--
        Label label5 = new Label("Settings");
        //create buttons and give them names
        Button b_continue5;
        b_continue5 = new Button("Continue");
        //actionhandlers
        b_continue5.setOnAction(e -> primaryStage.setScene(s_mainMenu));
        VBox layout5 = new VBox(20);
        layout5.getChildren().addAll(label5, b_continue5);
        s_settings = new Scene(layout5, 300, 275);


        //--Highscore--
        //Text in Window
        Label label3 = new Label("Highscore");
        //create buttons and give them names
        Button b_cancel2;
        b_cancel2 = new Button("Cancel");
        //actionhandlers
        b_cancel2.setOnAction(e -> primaryStage.setScene(s_mainMenu));
        VBox layout4 = new VBox(20);
        layout4.getChildren().addAll(label3, b_cancel2);
        s_highscore = new Scene(layout4, 300, 275);


        primaryStage.setScene(s_mainMenu);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


}
