import java.lang.Class;
import java.lang.reflect.*;

public class Main {
	public static void main(String[] args) {
		try {
			Test test = new Test();
			
			Class cls = Class.forName("Test");
			
			System.out.println("The name of the class is: " + cls.getName());
			
			Constructor constructor = cls.getConstructor();
			
			System.out.println("The name of the constructor is: " + constructor.getName());
			
			Method[] methods = cls.getMethods();
			
			for(int i = 0; i < methods.length; i++) {
				System.out.println("Method name: " + methods[i].getName());
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
