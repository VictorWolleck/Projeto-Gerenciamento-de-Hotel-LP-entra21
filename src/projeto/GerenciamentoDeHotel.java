package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoDeHotel {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.lineSeparator());
		int choice;
		int choiceClientOrRomm = 0;
		ArrayList<Integer> roomName = new ArrayList<Integer>();
		ArrayList<String> roomPosition = new ArrayList<String>();
		ArrayList<String> roomSmoker = new ArrayList<String>();
		ArrayList<Integer> roomCapacity = new ArrayList<Integer>();
		ArrayList<Float> roomDailyRate = new ArrayList<Float>();

		ArrayList<String> clientName = new ArrayList<String>();
		ArrayList<String> clientBirthDate = new ArrayList<String>();
		ArrayList<String> clientEmail = new ArrayList<String>();
		ArrayList<String> clientPhone = new ArrayList<String>();
		ArrayList<String> clientCity = new ArrayList<String>();
		ArrayList<String> clientUF = new ArrayList<String>();
		ArrayList<String> clientSmoker = new ArrayList<String>();

		// menu inicial

		System.out.println("1- Cadastrar novo Cliente/Quarto");
		System.out.println("2- Editar e Excluir Cliente/Quarto");
		System.out.println("3- Listar Clientes/Quartos");
		System.out.println("4- Realizar Check-in/Check-out");
		System.out.println("0- Sair");
		choice = sc.nextInt();

		switch (choice) {

		case 1: // 1- Cadastrar novo Cliente/Quarto

			System.out.println("1- Cadastrar Cliente");
			System.out.println("2- Cadastrar Quarto");
			System.out.println("0- Retornar");

			choiceClientOrRomm = sc.nextInt();

			switch (choiceClientOrRomm) {

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

				System.out.println("Cliente Cadastrado!");

				break;

			case 2:
				System.out.println("Insira o nome do quarto:");
				roomName.add(sc.nextInt());

				System.out.println("Insira o e-mail cliente:");
				roomPosition.add(sc.next());

				System.out.println("Insira a data de nascimento do cliente:");
				roomSmoker.add(sc.next());

				System.out.println("Insira o telefone do cliente:");
				roomCapacity.add(sc.nextInt());

				System.out.println("Insira a cidade do cliente:");
				roomDailyRate.add(sc.nextFloat());

			case 0:
				System.out.println("Retornando");
				break;

			default:
				System.out.println("Opção Inválida!");

			}

		case 2: // 2- Editar e Excluir Cliente/Quarto
			
		case 3: // 3- Listar Clientes/Quartos

			
			System.out.println("1- Listar Clientes");
			System.out.println("2- Listar Quartos");
			System.out.println("0- Retornar");
			int listClientsOrRooms = sc.nextInt();
			switch (listClientsOrRooms) {

			case 1:
				System.out.println(clientName.toString()); 
				return;

			case 2:
				System.out.println(roomName.toString());

			case 0:
				System.out.println("Retornando");
				break;

			default:
				System.out.println("Opção Inválida!");

			}

		case 4: // 4- Realizar Check-in/Check-out
		case 0: // 0- Sair

			System.out.println("Saiu");

			break;

		}
	}
}

/*
 *
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