package br.senac.br.aqs;

public class Calculadora {

	public long soma(int n1, int n2){
		return n1+n2;
	}
	
	public long subtrair(int n1, int n2){
		return n1 - n2;
	}
	
	public double divisao(int n1, int n2){
		return n1 / (float)n2;
	}

	public long multiplicacao (int n1, int n2){
		return n1 * n2;
	}
	
	
	public double exponenciacao(int base, int expoente){
		return Math.pow(base,expoente);
	}
	
	public int fatorial(int num){
		int total = 1;
		for(int i=num; i>1;i--){
			total *= i;
		}
		return total;
	}




	
}
