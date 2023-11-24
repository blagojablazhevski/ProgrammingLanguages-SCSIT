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
			
			System.out.println("Printing the result of Method 1: ");
			Method methodCall1 = cls.getMethod("method1");
			methodCall1.invoke(test);
			
			System.out.println("Printing the result of Method 2: ");
			Method methodCall2 = cls.getDeclaredMethod("method2", int.class);
			methodCall2.invoke(test, 15);
			
			System.out.println("Printing the value of s: ");
			Field field = cls.getDeclaredField("s");
			field.setAccessible(true);
			System.out.println(field.get(test));
			
			System.out.println("Printing the changed value of s: ");
			field.set(test, "JAVA");
			methodCall1.invoke(test);
			
			System.out.println("Printing the result of Method 3: ");
			Method methodCall3 = cls.getDeclaredMethod("method3");
			methodCall3.setAccessible(true);
			methodCall3.invoke(test);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
