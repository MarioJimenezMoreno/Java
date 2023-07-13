package ejercicios;

public class Ej19_Colores {

	public static void main(String[] args) {

		final String RED = "\033[0;41m";
		final String YELLOW = "\033[0;43m";
		final String BLACK = "\033[0;40m";
		final String WHITE = "\033[0;47m";
		final String BLUE = "\033[0;44m";
		final String RESET = "\033[0;0m";
		final String NEGRITA = "\033[1;";
		final String SUBRAYADO = "4;";
		final String WHITE_L = "37;";
		final String GREEN = "42m";
		
		basicFlagCreator(5,30,BLUE);
		basicFlagCreator(4,30,YELLOW);
		
		textFormater(GREEN,WHITE_L,NEGRITA,SUBRAYADO);
		System.out.println("UCRAINA");	
		cleanFormat(RESET);
		
		complexFlagCreator(1,4,BLUE,2,WHITE,4,BLUE,20,BLUE);
		complexFlagCreator(1,4,BLUE,2,WHITE,4,BLUE,20,WHITE);
		complexFlagCreator(1,10,WHITE,20,BLUE,0,null,0,null);
		complexFlagCreator(1,4,BLUE,2,WHITE,4,BLUE,20,WHITE);
		complexFlagCreator(1,4,BLUE,2,WHITE,4,BLUE,20,BLUE);
		basicFlagCreator(1,30,WHITE);
		basicFlagCreator(1,30,BLUE);
		basicFlagCreator(1,30,WHITE);
		basicFlagCreator(1,30,BLUE);
		
		textFormater(GREEN,WHITE_L,NEGRITA,SUBRAYADO);
		System.out.println("GRECIA");	
		cleanFormat(RESET);
		
		complexFlagCreator(9,10,BLUE,10,WHITE,10,RED,0,null);
		
		textFormater(GREEN,WHITE_L,NEGRITA,SUBRAYADO);
		System.out.println("FRANCIA");	
		cleanFormat(RESET);
		
		basicFlagCreator(2,30,RED);
		basicFlagCreator(5,30,YELLOW);
		basicFlagCreator(2,30,RED);
		
		textFormater(GREEN,WHITE_L,NEGRITA,SUBRAYADO);
		System.out.println("ESPANA");		
		cleanFormat(RESET);
		
		basicFlagCreator(1,30,YELLOW);
		basicFlagCreator(1,30,RED);
		basicFlagCreator(1,30,YELLOW);
		basicFlagCreator(1,30,RED);
		basicFlagCreator(1,30,YELLOW);
		basicFlagCreator(1,30,RED);
		basicFlagCreator(1,30,YELLOW);
		basicFlagCreator(1,30,RED);
		basicFlagCreator(1,30,YELLOW);
		
		textFormater(GREEN,WHITE_L,NEGRITA,SUBRAYADO);
		System.out.println("CATALUNYA");	
		cleanFormat(RESET);
		
		basicFlagCreator(3,30,BLACK);
		basicFlagCreator(3,30,RED);
		basicFlagCreator(3,30,YELLOW);
		
		textFormater(GREEN,WHITE_L,NEGRITA,SUBRAYADO);
		System.out.println("ALEMANIA");	
		cleanFormat(RESET);
	}
	
	public static void basicFlagCreator(int verticalRep, int horizontalRep, String COLOR) {
		while (verticalRep > 0){
			
			int repeat = horizontalRep;
			
			while (repeat > 0) {
				System.out.print(COLOR+" ");
				repeat--;
			}
			System.out.println("");
			verticalRep--;
		}
	}
	public static void complexFlagCreator(int reps,int h1,String c1,int h2,String c2,int h3,String c3,int h4,String c4)
		{
			if(h1+h2+h3+h4 != 30) {
				System.out.println("Las columnas han de sumar un total de 30");				
			}
			else {
				for (int j = 0; j < reps; j++) {					
				
					for (int i = 0; i < h1; i++) {
						System.out.print(c1+" ");
					}
					if (c2 != null) {
						for (int i = 0; i < h2; i++) {
							System.out.print(c2+" ");
						}
					}
					if (c3 != null) {
						for (int i = 0; i < h3; i++) {
							System.out.print(c3+" ");
						}
					}
					if (c4 != null) {
						for (int i = 0; i < h4; i++) {
							System.out.print(c4+" ");
						}		
					}
					System.out.println("");
				}
			}
		}
	
	public static void textFormater(String c1,String c2,String f1,String f2) {
	System.out.print(f1+f2+c2+c1);	
	}
	public static void cleanFormat(String r) {
		System.out.print(r);
	}
	}
