package aula_0810_modificadoresacesso;

public class Cidade {
	private String cidade;
	private Estado estado;

	public Cidade() {

	}

	public Cidade(String cidade, Estado estado) {
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}