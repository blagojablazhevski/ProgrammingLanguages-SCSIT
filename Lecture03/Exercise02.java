class Car{
	
	private String type;
	private int no_seats;
	private String fuel;
	private String body_color;
	
	Car(){
		type = "";
		no_seats = 0;
		fuel = "";
		body_color = "";
	}
	Car(String _type, int _no_seats, String _fuel, String _body_color){
		type = _type;
		no_seats = _no_seats;
		fuel = _fuel;
		body_color = _body_color;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String _type) {
		type = _type;
	}
	
	public int getNo_Seats() {
		return no_seats;
	}
	
	public void setNo_Seats(int _no_seats) {
		no_seats = _no_seats;
	}
	
	public String getFuel() {
		return fuel;
	}
	
	public void setFuel(String _fuel) {
		fuel = _fuel;
	}
	
	public String getBody_color() {
		return body_color;
	}
	
	public void setBody_color(String _body_color) {
		body_color = _body_color;
	}
	
	public void spec() {
		System.out.println("\nThe specs of " + type + " are:\n Body color: " + body_color + "\tFuel: " + fuel + "\tSeats: " + no_seats);
	}
	
}

public class Exercise02 {
	public static void main(String[] args) {
		Car car1 = new Car("Damaged Zastava Yugo", 2, "Petrol", "Red");
		Car car2 = new Car("Opel Signum", 4, "Diesel", "Grey");
	
		System.out.println("Car 1 is a " + car1.getBody_color().toLowerCase() + " " + car1.getType() + " with " + car1.getNo_Seats() + " seats. It runs on " + car1.getFuel() + ".");
		System.out.println("Car 1 is a " + car2.getBody_color().toLowerCase() + " " + car2.getType() + " with " + car2.getNo_Seats() + " seats. It runs on " + car2.getFuel() + ".");
		
		car1.spec();
		car2.spec();
		
		if(car1.getNo_Seats() > car2.getNo_Seats()) {
			System.out.println("\nCar 1 " + car1.getType() + " has " + (car1.getNo_Seats() - car2.getNo_Seats()) + " more seats than " + car2.getType());
		} else if (car2.getNo_Seats() > car1.getNo_Seats()) {
			System.out.println("\nCar 2 " + car2.getType() + " has " + (car2.getNo_Seats() - car1.getNo_Seats()) + " more seats than " + car1.getType());
		} else {
			System.out.println("\nCar 1 " + car1.getType() + " and Car 2 " + car2.getType() + " have an equal number of seats of " + (car1.getNo_Seats()+car2.getNo_Seats())/2);
		}
	}
}
