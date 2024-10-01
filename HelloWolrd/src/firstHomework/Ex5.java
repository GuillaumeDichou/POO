package firstHomework;

public class Ex5 {
    public static void main(String[] args) {
        char[] tabLetters = new char[] {'A', 'B','C', 'D', 'E', 'F','G', 'H', 'I', 'J','K', 'L', 'M', 'N','O', 'P', 'Q',
                'R','S', 'T', 'U', 'V','W', 'X', 'Y', 'Z'};
        int skip = 2;
        int count = 26;
        while (count > 1) {
            if (skip == 2) {
                count -= skip;
                System.out.println(tabLetters[count]);
                skip = 3;
            } else {
                count -= skip;
                System.out.println(tabLetters[count]);
                skip = 2;
            }
        }
    }
}
