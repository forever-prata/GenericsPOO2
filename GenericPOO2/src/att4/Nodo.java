package att4;

public class Nodo<T> {
	private String chave;
	private T valor;
	
	public Nodo(String chave, T valor) {
		super();
		this.chave = chave;
		this.valor = valor;
	}
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public T getValor() {
		return valor;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nodo [chave=");
		builder.append(chave);
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}
	
}
