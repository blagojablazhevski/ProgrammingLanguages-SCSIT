public class Exercise03 {

	public static void main(String[] args) {
		String object = "Java Developer";
		
		char first = object.charAt(0);
	    char last = object.charAt(object.length() - 1);
	    char mid = object.charAt((object.length()/2) - 1);
	    
		char biggest;
	    if (first >= last && first >= mid) {
	    	biggest = first;
	    } else if (last >= mid) {
	        biggest = last;
	    } else {
	        biggest = mid;
	    }
		
		System.out.println("My string is " + object);
		System.out.println("Its first character is " + first);
		System.out.println("Its last character is " + last);
		System.out.println("Its middle character is " + mid);
		System.out.println("The sum of these characters is " + (int)(first + last + mid));
		System.out.println("Biggest character of these three is " + biggest);
		


	}

}
