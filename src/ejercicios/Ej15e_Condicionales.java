package ejercicios;

public class Ej15e_Condicionales {

	public static void main(String[] args) {
				
		
		int maxLeaves = 20;
		final String GREEN = "\033[0;42m";
		final String BLACK = "\033[0;40m";
		final String RESET = "\033[0;0m";
		/* PRINT LEAVES */
		for (int currentLeaves = 2; currentLeaves < maxLeaves; currentLeaves += 2) {
			
			for (int blankSpace =  (maxLeaves - currentLeaves)/2; blankSpace > 0; blankSpace -= 1) {
				System.out.print(" ");				
			}
			for (int printLeaves = 1; printLeaves <= currentLeaves; printLeaves++) {
				System.out.print(GREEN+"*"+RESET);
			}
			for (int blankSpace =  (maxLeaves - currentLeaves)/2; blankSpace > 0; blankSpace -= 1) {
				if(blankSpace == 1) {
					System.out.println(" ");	
				}
				else {
				System.out.print(" ");	
				}				
			}			
		}
		/* PRINT TRUNK */
		for(int trunkLength = 2; trunkLength > 0; trunkLength--)
		{
			int trunkLeaves = (maxLeaves / 5);
			
			for (int blankSpace =  (maxLeaves - trunkLeaves)/2; blankSpace > 0; blankSpace -= 1) {
				System.out.print(" ");				
			}
			for (int printLeaves = 1; printLeaves <= trunkLeaves; printLeaves++) {
				
				System.out.print(BLACK+"*"+RESET);
			}
			for (int blankSpace =  (maxLeaves - trunkLeaves)/2; blankSpace > 0; blankSpace -= 1) {
				if(blankSpace == 1) {
					System.out.println(" ");	
				}
				else {
				System.out.print(" ");	
				}
			}
		}
	}
}
