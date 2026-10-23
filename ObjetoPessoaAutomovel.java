package aula_0810_modificadoresacesso;
import java.util.Scanner;

public class ObjetoPessoaAutomovel {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		
		String nome, cor;
		int velocidade;
		
		System.out.print("Informe nome do veículo: ");
		nome = ler.next();
		
		System.out.print("Informe cor do veículo: ");
		cor = ler.next();
		
		System.out.print("Informe velocidade do veículo: ");
		velocidade = ler.nextInt();
		
		pessoa.compraCarro(nome, cor, velocidade);
		
		Automovel carro = pessoa.getAutomovel();
		
		System.out.println(" ");
		System.out.println("---CADASTRANDO COMPRA---");
		System.out.println(" ");
		
		System.out.println("Carro adquirido: " + carro.getNome());
		System.out.println("Cor escolhida: " + carro.getCor());
		System.out.println("Velocidade correspondente: " + carro.getVelocidade());
		
		ler.close();
	}

}