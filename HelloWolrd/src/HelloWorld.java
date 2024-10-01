public class HelloWorld { // Même nom que le .java dans src
    public static void main(String[] args) { // Toujours le mettre
        System.out.println("Hello World!"); // ln pour avoir un retour à la ligne

        boolean varBooleenne;
        varBooleenne = true;
        varBooleenne = !varBooleenne; // Inverse de varBooleenne

        byte b1 = -1; // 1 byte
        short s1 = -1; // 2 bytes
        int i1 = -1; // 4 bytes
        long l1 = -1; // 8 bytes

        float f1 = -1;
        double d1 = -1; // On peut mettre des nombres beaucoup plus grand que dans les floats

        char c1 = '0'; // sur 2 bytes
        String s2 = "hello"; // s2 est un objet de type/class String

        var v1 = 'R'; // Le compilateur devine c'est quel type de valeur (char ici)

        char[] tableauCaracteres = new char[] {'a', 'b','c'};
        int taille = tableauCaracteres.length; // Taille du tableau (et pas le nombres  d'éléments dedans)

        int[][] tableau2D = new int[taille][taille];

        int a, b;
        a = b = 7;
        a = b++ + 2; // a = 9 et b = 8
        a = ++b + 2; // a = 10 et b = 8

        if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a <= b");
        }

        while (a < 15) {
            a += 1;
        }

        do {
            System.out.println(a);
        } while (a++ < 20);

        for (int count = 0; count < taille; count++) {
            System.out.println(count);
        }



    }
}

// Nom de variable unique dans chaque bloc de code
// Tous les nombres sont signés en java (premier byte est le byte de signe)
// Les Strings sont immuables, donc on ne peut pas les modifiers
// Les tableaux sont statiques, on ne peut plus changer leur taille
// Pile et tas important de connaître

