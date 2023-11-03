public class Ass02 {
	
	static class Player {
		private String name, team;
		private int points;
		
		public Player(String _name, String _team){
			name = _name;
			team = _team;
			this.points = (int) (Math.random() * 100) % 50;
		}
		
		public int GetPoints() {
			return points;
		}
		
		public String GetName() {
			return name;
		}
		
		public static Player MVP(Player[] players) {
			Player mvp = players[0];
			
			for(Player player : players) {
				if(player.GetPoints() > mvp.GetPoints()) {
					mvp = player;
				}
			}
			
			return mvp;
		}
	}

	public static void main(String[] args) {
		Player[] Team1 = new Player[5];
		Player[] Team2 = new Player[5];
	
		for(int i = 0; i < 5; i++) {
			Team1[i] = new Player("Player " + i, "Lakers");
			Team2[i] = new Player("Player " + i, "Heat");
		}
		
		System.out.println(Team1[0].team);
		for(int i = 0; i < 5; i++) {
			System.out.println("\t" + Team1[i].GetName() + "\t" + Team1[i].GetPoints());
		}
		
		System.out.println(Team2[0].team);
		for(int i = 0; i < 5; i++) {
			System.out.println("\t" + Team2[i].GetName() + "\t" + Team2[i].GetPoints());
		}
		
		int score1 = 0, score2 = 0;
		
		for(int i = 0; i < 5; i++) {
			score1 += Team1[i].GetPoints();
			score2 += Team2[i].GetPoints();
		}
		
		System.out.println(Team1[0].team + " : " + Team2[0].team + " = " + score1 + " : " + score2);
		if(score1 > score2) {
			System.out.println(Team1[0].team + " is the winner.");
		} else if (score2 > score1) {
			System.out.println(Team2[0].team + " is the winner.");
		} else {
			System.out.println("Draw");
		}

		Player MVP1 = Player.MVP(Team1);
		Player MVP2 = Player.MVP(Team2);
		
		if(score1 > score2) {
			System.out.println(MVP1.GetName() + " is the MVP from " + MVP2.team + " with " + MVP1.GetPoints() + " points.");
		} else if (score2 > score1) {
			System.out.println(MVP2.GetName() + " is the MVP from " + MVP2.team + " with " + MVP1.GetPoints() + " points.");
		}
	}

}
