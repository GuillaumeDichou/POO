package firstHomework;

public class Ex4 {
    public static void main(String[] args) {
        int nb1 = 50;
        int nb2 = 1;
        int count = 0;
        while (count < 100) {
            while ((nb1 % (nb1-nb2)) != 0) {
                nb2 += 1;
            }
            if (nb2 == (nb1-1)) {
                System.out.println(nb1);
                count += 1;
            }
            nb1 += 1;
            nb2 = 1;
        }
    }
}
