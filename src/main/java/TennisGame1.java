
public class TennisGame1 implements TennisGame {
    
    private int mScore1 = 0;
    private int mScore2 = 0;
    final private String player1Name;
    final private String player2Name;
    public String score = "";

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        int i = (playerName == player1Name) ? (mScore1 += 1) : (mScore2 += 1);
    }
    public void equalsScore() {
        if (mScore1==mScore2)
        {
            switch (mScore1)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        }
    }

    public void highestScore() {
        if ((mScore1>=4 || mScore2>=4)&&mScore2!=mScore1)
        {
            int minusResult = mScore1-mScore2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
    }

    public String getScore() {
        equalsScore();
        highestScore();
        int tempScore;
        if ((mScore2<4 && mScore1<4)&& mScore2!=mScore1)
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = mScore1;
                else { score+="-"; tempScore = mScore2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
