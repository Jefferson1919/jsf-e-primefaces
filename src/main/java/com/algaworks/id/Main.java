package com.algaworks.id;

public class Main {

	public static void main(String[] args) {
		//as tres linhas seguintes podem se configurar como injecoes de dependendencia
		Pedidos pedidos = new Pedidos();
		RelatorioService relatorioService = new RelatorioService();
		//relatorioService.setPedidos(pedidos);
	}
}
