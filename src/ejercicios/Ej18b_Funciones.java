package ejercicios;

public class Ej18b_Funciones {

	public static void main(String[] args) {
		
		login("user","1234");
		login("admin","1234");
		login("admin","0000");
	}
	
	public static void login(String user,String password) {
		if(user == "admin" && password == "1234") {
			 System.out.println("Login true");
		}
		else {
			 System.out.println("Login false");
		} 
	}
}
