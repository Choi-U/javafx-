package application;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class gradeController implements Initializable {

	@FXML Button btnSum,btnAvg,btnClose;
	@FXML TextField txtName,txtKor,txtEng,txtSum,txtAvg;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	
	public void btnSumAction(ActionEvent event) {
		int Kor = Integer.parseInt(txtKor.getText());
		int Eng = Integer.parseInt(txtEng.getText());
		gradeModel model=new gradeModel();
		int Sum=model.GradeSum(Kor,Eng);
		txtSum.setText(String.valueOf(Sum));
	}
	public void btnAvgAction(ActionEvent event) {
		int Kor = Integer.parseInt(txtKor.getText());
		int Eng = Integer.parseInt(txtEng.getText());
		gradeModel model=new gradeModel();
		int Avg=model.GradeAvg(Kor,Eng);
		txtAvg.setText(String.valueOf(Avg));
	}
	public void btnCloseAction(ActionEvent event) {
		Stage stage=(Stage)btnClose.getScene().getWindow();
		stage.close();
		}
}
