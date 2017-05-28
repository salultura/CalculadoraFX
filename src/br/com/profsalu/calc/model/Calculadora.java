package br.com.profsalu.calc.model;

import javafx.scene.media.AudioClip;

public class Calculadora {

	AudioClip som = new AudioClip(this.getClass().getResource("/sound/JX3P - ChorusSawStab-A7.wav").toExternalForm());		
	
	public long calcular(long num1, long num2, String operacao) {
		switch (operacao) {
		case "+":
			return num1 + num2;
		case "-":
			return num1 - num2;
		case "*":
			return num1 * num2;
		case "/":
			if (num2 == 0) {
				return 0;
			}

			return num1 / num2;

		}

		System.out.println("Operador desconhecido - " + operacao);
		return 0;
	}
	
	public void tocar(){
		som.play();
	}
}
