
public class TennisGame1 implements TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;
    private String player1Name;
    private String player2Name;



    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name))
            player1Score += 1;
        if (playerName.equals(player2Name))
            player2Score += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore = 0;
        if (player1Score == player2Score) {
            switch (player1Score) {
                case 0:
                    return score = "Love-All";

                case 1:
                    return score = "Fifteen-All";

                case 2:
                    return score = "Thirty-All";

                default:
                    return score = "Deuce";


            }
        }
            if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) return score = "Advantage " + player1Name;
            else if (minusResult == -1) return score = "Advantage "  + player2Name;
            else if (minusResult >= 2) return score = "Win for "  +player1Name;
            return  score = "Win for "+ player2Name;
        }

                switch ( player1Score) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
                switch ( player2Score) {
                    case 0:
                        score += "-Love";
                        break;
                    case 1:
                        score += "-Fifteen";
                        break;
                    case 2:
                        score += "-Thirty";
                        break;
                    case 3:
                        score += "-Forty";
                        break;
                }


        return score;
    }
}
