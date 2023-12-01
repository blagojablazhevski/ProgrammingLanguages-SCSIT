package assignment;

import java.io.Serializable;

public class NewMain {

	public static void main(String[] args) {
        StudentFileStream fileStream = new StudentFileStream();
        String fileName = "student.txt";
        fileStream.readFromFile(fileName);
	}

}
