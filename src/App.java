import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ente com o primeiro número inteiro:");
        int pni1 = sc.nextInt();

        System.out.println("Ente com o segundo número inteiro:");
        int pni2 = sc.nextInt();

        System.out.println("Entre com um número real:");
        double pnr1 = sc.nextDouble();

        int letraa = ((pni1 * 2) + (pni2 / 2));
        System.out.println("o produto do dobro do primeiro com metade do segundo:" + letraa);

        double letrab = (pni1 * 3) + pnr1;
        System.out.println("a soma do triplo do primeiro com o terceiro:" + letrab);

        double letrac = (pnr1 * 3) * 3;
        System.out.println("ao terceiro elevado ao cubo:" + letrac);
    }
}