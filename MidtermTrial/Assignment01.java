public class Ass01 {

	public static void main(String[] args) {

		if (args.length != 6) {
			System.out.println("You must enter MIN/MAX and at least 5 numbers for the program to work");
			return;
		}

		int numbers[] = new int[5];

		for (int i = 1; i < 6; i++) {
			numbers[i - 1] = Integer.parseInt(args[i]);
		}

		int result = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (args[0].equals("MIN")) {
				if (numbers[i] < result) {
					result = numbers[i];
				}
			} else if (args[0].equals("MAX")) {
				if (numbers[i] > result) {
					result = numbers[i];
				}
			}

			
		}
		System.out.println(result);
	}
}
