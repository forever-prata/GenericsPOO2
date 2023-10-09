package unboundedWild;

public class Caixa<T> {
	private T conteudo;

	public Caixa(T conteudo) {
		super();
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Caixa [conteudo=");
		builder.append(conteudo);
		builder.append("]");
		return builder.toString();
	}

}
