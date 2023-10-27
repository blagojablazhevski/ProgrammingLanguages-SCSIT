
public class Exercise02 {
	
	static class egg{
		int category;
		
		public egg(int category) {
			this.category = category;
		}
		
		public int getCategory() {
			return category;
		}
		
		public void EGG() {
			System.out.println("Each egg has an albumen and a yolk");
		}
		public void print() {
			System.out.println("The egg is a nutritional product");
		}
	}
	
	static class ostrich_egg extends egg{
		public ostrich_egg(int category) {
			super(category);
			System.out.println("a constructor of ostrich_egg that utilizies the constructor of eggg");
		}
		public void EGG() {
			System.out.println("The albumen and yolk an OSTRICH egg are the largest");
		}
	}

	public static void main(String[] args) {
		egg henegg = new egg(1);
		ostrich_egg ostrichegg = new ostrich_egg(2);
		
		System.out.println("For the hen's egg: ");
		henegg.print();
		henegg.EGG();
		System.out.println(henegg.getCategory());
		
		System.out.println("\nFor the ostrich's egg: ");
		ostrichegg.print();
		ostrichegg.EGG();
		System.out.println(ostrichegg.getCategory());
	
	}
}
