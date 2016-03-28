package controller;

import domain.Domain;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

public class ApplicationController {

	private Domain domain;

	@FXML
	private TextField txtDolar;
	@FXML
	private TextField txtReal;
	@FXML
	private Label lblDolar;
	@FXML
	private Label lblReal;

	@FXML
	private void initialize() {
		domain = new Domain();

		StringConverter<Number> converter = new NumberStringConverter();

		Bindings.bindBidirectional(txtDolar.textProperty(), domain.dolarProperty(), converter);
		Bindings.bindBidirectional(txtReal.textProperty(), domain.realProperty(), converter);
	}

	@FXML
	private void handleSair() {
		Platform.exit();
	}

	@FXML
	private void hendleClear() {
		txtDolar.setText("0");
		txtReal.setText("0");

		handleCalcular();
	}

	@FXML
	private void handleCalcular() {
		lblDolar.setText("$ " + String.format("%.2f", realToDolar()));
		lblReal.setText("R$ " + String.format("%.2f", dolarToReal()));
	}

	private double dolarToReal() {
		return (domain.getDolar() == 0 || domain.getReal() == 0) ? 0 : (domain.getDolar() / domain.getReal());
	}
	
	private double realToDolar() {
		return domain.getDolar() * domain.getReal();
	}
}
