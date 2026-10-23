package aula_0810_modificadoresacesso;
import java.util.Scanner;

public class ObjetoVeterinarioAnimal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Veterinario veterinario = new Veterinario();

		String nome, cor, tamanho, peso, raca;

		System.out.print("Insira nome: ");
		nome = ler.next();

		System.out.print("Insira cor: ");
		cor = ler.next();

		System.out.print("Insira tamanho: ");
		tamanho = ler.next();

		System.out.print("Insira peso: ");
		peso = ler.next();

		System.out.print("Insira raça: ");
		raca = ler.next();

		veterinario.cadastraAnimal(nome, cor, tamanho, peso, raca);

		Animal animal = veterinario.getAnimal();

		System.out.println(" ");
		System.out.println("---CADASTRANDO ANIMAL---");
		System.out.println(" ");

		System.out.println("Nome: " + animal.getNome());
		System.out.println("Cor: " + animal.getCor());
		System.out.println("Tamanho: " + animal.getTamanho());
		System.out.println("Peso: " + animal.getPeso());
		System.out.println("Raça: " + animal.getRaca());

		ler.close();
	}

}