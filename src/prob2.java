public class prob2 {

    public static void main(String[] args) { prob2 go = new prob2();
        int[] score = new int[4];
        score[0] = 1500; score[1] = 400; score[2] = 900; score[3] = 50;
        String[] participanti = new String[4];
        participanti[0] = "Gelu";
        participanti[1] = "Marinel";
        participanti[2] = "George";
        participanti[3] = "Cristi";
        for (int i=0; i<4; i++) { 
            int position = go.calculatePosition(score[i]);
            go.displayHighScorePosition(participanti[i], position);
        }
        
    }
    public void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position);
    }
    public int calculatePosition(int score) { int position;
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