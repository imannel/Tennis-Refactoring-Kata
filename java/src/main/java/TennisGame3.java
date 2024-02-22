
public class TennisGame3 implements TennisGame {

    private int player2Score;
    private int player1Score;
    private String player1Name;
    private String player2Name;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String s;
        if (player1Score < 4 && player2Score < 4 && !(player1Score + player2Score == 6)) {

            s = getResult(player1Score);
            if (player1Score == player2Score) {
                return s + "-All";
            }
            return s + "-" + getResult(player2Score);
        } else {
            if (player1Score == player2Score)
                return "Deuce";
            if (player1Score > player2Score) {
                s = player1Name;
            } else s = player2Name;
            if ((player1Score - player2Score) * (player1Score - player2Score) == 1) return "Advantage " + s;
            else return "Win for " + s;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name))
            this.player1Score += 1;
        if (playerName.equals(player2Name))
            this.player2Score += 1;

    }

    public String getResult(int score) {
        return switch (score) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            default -> "Forty";
        };
    }
}
