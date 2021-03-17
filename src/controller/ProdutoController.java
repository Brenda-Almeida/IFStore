package controller;

import Model.Produto;

public class ProdutoController {
	
	public boolean comprar(Produto produto) {
		return true;
	}
	
	public boolean addCarrinho(Produto produto) {
		return true;
	}
	
	public boolean alterarProduto(int idProduto) {
		return true;
	}
	
	public boolean excluirProduto(int idProduto) {
		return true;
	}
	
	public Produto getDadosProduto(int idProduto) {
		return new Produto();
	}
	
}
