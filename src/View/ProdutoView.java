package View;

import java.awt.Button;
import java.awt.Image;
import java.awt.Label;

public class ProdutoView {
	public Label labelNomeProduto;
	public Image imagemProduto;
	public Label labelPreco;
	public Label labelDescricao;
	public Button btnComprar;
	public Button btnAddCarrinho;
	private Button btnAlterarProduto;
	private Button btnExcluirProduto;

	public void botaoComprarClick() {
	}

	public void botaoAddCarrinhoClick() {
	}

	public void botaoAlterarProdutoClick() {
	}

	public void botaoExcluirProdutoClick() {
	}

	public Button getBtnAlterarProduto() {
		return btnAlterarProduto;
	}

	public void setBtnAlterarProduto(Button btnAlterarProduto) {
		this.btnAlterarProduto = btnAlterarProduto;
	}

	public Button getBtnExcluirProduto() {
		return btnExcluirProduto;
	}

	public void setBtnExcluirProduto(Button btnExcluirProduto) {
		this.btnExcluirProduto = btnExcluirProduto;
	}

}
