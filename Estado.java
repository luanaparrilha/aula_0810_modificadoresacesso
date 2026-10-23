package aula_0810_modificadoresacesso;

public class Estado {
	private String estado;
	private String sigla;

	public Estado() {

	}

	public Estado(String estado, String sigla) {
		this.estado = estado;
		this.sigla = sigla;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}