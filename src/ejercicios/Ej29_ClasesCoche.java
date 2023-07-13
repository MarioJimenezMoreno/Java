package ejercicios;

public class Ej29_ClasesCoche {

	public static void main(String[] args) {
		Coche c1 = new Coche();
		Coche c2 = new Coche();
		Coche c3 = new Coche();
		

		c1.reFuel(120);
		System.out.println(c1.getFuel() + " MAX FUEL");
		c1.setSpeed(240);
		System.out.println(c1.getSpeed() + " MAX SPEED");
		c1.drive();
		c2.reFuel(100);
		System.out.println(c2.getFuel() + " MAX FUEL");
		c2.setSpeed(170);
		System.out.println(c2.getSpeed() + " MAX SPEED");
		c2.drive();
		c3.reFuel(250);
		System.out.println(c3.getFuel() + " MAX FUEL");
		c3.setSpeed(80);
		System.out.println(c3.getSpeed() + " MAX SPEED");
		c3.drive();
	}
	
	public static class Coche{
		private int fuel;
		private int maxspeed;
		
		
		public int getFuel(){
			return this.fuel;
		}
		public int getSpeed(){
			return this.maxspeed;
		}
		public void reFuel(int fuel){
			this.fuel = fuel;
		}
		public void setSpeed(int speed){
			this.maxspeed = speed;
		}
		public void drive() {
			System.out.println("BRRRRR");
		}
		
		public Coche(int fuel,int maxspeed) {
			this.fuel = fuel;
			this.maxspeed = maxspeed;
		}
		public Coche() {}
		
	}

}
