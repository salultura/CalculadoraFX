package br.com.profsalu.calc.controller;

import br.com.profsalu.calc.model.Calculadora;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class CalcController {

	@FXML
	private Text output;
	private String operacao = "";
	private long num1 = 0;
	private boolean start = true;

	Calculadora calc = new Calculadora();

	@FXML
	private void processNumPad(ActionEvent event) {
		if(start){
			output.setText("");
			start = false;
		}
		
		String valor = ((Button) event.getSource()).getText();

		output.setText(output.getText() + valor);
		
		calc.tocar();
	}

	@FXML
	private void processOperator(ActionEvent event) {
		String valor = ((Button) event.getSource()).getText();

		if (!"=".equals(valor)) {
			if (!operacao.isEmpty())
				return;
			
				
			operacao = valor;			
			num1 = Long.parseLong(output.getText());
			output.setText("");
			
		} else {
			if(operacao.isEmpty())
				return;
			
			
			output.setText(String.valueOf(calc.calcular(num1, Long.parseLong(output.getText()), operacao)));
			operacao = "";
			start = true;
		}
		
		calc.tocar();
	}
}
