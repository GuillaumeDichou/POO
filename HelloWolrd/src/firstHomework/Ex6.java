package firstHomework;

public class Ex6 {
    public static void main(String[] args) {
        char[] letters = new char[52];

        int i = 0;
        for (char letter = 'a'; letter <= 'z'; letter++) {
            letters[i] = letter;
            i++;
        }

        for (char letter = 'Z'; letter >= 'A'; letter--) {
            letters[i] = letter;
            i++;
        }

        for (char letter : letters) {
            System.out.print(letter);
        }
    }
}
