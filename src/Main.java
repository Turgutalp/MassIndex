import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("18.5 ve Altı Dusuk Kilolu\n" +
                "18.5 - 24.9 Normal Kilolu\n" +
                "25-29.9 Fazla Kilolu\n" +
                "30-40 Obez\n" +
                "40 ve Ustu Asiri Obez");

        System.out.println("====================================================");


        System.out.println("Lutfen boyunuzu metre cinsinden giriniz: ");
        Double h = sc.nextDouble();


        System.out.println("Lutfen kilonuzu kilogram cinsinden girinizL ");
        int m = sc.nextInt();
        sc.close();

        double index = ( m/( h*h) );

        if(index < 18.5)
            System.out.println("Dusuk Kilolusunuz..");
        else if(index < 25)
            System.out.println("Normal Kilodasiniz..");
        else if(index < 30)
            System.out.println("Obezite ..");
        else
            System.out.println("Asiri Obezite..");

    }
}
