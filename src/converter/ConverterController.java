package converter;
/**
 * UI controller for events and initializing components.
 * @author Vichakorn
 */
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ConverterController {
	@FXML
	TextField textfield1;
	@FXML
	TextField textfield2;
	@FXML
	private ComboBox<Length> box1;
	@FXML
	private ComboBox<Length> box2;

	/**
	 * Convert a distance form one unit to another.
	 * 
	 *
	 */
	public void handleConvert(ActionEvent event) {
		String text1 = textfield1.getText().trim();
		String text2 = textfield2.getText().trim();
		Length unit1 = box1.getValue();
		Length unit2 = box2.getValue();
		if (!text1.isEmpty()) {
			try {
				Double num = Double.parseDouble(text1) * unit1.getValue();
				Double calculate = num / unit2.getValue();
				textfield2.setText(String.format("%.4g", calculate));
			} catch (NumberFormatException ex) {
				textfield1.setText("Plese input number");
			}
		} else {
			try {
				Double num = Double.parseDouble(text2) * unit2.getValue();
				Double calculate = num / unit1.getValue();
				textfield1.setText(String.format("%.4g", calculate));
			} catch (NumberFormatException ex) {
				textfield2.setText("Plese input number");
			}
		}

	}

	/**
	 * Clear text in textfield.
	 * 
	 */
	public void handleClear(ActionEvent event) {
		textfield1.clear();
		textfield2.clear();
	}
/**
 * set ComboBox for user to select 
 */
	@FXML
	public void initialize() {
		if (box1 != null) {
			box1.getItems().addAll(Length.values());
			box1.getSelectionModel().select(0);
		}
		if (box2 != null) {
			box2.getItems().addAll(Length.values());
			box2.getSelectionModel().select(1);
		}
	}

}
