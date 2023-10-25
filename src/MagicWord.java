public class MagicWord {
    public static final String[] WORDS = {
            "POTATOE", "MOUNTAIN", "FOUNTAIN",
            "IMPOSSIBLE", "TODLER", "CLIMBER"
    };
    private String hiddenWord;
    private boolean[] guessedLetters;

    public MagicWord() {
        int index = (int) (Math.random() * WORDS.length);
        hiddenWord = WORDS[index];
        guessedLetters = new boolean[hiddenWord.length()];
        initGuessedLetters(false);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < guessedLetters.length; i++) {
            if (guessedLetters[i]) {
                s += hiddenWord.charAt(i);
            } else {
                s += "_";
            }
        }
        return s;
    }

    public void initGuessedLetters(boolean value) {
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = value;
        }
    }

    public boolean isWin() {
        for (boolean guessed : guessedLetters) {
            if (!guessed) {
                return false;
            }
        }
        return true;
    }

    public void shootLetter(char letter) {
        letter = convertCharToUppercase(letter);
        for (int i = 0; i < hiddenWord.length(); i++) {
            if (hiddenWord.charAt(i) == letter) {
                guessedLetters[i] = true;
            }
        }
    }

    public void shootWord(String word) {
        if (word.equalsIgnoreCase(hiddenWord)) {
            initGuessedLetters(true);
        }
    }

    private char convertCharToUppercase(char c) {
        // return ("" + c).toUpperCase().charAt(0);
        String s = "" + c;
        s = s.toUpperCase();
        return s.charAt(0);
    }

}
