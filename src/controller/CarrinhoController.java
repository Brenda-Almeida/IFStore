package controller;

import java.util.ArrayList;
import Model.Produto;

public class CarrinhoController {
	
	public boolean comprar(ArrayList<Produto> produtos) {
		return true;
	}
	
	public boolean removerProduto(Produto produto) {
		return true;
	}
	
	public ArrayList<Produto> listarProdutosCarrinho(){
    	return new ArrayList<Produto>();
    }
}
