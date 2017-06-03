package br.com.atividade;

import java.util.List;

public class ValoresITF {

	public static boolean ins(List<Integer> v) {
		if (v.size() <= 0 || v.size() > 10) {
			return false;
		} else {
			return true;
		}
	}

	public static int del(int i, List<Integer> v) {
		int valorRemovido = 0;
		if (v.size() > 0) {
			for (int indice = 0; indice < v.size(); indice++) {
				if (indice == i) {
					valorRemovido = v.get(indice);
					v.remove(indice);
				}
			}
		} else {
			valorRemovido = -1;
		}
		return valorRemovido;
	}

	public static int size(List<Integer> v) {
		int tamanhoLista = v.size();
		return tamanhoLista;
	}

	public static double mean(List<Integer> v) {
		double media = 0;
		double valorAcumulado = 0;
		if (v.size() == 0) {
			media = 0;
		} else {
			for (int i = 0; i < v.size(); i++) {
				double valorIndice = v.get(i);
				valorAcumulado = valorAcumulado + valorIndice;
			}

			media = valorAcumulado / v.size();
		}

		return media;
	}
	
	

	public static int greater(List<Integer> v) {
		int maiorValor = 0;

		if (v.size() == 0) {
			maiorValor = -1;
		} else {
			for (int i = 0; i < v.size(); i++) {

				int valorDoIndice = v.get(i);

				if (maiorValor < valorDoIndice) {
					maiorValor = valorDoIndice;
				}
			}
		}
		return maiorValor;
	}

	public static int lower(List<Integer> v) {
		int menorValor = greater(v);

		for (int i = 0; i < v.size(); i++) {

			if (menorValor > v.get(i)) {
				menorValor = v.get(i);
			}
		}
		return menorValor;
	}
}