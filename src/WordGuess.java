import java.util.Scanner;
public class WordGuess {
    public static void main(String[] args) {
        boolean gameOver = false;
        int number = 1;
        Scanner input = new Scanner(System.in);
        MagicWord magicWord = new MagicWord();

        while (!gameOver) {
            shoot(input, magicWord);
            System.out.println("Attempt " + number + ": " + magicWord);
            if (magicWord.isWin()) {
                gameOver = true;
            }
            number++;
        }
        System.out.println("YOU WIN !!!");
    }

    private static void shoot(Scanner input, MagicWord magicWord) {
        System.out.print("Enter one character or your guess word: ");
        String line = input.nextLine();
        if (line.length() == 1) {
            char ch = line.charAt(0);
            magicWord.shootLetter(ch);
        } else {
            magicWord.shootWord(line);
        }
    }
}
