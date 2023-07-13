package ejercicios;

public class Ej20_BucleColores {

	public static void main(String[] args) {
		
		String text = "HOLA MULTICOLOR";
				
		text = colorize(text);
		text = stylize(text);
		System.out.println(text);
		
	}
	
	public static String colorize(String text) {
		
		final String RED = "37;41m";
		final String YELLOW = "37;43m";
		final String MAGENTA = "37;45m";
		final String GREEN = "37;42m";
		final String BLUE = "37;44m";
		final String RESET = "\033[0m";
		
		int random = (int) (Math.random()*5);
		
		switch (random) {
		case 0:
			System.out.print("Rojo y ");
			return RED + text + RESET;

		case 1:
			System.out.print("Amarillo y ");
			return YELLOW + text + RESET;

		case 2:
			System.out.print("Magenta y ");
			return MAGENTA + text + RESET;

		case 3:
			System.out.print("Azul y ");
			return BLUE + text + RESET;

		case 4:
			System.out.print("Verde y ");
			return GREEN + text + RESET;

		}
		return "ERROR";
	}
	
public static String stylize(String text) {
		
		final String BOLD = "\033[1;";
		final String ITALIC = "\033[3;";
		final String UNDERLINE = "\033[4;";
		final String STRIKETHROUGH = "\033[9;";
		final String RESET = "\033[0m";
		
		int random = (int) (Math.random()*4);

		switch (random) {
		case 0:
			System.out.println("Negrita");
			return BOLD + text + RESET;

		case 1:
			System.out.println("Cursiva");
			return ITALIC + text + RESET;

		case 2:
			System.out.println("Subrayado");
			return UNDERLINE + text + RESET;

		case 3:
			System.out.println("Tachado");
			return STRIKETHROUGH + text + RESET;
		}
		return "ERROR";
	}
}
