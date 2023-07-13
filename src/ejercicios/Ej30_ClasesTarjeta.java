package ejercicios;

public class Ej30_ClasesTarjeta {

	public static void main(String[] args) {
		Tarjeta t1 = new Tarjeta(214151231,"03/21","Mario Jimenez","ING");
		Tarjeta t2 = new Tarjeta(913512392,"11/27","David Bernal","La Caixa");
		
		t1.realizarPago(575);
		t1.getSaldo();
		t1.realizarPago(500);
		t2.getStatus();
		t2.bloquearTarjeta();
		t2.realizarPago(100);
		t2.desbloquearTarjeta();
		t2.getStatus();
		t2.realizarPago(100);
	}
	
	public static class Tarjeta{
		int NumeroId;
		String FechaCad;
		String Titular;
		String Entidad;
		int Saldo;
		boolean Activa;
		
		public void realizarPago(int precio){
			if(precio <= this.Saldo && this.Activa) {
				System.out.println("Compra de " + precio + " euros realizada");
				this.Saldo -= precio;
			}
			else if (this.Activa){
				System.out.println("La compra no se pudo llevar a cabo, la tarjeta no tiene saldo suficiente");
			}
			else {
				System.out.println("La compra no se pudo llevar a cabo, la tarjeta se encuentra bloqueada");
			}
		}
		
		public void getSaldo() {
			System.out.println("Tiene " + this.Saldo + " euros restantes.");
		}
		
		public void getStatus() {
			if(this.Activa) {
				System.out.println("El estado de su tarjeta es: Activada");
			}
			else {
				System.out.println("El estado de su tarjeta es: Bloqueada");
			}
		}
		
		public void bloquearTarjeta(){
			System.out.println("Tarjeta Bloqueada");
			this.Activa = false;
		}
		
		public void desbloquearTarjeta(){
			System.out.println("Tarjeta Activada");
			this.Activa = true;
		}
		
		public Tarjeta(int NumeroId,String FechaCad,String Titular,String Entidad) {
			this.NumeroId = NumeroId;
			this.FechaCad = FechaCad;
			this.Titular = Titular;
			this.Entidad = Entidad;
			this.Saldo = 1000;
			this.Activa = true;
		}
		public Tarjeta(){
			this.Saldo = 1000;
			this.Activa = true;
		}
	}
	

}
