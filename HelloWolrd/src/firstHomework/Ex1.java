package firstHomework;

public class Ex1 {
    public static void main(String[] args) {
        int nb = 100;
        while (nb >= 11) {
            if ((nb % 2) == 0) {
                System.out.println(nb);
            }
            nb -= 1;
        }
    }
}
