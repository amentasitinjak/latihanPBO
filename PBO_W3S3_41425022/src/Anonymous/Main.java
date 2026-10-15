/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anonymous;

/**
 *
 * @author ASUS
 */
public class Main extends Application {
    public static void main(String[] args) { launch(args);}
    @Override public void start(Stage stage)
    {
        Button button = new Button("Click Me");
        button.setOnAction(
        event
        ->System.out.println(
        "Button clicked!")); // Anonymous object melalui lamba
        
        StackPane root = new StackPane(button);
        stage.setScene(new Scene(root, 300, 200));
        stage.show();
    }
}
