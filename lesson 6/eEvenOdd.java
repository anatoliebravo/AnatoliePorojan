import java.util.Scanner;

public class eEvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Scrieti un numar: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " este numar  par");
        else
            System.out.println(num + " este numar  impar");
    }
}