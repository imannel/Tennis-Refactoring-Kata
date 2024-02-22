
public class TennisGame2 implements TennisGame {
    public int p1Point = 0;
    public int p2Point = 0;

    public String p1res = "";
    public String p2res = "";
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String score = "";
        if (p1Point == p2Point) {
            if (p1Point < 3)
                return getResult(p1Point) + "-All";
            else return "Deuce";
        }


        if (p1Point > 0 && p2Point == 0) {
            p1res = getResult(p1Point);
            p2res = "Love";
            score = p1res + "-" + p2res;
        } else if (p2Point > 0 && p1Point == 0) {
            p2res = getResult(p2Point);
            p1res = "Love";
            score = p1res + "-" + p2res;
        }

        if (p1Point > p2Point && p1Point < 4) {

            p1res = getResult(p1Point);
            p2res = getResult(p2Point);
            score = p1res + "-" + p2res;
        }
        if (p2Point > p1Point && p2Point < 4) {
            p2res = getResult(p2Point);

            p1res = getResult(p1Point);
            score = p1res + "-" + p2res;
        }

        if (p1Point > p2Point && p2Point >= 3) {
            score = "Advantage player1";
        }

        if (p2Point > p1Point && p1Point >= 3) {
            score = "Advantage player2";
        }

        if (p1Point >= 4 && p2Point >= 0 && (p1Point - p2Point) >= 2) {
            score = "Win for player1";
        }
        if (p2Point >= 4 && p1Point >= 0 && (p2Point - p1Point) >= 2) {
            score = "Win for player2";
        }
        return score;
    }


    public void wonPoint(String player) {
        if (player.equals(player1Name))
            p1Point++;
        if (player.equals(player2Name))
            p2Point++;
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