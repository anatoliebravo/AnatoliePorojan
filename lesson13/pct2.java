package lesson13;

    /** 2. Creati o metoda care primeste un array de int si returneaza suma tuturor elementelor
     De ex. : Ii dau {1,2,3,4}, returneaza 10 */

    public class pct2 {
        public static int Array(int[] arr){
            int suma = 0;
            for (int j : arr) {
                suma += j;
            }

            return suma;
        }

        public static void main(String[] args){
            int[] arr = {1,2,3,4,5};
            System.out.println(Array(arr));


        }

    }

