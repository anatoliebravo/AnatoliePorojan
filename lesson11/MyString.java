package lesson11;

       public class MyString {
        public static String primaryString(String prim){
            StringBuilder finalString = new StringBuilder();
            for (int i=prim.length()-1;i>=0;i--){
                finalString.append(prim.charAt(i));
            }

            return finalString.toString();

        }

        public static void main(String[] args){
            System.out.println(MyString.primaryString("Anatolie"));
        }
    }
