package br.com.projeto.jonathan.dao;

import java.util.Random;

public class GeradorCpf {

	public String geraCPF() {
		int numero1 = 0, numero2 = 0, resto = 0;
		String resultado;
		String numeros;
		String numeroGerado;

		Random numeroAleatorio = new Random();

		// numeros gerados
		int n1 = numeroAleatorio.nextInt(10);
		int n2 = numeroAleatorio.nextInt(10);
		int n3 = numeroAleatorio.nextInt(10);
		int n4 = numeroAleatorio.nextInt(10);
		int n5 = numeroAleatorio.nextInt(10);
		int n6 = numeroAleatorio.nextInt(10);
		int n7 = numeroAleatorio.nextInt(10);
		int n8 = numeroAleatorio.nextInt(10);
		int n9 = numeroAleatorio.nextInt(10);
		int soma = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;
		int valor = (soma / 11) * 11;
		numero1 = soma - valor;

		// Primeiro resto da divisão por 11.
		resto = (numero1 % 11);
		if (numero1 < 2) {
			numero1 = 0;
		} else {
			numero1 = 11 - resto;
		}
		int soma2 = numero1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;
		int valor2 = (soma2 / 11) * 11;
		numero2 = soma2 - valor2;

		// Primeiro resto da divisão por 11.
		resto = (numero2 % 11);
		if (numero2 < 2) {
			numero2 = 0;
		} else {
			numero2 = 11 - resto;
		}

		// Conctenando os numeros
		numeros = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) + "." + String.valueOf(n4)
				+ String.valueOf(n5) + String.valueOf(n6) + "." + String.valueOf(n7) + String.valueOf(n8)
				+ String.valueOf(n9) + "-";

		// Concatenando o primeiro resto com o segundo.
		resultado = String.valueOf(numero1) + String.valueOf(numero2);
		numeroGerado = numeros + resultado;

		return numeroGerado;
	}
}