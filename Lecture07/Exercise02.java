
public class Exercise02 {
	interface Average {
		float average();
	}
	
	interface Scholarship{
		float rate();
	}
	
	static class Person {
		String p_name;
		
		Person(String p_name){
			this.p_name = p_name;
		}
		Person(){
			
		}
	}
	
	static class Student extends Person implements Average, Scholarship{
		int no_grades;
		Employee parent1 = new Employee();
		Employee parent2 = new Employee();
		int grade[] = new int[6];

		Student(String p_name) {
			super(p_name);
			// TODO Auto-generated constructor stub
		}
		
		Student(String p_name, int no_grades, Employee parent1, Employee parent2){
			super(p_name);
			this.no_grades = no_grades;
			this.parent1.equals(parent1);
			this.parent2.equals(parent2);
		}

		@Override
		public float rate() {
			return average()*6+(60000 - (parent1.average() + parent2.average()) * 4);
		}

		@Override
		public float average() {
			int average = 0;
			if(no_grades == 0) {
				return 0;
			} else {
				for(int i = 0; i < no_grades; i++) {
					average = average + grade[i];
				}
				return average/no_grades;
			}
		}
		
	}
	
	static class Employee extends Person implements Average{
		int no_salaries;
		int salary[] = new int[12];

		Employee(String p_name) {
			super(p_name);
		}
		
		public Employee(){
		}
		
		Employee(String p_name, int no_salaries){
			super(p_name);
			this.no_salaries = no_salaries;
			
			for(int i = 0; i < no_salaries; i++) {
				salary[i] = (int) (Math.random() * 30000);
			}
		}

		@Override
		public float average() {
			int average = 0;
			if(no_salaries == 0) {
				return 0;
			} else {
				for(int i = 0; i < no_salaries; i++) {
					average = average + salary[i];
				}
				return average/no_salaries;
			}
		}
		
	}

	public static void main(String[] args) {
		Employee eArray[] = new Employee[6];
		Student sArray[] = new Student[3];

		eArray[0] = new Employee("Kire", 0);
		eArray[1] = new Employee("Marijana", 3);
		eArray[2] = new Employee("Nikola Gruevski", 2);
		eArray[3] = new Employee("Afrodita", 0);
		eArray[4] = new Employee("Efrim", 4);
		eArray[5] = new Employee("Sheribana", 5);
		
		sArray[0] = new Student("Blagoja", 5, eArray[0], eArray[1]);
		sArray[1] = new Student("Nikola", 5, eArray[2], eArray[3]);
		sArray[2] = new Student("Pumpa", 5, eArray[4], eArray[5]);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Student " + i + " name: " + sArray[i].p_name);
			System.out.println("GPA: " + sArray[i].average());
			System.out.println("First parent: " + sArray[i].parent1.p_name + ", average salary: " + sArray[i].parent1.average());
			System.out.println("Second parent: " + sArray[i].parent2.p_name + ", average salary: " + sArray[i].parent2.average());
			System.out.println("Scholarship points: " + sArray[i].rate());

		}


	}

}
