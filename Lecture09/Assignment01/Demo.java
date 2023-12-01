package assignment;

public class Demo {

    public static void main(String[] args) {
        Student student = new Student("Blagoja","075255355",5373,2222);
        StudentFileStream fileStream = new StudentFileStream();
        String fileName = "student.txt";
        fileStream.writeToFile(student, fileName);
    }

}
