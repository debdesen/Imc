package imc;

import java.util.Scanner;

public class Resultado {
	void executar() {

		Scanner leitor = new Scanner(System.in);
		Imc imc = new Imc();

		System.out.println("Digite seu peso:");
		int pesoDoUsuario = leitor.nextInt();

		System.out.println("Digite sua altura:");
		double alturaDoUsuario = leitor.nextDouble();

		double valorImc = imc.calcularImc(pesoDoUsuario, alturaDoUsuario);
		System.out.println(valorImc);

		imc.classificarImc(valorImc);

		leitor.close();
	}
}
