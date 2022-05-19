package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoDeHotel {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.lineSeparator());

		// variáveis
		int choice;
		int choiceClientOrRoom;
		int listClientsOrRooms;
		int editExcludeClientsOrRooms;
		String clientEditing;
		String clientExcluding;
		String roomEditing;
		String roomExcluding;
		int clientExcludingIndex;
		int roomExcludingIndex;

		ArrayList<String> roomName = new ArrayList<String>();
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
		do {
			System.out.println("***| Sistema De Gerenciamento De Hotel |***");
			System.out.println("");
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

				choiceClientOrRoom = sc.nextInt();

				switch (choiceClientOrRoom) {

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
					System.out.println("");

					break;

				case 2:
					System.out.println("Insira o nome do quarto:");
					roomName.add(sc.next());

					System.out.println("Insira a posição do quarto");
					roomPosition.add(sc.next());

					System.out.println("O quarto aceita fumantes?S/N:");
					roomSmoker.add(sc.next());

					System.out.println("Insira a capacidade do quarto:");
					roomCapacity.add(sc.nextInt());

					System.out.println("Insira a diária do quarto:");
					roomDailyRate.add(sc.nextFloat());
					break;

				case 0:
					System.out.println("Retornando!");
					System.out.println("");
					break;

				default:
					System.out.println("Opção Inválida!");
					System.out.println("");
					break;
				}
				break;
			case 2: // 2- Editar e Excluir Cliente/Quarto

				System.out.println("1- Editar Cliente");
				System.out.println("2- Excluir Cliente");
				System.out.println("3- Editar Quarto");
				System.out.println("4- Excluir Quarto");
				System.out.println("0- Retornar");

				editExcludeClientsOrRooms = sc.nextInt();

				switch (editExcludeClientsOrRooms) {

				case 1:
					System.out.println("Qual Cliente deseja editar?");
					System.out.println(clientName.toString());
					clientEditing = sc.next();
					clientName.indexOf(clientEditing);

					break;
				case 2:
					System.out.println("Qual Cliente deseja excluir?");
					System.out.println(clientName.toString());

					clientExcluding = sc.next();
					clientExcludingIndex = clientName.indexOf(clientExcluding);

					System.out.println(clientExcludingIndex);

					clientName.remove(clientExcludingIndex);
					clientBirthDate.remove(clientExcludingIndex);
					clientEmail.remove(clientExcludingIndex);
					clientPhone.remove(clientExcludingIndex);
					clientCity.remove(clientExcludingIndex);
					clientUF.remove(clientExcludingIndex);
					clientSmoker.remove(clientExcludingIndex);

					break;
				case 3:

					break;
				case 4:
					System.out.println("Qual Quarto deseja excluir?");
					System.out.println(roomName.toString());

					roomExcluding = sc.next();
					roomExcludingIndex = roomName.indexOf(roomExcluding);

					roomName.remove(roomExcludingIndex);
					roomPosition.remove(roomExcludingIndex);
					roomSmoker.remove(roomExcludingIndex);
					roomCapacity.remove(roomExcludingIndex);
					roomDailyRate.remove(roomExcludingIndex);

					break;
				case 0:
					System.out.println("Retornando!");
					System.out.println("");
					break;

				default:
					System.out.println("Opção Inválida!");
					System.out.println("");
					break;

				}
				break;
			case 3: // 3- Listar Clientes/Quartos

				System.out.println("1- Listar Clientes");
				System.out.println("2- Listar Quartos");
				System.out.println("0- Retornar");

				listClientsOrRooms = sc.nextInt();

				switch (listClientsOrRooms) {

				case 1:
					System.out.println(clientName.toString());
					break;

				case 2:
					System.out.println(roomName.toString());
					break;
				case 0:
					System.out.println("Retornando!");
					System.out.println("");
					break;

				default:
					System.out.println("Opção Inválida!");
					System.out.println("");
					break;
				}
				break;
			case 4: // 4- Realizar Check-in/Check-out
				break;

			case 0: // 0- Sair

				System.out.println("Saiu!");
				System.out.println("");

				return;

			default:
				System.out.println("Opção Inválida!");
				System.out.println("");
				break;
			}
		} while (true);
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