package lesson10;

    public class NewClass {
        public static void main(String[] args){
            MyClass myClass = new MyClass();
            myClass.setLastName("Anatolie ");
            myClass.setFirstName("Porojan ");

            System.out.print(myClass.getLastName());
            System.out.print(myClass.getFirstName());
            System.out.println("Unique ID: - " + MyClass.id);



            MyClass myClass1 = new MyClass();
            myClass1.setLastName("Bolbocean ");
            myClass1.setFirstName("Vasile ");

            System.out.print(myClass1.getLastName());
            System.out.print(myClass1.getFirstName());
            System.out.println(" Unique ID: - " + MyClass.id);





            MyClass myClass2 = new MyClass();
            myClass2.setLastName("Corlatean ");
            myClass2.setFirstName("Eugen ");

            System.out.print(myClass2.getLastName());
            System.out.print(myClass2.getFirstName());
            System.out.println("Unique ID: - " + MyClass.id);

            MyClass myClass3 = new MyClass();
            myClass3.setLastName("Zorescu ");
            myClass3.setFirstName("Bogdan ");

            System.out.print(myClass3.getLastName());
            System.out.print(myClass3.getFirstName());
            System.out.println("Unique ID: - " + MyClass.id);


            MyClass myClass4 = new MyClass();
            myClass4.setLastName("Popa ");
            myClass4.setFirstName("Andreea ");

            System.out.print(myClass4.getLastName());
            System.out.print(myClass4.getFirstName());
            System.out.println("Unique ID: - " + MyClass.id);

            MyClass myClass5 = new MyClass();
            myClass5.setLastName("Adochitei ");
            myClass5.setFirstName("Crina ");

            System.out.print(myClass5.getLastName());
            System.out.print(myClass5.getFirstName());
            System.out.println("Unique ID: - " + MyClass.id);

        }

}
