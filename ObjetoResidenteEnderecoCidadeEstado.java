package aula_0810_modificadoresacesso;

public class ObjetoResidenteEnderecoCidadeEstado {

	public static void main(String[] args) {

		Estado estado1 = new Estado("São Paulo", "SP");
		Cidade cidade1 = new Cidade("São Paulo", estado1);
		Endereco endereco1 = new Endereco("Av. Paulista", 1000, "Bela Vista", "01310-100", cidade1);

		System.out.println("-----CADASTRANDO RESIDENTE-----");
		
		System.out.println("Estado: " + estado1.getEstado());
		System.out.println("Sigla: " + estado1.getSigla());
		
		System.out.println("Cidade: " + cidade1.getCidade());
		
		System.out.println("Rua: " + endereco1.getRua());
		System.out.println("Número: " + endereco1.getNumero());
		System.out.println("Bairro: " + endereco1.getBairro());
		System.out.println("CEP: " + endereco1.getCEP());
		
	}

}