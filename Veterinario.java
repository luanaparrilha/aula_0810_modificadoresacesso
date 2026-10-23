package aula_0810_modificadoresacesso;

class Veterinario {
	private String nome;
	private Animal animal;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public void cadastraAnimal(String nome, String cor, String tamanho, String peso, String raca) {
		animal = new Animal();
		animal.setNome(nome);
		animal.setCor(cor);
		animal.setTamanho(tamanho);
		animal.setPeso(peso);
		animal.setRaca(raca);

	}

}