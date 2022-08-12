package lesson8;

public class Part2 {
    public static int nrAdunate(int suma){
        suma=0;
        for (int i=0;i<=5;i++){
            suma+=i;
        }
        return suma;

    }


    public static void nrPare(int n){
        for (int i=0;i<=n;i++){
            if (i%2==0)
                System.out.println(i + " - Even number");
        }

    }

    public static void Afisare(){
        for (int i=0;i<=10;i++)
            System.out.println(i+ " - Hello");
    }


    public static void nrImpare(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0)
                System.out.println(i + " - Uneven number");
        }
    }


    public static void main(String[] args){
        System.out.println("Suma numerelor adunate este: " +nrAdunate(5));
        System.out.println();
        nrPare(10);
        System.out.println();
        Afisare();
        System.out.println();
        nrImpare(10);

    }



}

