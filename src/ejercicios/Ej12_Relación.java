package ejercicios;

public class Ej12_Relación {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 2;

		System.out.println(num4 == num2);
		System.out.println(num2 == num3);
		System.out.println(num1 != num3);
		System.out.println(num2 != num2);
		System.out.println(num4 < num3);
		System.out.println(num3 < num1);
		System.out.println(num1 > num3);
		System.out.println(num2 > num4);
		System.out.println(num2 > num3);
		System.out.println(num2 <= num3);
		System.out.println(num2 <= num4);
		System.out.println(num2 <= num1);
		System.out.println(num1 >= num2);
		System.out.println(num2 >= num1);
		System.out.println(num2 >= num2);		
	}

}
