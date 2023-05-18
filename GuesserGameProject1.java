import java.util.Scanner;

class Guesser {
    private int guessNum;

    public int getGuessNum() {
        return guessNum;
    }

    public void setGuessNum(int guessNum) {
        this.guessNum = guessNum;
    }

    public void guessNumber() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Guesser, please guess the number: ");
        guessNum = sc1.nextInt();
    }
}

class Players {
    private int guessNumForPlayer1;
    private int guessNumForPlayer2;
    private int guessNumForPlayer3;

    public int getGuessNumForPlayer1() {
        return guessNumForPlayer1;
    }

    public void setGuessNumForPlayer1(int guessNumForPlayer1) {
        this.guessNumForPlayer1 = guessNumForPlayer1;
    }

    public int getGuessNumForPlayer2() {
        return guessNumForPlayer2;
    }

    public void setGuessNumForPlayer2(int guessNumForPlayer2) {
        this.guessNumForPlayer2 = guessNumForPlayer2;
    }

    public int getGuessNumForPlayer3() {
        return guessNumForPlayer3;
    }

    public void setGuessNumForPlayer3(int guessNumForPlayer3) {
        this.guessNumForPlayer3 = guessNumForPlayer3;
    }

    public void guessNumbers() {
        Scanner sc1 = new Scanner(System.in);
        Guesser guesser = new Guesser();
        guesser.guessNumber();
        int correctGuess = guesser.getGuessNum();
        System.out.println("Player 1, enter your guess: ");
        guessNumForPlayer1 = sc1.nextInt();
        System.out.println("Player 2, enter your guess: ");
        guessNumForPlayer2 = sc1.nextInt();
        System.out.println("Player 3, enter your guess: ");
        guessNumForPlayer3 = sc1.nextInt();

        if (guessNumForPlayer1 == correctGuess && guessNumForPlayer2 == correctGuess && guessNumForPlayer3 == correctGuess) {
            System.out.println("All players won the game!");
        } else if (guessNumForPlayer1 == correctGuess && guessNumForPlayer2 == correctGuess) {
            System.out.println("Player 1 and Player 2 won the game!");
        } else if (guessNumForPlayer1 == correctGuess && guessNumForPlayer3 == correctGuess) {
            System.out.println("Player 1 and Player 3 won the game!");
        } else if (guessNumForPlayer2 == correctGuess && guessNumForPlayer3 == correctGuess) {
            System.out.println("Player 2 and Player 3 won the game!");
        } else if (guessNumForPlayer1 == correctGuess) {
            System.out.println("Player 1 won the game!");
        } else if (guessNumForPlayer2 == correctGuess) {
            System.out.println("Player 2 won the game!");
        } else if (guessNumForPlayer3 == correctGuess) {
            System.out.println("Player 3 won the game!");
        } else {
            System.out.println("All players lost the game.");
        }
    }
}

public class GuesserGameProject1 {
    public static void main(String[] args) {
        Players players = new Players();
        players.guessNumbers();
    }
}
