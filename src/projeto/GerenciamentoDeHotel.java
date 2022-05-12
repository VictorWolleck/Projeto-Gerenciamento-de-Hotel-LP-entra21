package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoDeHotel {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.lineSeparator());
		int situacao;

		/*
		 * ArrayList<Integer> roomName = new ArrayList<Integer>(); ArrayList<String>
		 * roomPosition = new ArrayList<String>(); ArrayList<Character> roomSmoker = new
		 * ArrayList<Character>(); ArrayList<Integer> roomCapacity = new
		 * ArrayList<Integer>(); ArrayList<Float> roomDailyRate = new
		 * ArrayList<Float>();
		 */

		ArrayList<String> clientName = new ArrayList<String>();
		ArrayList<String> clientBirthDate = new ArrayList<String>();
		ArrayList<String> clientEmail = new ArrayList<String>();
		ArrayList<String> clientPhone = new ArrayList<String>();
		ArrayList<String> clientCity = new ArrayList<String>();
		ArrayList<String> clientUF = new ArrayList<String>();
		ArrayList<String> clientSmoker = new ArrayList<String>();

		// quarto cadastro

		System.out.println("1- Cadastrar novo Cliente");
		System.out.println("0- Sair");
		situacao = sc.nextInt();

		// add novo quarto
		
		switch (situacao) {
		case 1:

			System.out.println("Insira o nome do cliente:");
			clientName.add(sc.next());

			System.out.println("Insira o e-mail cliente:");
			clientEmail.add(sc.next());

			System.out.println("Insira a data de nascimento do cliente:");
			clientBirthDate.add(sc.next());

			System.out.println("Insira o telefone do cliente:");
			clientPhone.add(sc.next());

			System.out.println("Insira a cidade do cliente:");
			clientCity.add(sc.next());

			System.out.println("Insira estado do cliente:");
			clientUF.add(sc.next());

			System.out.println("Cliente fumante? S/N:");
			clientSmoker.add(sc.next());

			break;

		case 2:

			System.out.println("Saiu");

			break;

		}
	}
}

/*
 * 
 * Olá,
 * 
 * Segue o desafio para quem deseja focar no desafio e vou direcionando o
 * conhecimento da disciplina.
 * 
 * Criar um sistema de hotel onde permita: Cadastrar, Editar, Listar e Excluir
 * Clientes; Cadastrar, Editar, Listar e Excluir Quartos; Verificar os quartos
 * disponíveis para alocação; Realizar o check-in e o check-out. O cadastro dos
 * quartos devem ter Nome, Posição, Fumante?, Valor da Diária, qtd quarto e
 * disponibilidade de pessoas por quarto. Já o cadastro dos clientes deverá
 * constar: Nome, data de nascimento, e-mail, telefone, cidade, UF e fumante?.
 * 
 * Escopo a ser abordado no trabalho: Uso de Arrays e Matrizes, Funções, Laços
 * de decisão e repetição, Estrutura de Dados Introdução a lógica de
 * programação.
 * 
 */