
public class FirstExercise {

	public static void main(String[] args) {
		String value = "Computer";
		String value2 = value.substring(0, 2);
		
		int valueLength = value.length();
		System.out.println("Original: " + value);
		System.out.println("In small letters: " + value.toLowerCase());
		System.out.println("In capital letters: " + value.toUpperCase());
		System.out.println("Length: " + value.length());
		System.out.println("First letter: " + value.charAt(0) + "\nMiddle Letter: " + value.charAt((valueLength/2) - 1) + "\nLast Letter: " + value.charAt(valueLength-1));
		if(value.startsWith("Com")) {
			System.out.println("The word starts with Com: true");
		} else {
			System.out.println("The word starts with Com: false");
		}
		if(value.endsWith("ion")) {
			System.out.println("The word ends with ion: true");
		} else {
			System.out.println("The word ends with ion: false");
		}
		System.out.println("The first two letters are: " + value2);
		System.out.println("Swapping e with o: " + value.replace("e", "o"));
		System.out.println("Swapping Comp with Calcula: " + value.replace("Comp", "Calcula"));
	}

}
