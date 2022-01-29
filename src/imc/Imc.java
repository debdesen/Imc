package imc;

public class Imc {
	
	double calcularImc(int peso, double altura){
		
		double imc = peso/ (altura * altura);
			
		return imc;
		
	}
	
	void classificarImc(double imc) {
		if (imc<18.5) {
			System.out.println("imc = "+imc);
			System.out.println("Você está abaixo do peso");
		}
		else if (imc>=18.5 && imc<25) {
			System.out.println("imc = "+imc);
			System.out.println("Você está no peso ideal");
		}
		else if (imc>=25 && imc<30) {
			System.out.println("imc = "+imc);
			System.out.println("Cuidado! Você está com sobrepeso");
		}
		else if (imc>=30 && imc<35) {
			System.out.println("imc = "+imc);
			System.out.println("Cuidado! Você está com obesidade grau I");
		}
		else if (imc>=35 && imc<=40) {
			System.out.println("imc = "+imc);
			System.out.println("Cuidado! Você está com obesidade grau II");
		}
		else {
			System.out.println("imc = "+imc);
			System.out.println("Você está com obesidade grau III ou mórbida");
		}
	}

}
