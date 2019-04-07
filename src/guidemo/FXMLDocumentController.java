/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guidemo;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

/**
 *
 * @author ElberFunez
 */
public class FXMLDocumentController implements Initializable {
    //These items were for checkbox ex
    @FXML
    private Label pizzaOrderLabel;
    @FXML private CheckBox pepperoniCheckBox;
    @FXML private CheckBox pineappleCheckBox;
    @FXML private CheckBox baconCheckBox;
    
    // These items are for choicebox ex
    @FXML private ChoiceBox choiceBox;
    @FXML private Label choiceBoxLabel;
    
    public void pizzaOrderButtonPushed(){
        String order  =("Toppings are:");
        if(pepperoniCheckBox.isSelected()){
          order += "\n Pepperoni";
        }
          if(pineappleCheckBox.isSelected()){
          order += "\n Pineapple";
        }
            if(baconCheckBox.isSelected()){
          order += "\n Bacon";
        }
            this.pizzaOrderLabel.setText(order);
    }
    public void choiceBoxButtonPushed(){
        choiceBoxLabel.setText("My favorite fruit is : \n"+choiceBox.getValue().toString());
    }
   /* @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        pizzaOrderLabel.setText("Hello World!");
    }
    */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        pizzaOrderLabel.setText("");
        
        //These items are for configuring choiceBox ex
        choiceBoxLabel.setText("");
        choiceBox.getItems().add("apples");
        choiceBox.getItems().add("bananas");
        choiceBox.getItems().add("oranges");
        choiceBox.getItems().addAll("kiwi", "pears", "limes");
        choiceBox.setValue("apples");
    }    
    
}
