public class Exercise02 {
	
	static class egg{
		 public void EGG() {
			System.out.println("Each egg has an albumen and a yolk");
		}
		public void print() {
			System.out.println("The egg is a nutritional product");
		}
	}
	
	static class ostrich_egg extends egg{
		public void EGG() {
			System.out.println("The albumen and yolk an OSTRICH egg are the largest");
		}
	}

	public static void main(String[] args) {
		egg henneg = new egg();
		ostrich_egg ostrichegg = new ostrich_egg();
		
		henneg.EGG();
		ostrichegg.EGG();
	}
}
