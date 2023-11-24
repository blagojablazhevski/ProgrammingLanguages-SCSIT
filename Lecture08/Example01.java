// The Main.java file

import java.lang.Class;
import java.lang.reflect.*;

class Animal{		
}

public class Main {
	public static void main(String[] args) {
		try {
			Dog d1 = new Dog();
			
			Class obj = Class.forName("Dog");
			
			String name = obj.getName();
			System.out.println("Name: " + name);	
			
			int modifier = obj.getModifiers();
			
			String mod = Modifier.toString(modifier);
			System.out.println("Modifier: " + mod);
			
			Class superClass = obj.getSuperclass();
			System.out.println("Superclass: " + superClass.getName());
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

// The Dog.java file


public class Dog extends Animal{
	public void display() {
		System.out.println("I am a dog.");
	}
}

