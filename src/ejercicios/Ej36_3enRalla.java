package ejercicios;

import java.util.Scanner;

public class Ej36_3enRalla {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Player playerOne = new Player();
		Player playerTwo = new Player();

		int gameMode = chooseGameMode();
		boolean nombresCorrectos = false;

		System.out.println("Has elegido: " + gameMode);

		nameSelection(gameMode, playerOne, playerTwo);

		if (gameMode != 3) {
			do {

				if (playerTwo.nombreCompleto != "CPU2") {
					System.out.println("\033[1;42m Jugador 1: " + playerOne.nombreCompleto + " \033[0m");
					System.out.println("\033[1;43m Jugador 2: " + playerTwo.nombreCompleto + " \033[0m");
					System.out
							.println("Pulsa enter para continuar. Introduce cualquier valor para cambiar los nombres");
				} else {
					System.out.println("\033[1;42m Jugador 1: " + playerOne.nombreCompleto + " \033[0m");
					System.out.print("Pulsa enter para continuar. Introduce cualquier valor para cambiar el nombre.");
				}

				if (sc.nextLine().length() == 0) {
					nombresCorrectos = true;
				} else {
					nameSelection(gameMode, playerOne, playerTwo);
				}

			} while (!nombresCorrectos);
		}
		System.out.println(
				"\033[1;46m " + playerOne.nombreCompleto + "(X) vs " + playerTwo.nombreCompleto + "(O) \033[0m");

		playGame(playerOne.nombreCompleto, playerTwo.nombreCompleto);

	}

	public static int chooseGameMode() {
		int num = 0;
		boolean answeredCorrectly = false;

		do {
			System.out.println("1. Humano contra humano");
			System.out.println("2. Humano contra CPU");
			System.out.println("3. CPU contra CPU");
			System.out.print("Elige modo de juego: ");
			if (sc.hasNextInt()) {
				num = sc.nextInt();
				sc.nextLine();
				if (num >= 1 && num <= 3) {
					answeredCorrectly = true;
				} else {
					System.out.println("\033[1;41m Por favor introduce un numero del 1 al 3 \033[0m");
				}
			} else {
				sc.nextLine();
				System.out.println("\033[1;41m Por favor introduce un numero del 1 al 3 \033[0m");
			}
		} while (!answeredCorrectly);

		return num;
	}

	public static void nameSelection(int gameMode, Player playerOne, Player playerTwo) {

		switch (gameMode) {
		case 1:
			System.out.println("\033[1;42m Jugador 1 \033[0m");
			System.out.print("Nombre: ");
			playerOne.nombre = sc.nextLine();
			System.out.print("Primer apellido: ");
			playerOne.apellido1 = sc.nextLine();
			System.out.print("Segundo apellido: ");
			playerOne.apellido2 = sc.nextLine();
			playerOne.nombreCompleto();
			System.out.println("\033[1;43m Jugador 2 \033[0m");
			System.out.print("Nombre: ");
			playerTwo.nombre = sc.nextLine();
			System.out.print("Primer apellido: ");
			playerTwo.apellido1 = sc.nextLine();
			System.out.print("Segundo apellido: ");
			playerTwo.apellido2 = sc.nextLine();
			playerTwo.nombreCompleto();
			break;
		case 2:
			System.out.println("\033[1;42m Jugador 1 \033[0m");
			System.out.print("Nombre: ");
			playerOne.nombre = sc.nextLine();
			System.out.print("Primer apellido: ");
			playerOne.apellido1 = sc.nextLine();
			System.out.print("Segundo apellido: ");
			playerOne.apellido2 = sc.nextLine();
			playerOne.nombreCompleto();
			playerTwo.nombreCompleto = "CPU2";
			break;
		case 3:
			playerOne.nombreCompleto = "CPU1";
			playerTwo.nombreCompleto = "CPU2";
			break;
		}
	}

	public static void playGame(String playerOne, String playerTwo) {
		boolean turnCompleted;
		String currentPlayer = playerOne;
		String winner = "";
		int x = 0;
		int y = 0;
		char[][] tablero = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		for (int i = 0; i < tablero.length; i++) {
			System.out.println("---------------");
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print("| " + tablero[i][j] + " |");
			}
			System.out.println();
		}
		System.out.println("---------------");
		do {

			if (currentPlayer.toString() == "CPU1" || currentPlayer.toString() == "CPU2") {

				x = (int) (Math.random() * 3);
				y = (int) (Math.random() * 3);

			} else {

				System.out.println(currentPlayer + ", ingresa coordenadas (x,y) para colocar la pieza.");
				System.out.print("Coordeanda x:");
				x = sc.nextInt();
				sc.nextLine();
				System.out.print("Coordeanda y:");
				y = sc.nextInt();
				sc.nextLine();
			}

			turnCompleted = checkIfValidMove(tablero, currentPlayer, playerOne, playerTwo, winner, x, y);

			if (turnCompleted) {
				winner = checkIfWinner(tablero, currentPlayer);
				currentPlayer = (currentPlayer == playerOne) ? playerTwo : playerOne;

				for (int i = 0; i < tablero.length; i++) {
					System.out.println("---------------");
					for (int j = 0; j < tablero[i].length; j++) {
						System.out.print("| " + tablero[i][j] + " |");
					}
					System.out.println();
				}
				System.out.println("---------------");
			}

		} while (winner == "");

		if (winner == "DRAW") {
			System.out.println("Game ended in a draw");
			System.out.println("Press enter to play again");
			sc.nextLine();
			String[] args = {};
			Ej36_3enRalla.main(args);
		} else {
			System.out.println("The winner is: " + winner);
			System.out.println("Press enter to play again");
			sc.nextLine();
			String[] args = {};
			Ej36_3enRalla.main(args);
		}
	}

	public static boolean checkIfValidMove(char[][] tablero, String currentPlayer, String playerOne, String playerTwo,
			String winner, int x, int y) {
		if (tablero[x][y] == ' ') {
			System.out.println(currentPlayer + " moves to " + x + " " + y);
			if (currentPlayer == playerOne) {
				tablero[x][y] = 'X';
			} else {
				tablero[x][y] = 'O';
			}
			return true;
		} else {
			if (currentPlayer.toString() != "CPU1" && currentPlayer.toString() != "CPU2") {
				System.out.println("\033[1;41m Casilla ocupada, por favor introduce otra casilla. \033[0m ");
			}
			return false;
		}
	}

	public static String checkIfWinner(char[][] tablero, String currentPlayer) {
		for (int i = 0; i < tablero.length; i++) {
			if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][2] != ' ') {
				return currentPlayer;
			}
		}
		for (int i = 0; i < tablero.length; i++) {
			if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i] && tablero[2][i] != ' ') {
				return currentPlayer;
			}
		}
		for (int i = 0; i < tablero.length; i++) {
			if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[2][2] != ' ') {
				return currentPlayer;
			}
		}
		for (int i = 0; i < tablero.length; i++) {
			if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[2][0] != ' ') {
				return currentPlayer;
			}
		}
		int drawCounter = 0;
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j] != ' ') {
					drawCounter++;
					if (drawCounter == 9) {
						return "DRAW";
					}
				}
			}
		}
		return "";
	}

	public static class Player {
		private String nombre;
		private String apellido1;
		private String apellido2;
		private String nombreCompleto;

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido1() {
			return apellido1;
		}

		public void setApellido1(String apellido1) {
			this.apellido1 = apellido1;
		}

		public String getApellido2() {
			return apellido2;
		}

		public void setApellido2(String apellido2) {
			this.apellido2 = apellido2;
		}

		public Player(String nombre, String apellido1, String apellido2) {
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
		}

		public void nombreCompleto() {
			this.nombreCompleto = this.nombre + (this.nombre.length() > 0 && this.apellido1.length() > 0 ? " " : "")
					+ this.apellido1 + ((this.apellido1.length() > 0 && this.apellido2.length() > 0)
							|| (this.nombre.length() > 0 && this.apellido2.length() > 0) ? " " : "")
					+ this.apellido2;
		}

		public Player() {
		}
	}
}
