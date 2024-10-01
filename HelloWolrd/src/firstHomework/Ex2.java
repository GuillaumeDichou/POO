package firstHomework;

public class Ex2 {
    public static void main(String[] args) {
        int count = 0;
        int nb = 1;
        int total = 0;
        while (count < 10) {
            total += (nb * nb);
            nb += 1;
            count += 1;
        }
        System.out.println(total);
    }
}
