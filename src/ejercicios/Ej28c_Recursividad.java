package ejercicios;

public class Ej28c_Recursividad {

	public static void main(String[] args) {
		Ej28c_Recursividad m = new Ej28c_Recursividad();
		
		int num1 = 0;
		int num2 = 1;
		
		m.fibonacci(num1,num2);
		
	}
	
	public void fibonacci(int num1,int num2){

		int nextNum;

		nextNum = num2 + num1;
		num1 = num2;
		num2 = nextNum;
		
		System.out.print(num1 + " ");
		if(num1 != 55) {
			fibonacci(num1,num2);
		}
		
	}

}
