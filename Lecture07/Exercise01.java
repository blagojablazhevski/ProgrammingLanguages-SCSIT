
public class Exercise01 {
	
	interface Two_D_Shape{
		static float PI = 3.14f;
		
		abstract void parameters();
		
		abstract float area();
		abstract float perimeter();
	}
	
	interface Three_D_Shape{
		abstract float volume();
	}
	
	static class Triangle implements Two_D_Shape{
		float sideA, sideB, sideC, height;
		
		Triangle(float sideA, float sideB, float sideC, float height){
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
			this.height = height;
			System.out.println("A new triangle is created");
		}

		@Override
		public void parameters() {
			System.out.println("Parameters:\ta: " + sideA + "\tb: " + sideB + "\tc: " + sideC + "\th: " + height);
		}

		@Override
		public float area() {
			return (height*sideB)/2;
		}

		@Override
		public float perimeter() {
			return sideA + sideB+ sideC;
		}
		
		boolean rectangular() {
			boolean isRectangular = false;
			
			if(Math.pow(sideA, 2) + Math.pow(sideB,  2) == Math.pow(sideC, 2)) {
				isRectangular = true;
			}
			
			return isRectangular;
			
		}
	}
	
	static class Sphere implements Two_D_Shape, Three_D_Shape{
		float radius;
		
		Sphere(float radius){
			this.radius = radius;
			System.out.println("A new sphere has been created");
		}

		@Override
		public void parameters() {
			System.out.println("Parameters:\tr: " + radius);
		}

		@Override
		public float area() {
			return (float) (PI * 4 * Math.pow(radius, 2));
		}

		@Override
		public float perimeter() {
			return 2 * PI * radius;
		}

		@Override
		public float volume() {
			return (float) ((4/3)*PI*Math.pow(radius, 3));
		}
		
	}

	public static void main(String[] args) {
		int count = 0;
		Triangle T1 = new Triangle(3,5,6,3);
		Sphere B1 = new Sphere(4);
		
		Two_D_Shape T2 = new Triangle(8,2,10,16);
		Two_D_Shape B2 = new Sphere(3);
		Three_D_Shape B3 = new Sphere(7);
		
		if(T1 instanceof Two_D_Shape) {
			count++;
		}
		if(T2 instanceof Two_D_Shape) {
			count++;
		}
		if(B1 instanceof Two_D_Shape) {
			count++;
		}
		if(B3 instanceof Two_D_Shape) {
			count++;
		}
		if(T1 instanceof Two_D_Shape) {
			count++;
		}
		
		System.out.println("\nThere are " + count + " Two_D_Shape instances\n");
		
		System.out.println("Triangle 1:\n");
		T1.parameters();
		System.out.println("Perimeter:\t" + T1.perimeter());
		System.out.println("Area:\t" + T1.area());
		
		System.out.println("\nTriangle 2:\n");
		T1.parameters();
		System.out.println("Perimeter:\t" + T2.perimeter());
		System.out.println("Area:\t" + T2.area());
		
		System.out.println("\nSphere 1:\n");
		B1.parameters();
		System.out.println("Perimeter:\t" + B1.perimeter());
		System.out.println("Area:\t" + B1.area());
		
		System.out.println("\nSphere 2:\n");
		B2.parameters();
		System.out.println("Perimeter:\t" + B2.perimeter());
		System.out.println("Area:\t" + B2.area());
		
		System.out.println("\nSphere 3:\n");	
		((Two_D_Shape) B3).parameters();
		System.out.println("Perimeter:\t" + ((Two_D_Shape) B3).perimeter());
		System.out.println("Area:\t" + ((Two_D_Shape) B3).area());
		
	}

}
