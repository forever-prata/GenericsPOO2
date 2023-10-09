package att2;

import java.util.Date;

public class Produto<T> {
	private T id;
	private double valor;
	private Date dataFab;
	private Date dataVenc;
	
	public Produto(T id, double valor, Date dataFab, Date dataVenc) {
		super();
		this.id = id;
		this.valor = valor;
		this.dataFab = dataFab;
		this.dataVenc = dataVenc;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getDataFab() {
		return dataFab;
	}

	public void setDataFab(Date dataFab) {
		this.dataFab = dataFab;
	}

	public Date getDataVenc() {
		return dataVenc;
	}

	public void setDataVenc(Date dataVenc) {
		this.dataVenc = dataVenc;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [id=");
		builder.append(id);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", dataFab=");
		builder.append(dataFab);
		builder.append(", dataVenc=");
		builder.append(dataVenc);
		builder.append("]");
		return builder.toString();
	}
	
}
