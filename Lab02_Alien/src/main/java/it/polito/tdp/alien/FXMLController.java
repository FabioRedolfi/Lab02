package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	AlienDictionary dizionario;
	

    public FXMLController() {
		dizionario = new AlienDictionary();
	}

	@FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtWord"
    private TextField txtWord; // Value injected by FXMLLoader

    @FXML // fx:id="btnTranslate"
    private Button btnTranslate; // Value injected by FXMLLoader

    @FXML // fx:id="txtResults"
    private TextArea txtResults; // Value injected by FXMLLoader

    @FXML // fx:id="btnClear"
    private Button btnClear; // Value injected by FXMLLoader
    
	@FXML
    void doTranslate(ActionEvent event) {
		String[] a = txtWord.getText().split(" ");
		if(a.length > 1) {
			for(int i=1; i<a.length; i++) 
				dizionario.addWord(a[0], a[i]);
			txtResults.setText("Parola aggiunta");
		}
		if(a.length == 1)
			txtResults.setText(dizionario.translateWord(a[0]));
		txtWord.clear();
    }
	
    @FXML
    void doReset(ActionEvent event) {
    	dizionario.dictionary.clear();
    	txtResults.clear();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResults != null : "fx:id=\"txtResults\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
