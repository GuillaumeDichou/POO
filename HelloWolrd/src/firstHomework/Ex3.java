package firstHomework;

public class Ex3 {
    public static void main(String[] args) {
        boolean[] tabBoolean= new boolean[100];
        int nb = 2;
        for (int count = 0; count < tabBoolean.length; count++) {
            tabBoolean[count] = true;
        }
        for (int count = 1; count < tabBoolean.length; count++) {
            while (nb <= 100) {
                tabBoolean[nb-1] = false;
                nb += nb;
            }
            nb = 2 + count;
        }
        for (int count = 0; count < tabBoolean.length; count++) {
            System.out.println(tabBoolean[count]);
        }
    }
}
