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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

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
    
       // These are for combobox
    @FXML private ComboBox comboBox;
    @FXML private Label comboBoxLabel;
    
    //These are for radiobutton
    @FXML private RadioButton phpRadioButton;
    @FXML private RadioButton javaRadioButton;
    @FXML private RadioButton pythonRadioButton;
    @FXML private RadioButton cRadioButton;
    @FXML private Label radioButtonLabel;
    private ToggleGroup favLangToggleGroup;

    
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
    // This class will update combobox label
    public void comboBoxWasUpdated(){
        this.comboBoxLabel.setText("Course selected: \n"+ comboBox.getValue().toString());
       
    }
    //This class will show radioButton choice
    public void radioButtonLabelShow(){
        if(this.favLangToggleGroup.getSelectedToggle().equals(this.cRadioButton)){
            radioButtonLabel.setText("The Selected Item is C++");
        }
         if(this.favLangToggleGroup.getSelectedToggle().equals(this.javaRadioButton)){
            radioButtonLabel.setText("The Selected Item is Java");
        }
          if(this.favLangToggleGroup.getSelectedToggle().equals(this.phpRadioButton)){
            radioButtonLabel.setText("The Selected Item is PHP");
        }
           if(this.favLangToggleGroup.getSelectedToggle().equals(this.pythonRadioButton)){
            radioButtonLabel.setText("The Selected Item is Python");
        }
    }
   
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
        
        //these items are for configuring combobox
        comboBoxLabel.setText("");
        comboBox.getItems().add("COMP1030");
        comboBox.getItems().addAll("COMP1569", "COMPARCH654");
        
        //these items are for radio button config
        radioButtonLabel.setText("");
        favLangToggleGroup = new ToggleGroup();
        this.cRadioButton.setToggleGroup(favLangToggleGroup);
        this.javaRadioButton.setToggleGroup(favLangToggleGroup);
        this.phpRadioButton.setToggleGroup(favLangToggleGroup);
        this.pythonRadioButton.setToggleGroup(favLangToggleGroup);
        
    }    
    
}
