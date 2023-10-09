package att3;

public class Main {
	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		
		ProdutoX p = new ProdutoFilho("Arroz", 1.90);
		pedido.adicionarProduto(p);
		pedido.mostrarProdutos();
	}
}
