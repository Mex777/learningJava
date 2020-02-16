class Concurent {
	private String name;
	private int score;
	Concurent (String aName, int aScore) {
		name = aName;
		score = aScore;
	}

	public void setScore (int scor) {
		score = scor;
	}
	public void setName (String sN) {
		name = sN;
	}
	public int getScore() {
		return score;
	}
	public String getName() {
		return name;
	}
}
public class prob2 {

    public static void main(String[] args) { Concurent[] participant = new Concurent[4];

 		participant[0] = new Concurent("Gigel", 1500);
 		participant[1] = new Concurent("Marius", 900);
 		participant[2] = new Concurent("Cristi", 50);
 		participant[3] = new Concurent("George", 400);
 		for (int i = 0; i<4; i++) {
 			int position = calculatePosition(participant[i].getScore());
 			displayHighScorePosition (participant[i].getName(), position);
 		}
        
    }
    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position);
    }
    public static int calculatePosition(int score) { int position;
        if (score > 1000)
            return 1;
        else if (score > 500 && score < 1000)
            return 2;
        else if (score < 500 && score > 100)
            return 3;
        else
            return 4;
    }
}