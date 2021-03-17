public class Pedido {
    private int idPessoa;
    private int quantidade;
    private String situacaoPedido;

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String situacaoPedido() {
        return situacaoPedido;
    }

}
