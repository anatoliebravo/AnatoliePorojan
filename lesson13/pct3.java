package lesson13;

    /** 3. Creati o metoda care primeste un arr de int, si returneaza un alt array doar cu elementele pare din primul array
     De ex. {1,2,3,4,5,6}, va returna {2,4,6} */

    public class pct3 {
        public static void Array(int[] arr){

            int[] arr2 = new int[arr.length];
            int j = 0;
            for (int k : arr) {

                if (k % 2 == 0) {

                    arr2[j] = k;
                    j++;

                }
            }

            for (int k : arr2) {
                if (k == 0)
                    continue;
                System.out.println(k);
            }

        }

        public static void main(String[] args){
            int[] arr = {1,2,3,4,5,6,7,8,9,10};

            Array(arr);

        }

    }

