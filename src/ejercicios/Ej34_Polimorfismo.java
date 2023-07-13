package ejercicios;

public class Ej34_Polimorfismo {
	public static void main(String[] args) {
		Car c1 = new Car("Honda",100);
		Car c2 = new Car("Jeep",500);
		Car c3 = new Car("BMW",800);
		
		c1.getSpeed();
		c2.getSpeed();
		c3.getSpeed();
	}

	public static class Car{
		private String company;
		private int speed;
		
		public void getSpeed() {
			System.out.println(this.company + " car's speed is " + this.speed + " Km/h");
		}
		
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
		public String getCompany() {
			return this.company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		
		public Car(String company,int speed) {
			this.company = company;
			this.speed = speed;
		}
		public Car() {}
	}
}
