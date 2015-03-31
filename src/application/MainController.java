package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainController implements Initializable {
	Stage parent;
	boolean question1 = false;
	boolean question2 = false;
	boolean question3 = false;
	boolean question4 = false;
	@FXML
	private Button uitslag;
	@FXML
	private RadioButton a1;
	@FXML
	private ImageView pic1;
	@FXML
	private ImageView pic2;
	@FXML
	private RadioButton a2;
	@FXML
	private ImageView pic3;
	@FXML
	private ImageView pic4;
	@FXML
	private RadioButton a3;
	@FXML
	private RadioButton a4;
	@FXML
	private Label antwoord1;
	@FXML
	private Label antwoord2;
	@FXML
	private Label antwoord3;
	@FXML
	private Label antwoord4;
	// Event Listener on Button[#uitslag].onAction
	@FXML
	public void uitslag(ActionEvent event) {
		if (question1){antwoord1.setText("niet kleurenblind");
	}
		else{antwoord1.setText("wel kleurenblind");}
		if (question2){antwoord2.setText("niet kleurenblind");
		}
			else{antwoord2.setText("wel kleurenblind");}
		if (question3){antwoord3.setText("niet kleurenblind");
		}
			else{antwoord3.setText("wel kleurenblind");}
		if (question4){antwoord4.setText("niet kleurenblind");
		}
			else{antwoord4.setText("wel kleurenblind");}
	}
	// Event Listener on RadioButton[#a1].onAction
	@FXML
	public void a1(ActionEvent event) {
			question1 = true;
			System.out.println("true");

	}
	// Event Listener on RadioButton[#a2].onAction
	@FXML
	public void a2(ActionEvent event) {
			question2 = true;
			System.out.println("true");

	}
	// Event Listener on RadioButton[#a3].onAction
	@FXML
	public void a3(ActionEvent event) {
			question3 = true;
			System.out.println("true");

	}
	// Event Listener on RadioButton[#a4].onAction
	@FXML
	public void a4(ActionEvent event) {
			question4 = true;
			System.out.println("true");
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		pic1.setImage(new Image("/images/74.png"));
		pic2.setImage(new Image("/images/42.png"));
		pic3.setImage(new Image("/images/6.png"));
		pic4.setImage(new Image("/images/2.png"));
		
	}
public void setParent(Stage stage){
		
		this.parent = stage;
	}
}
