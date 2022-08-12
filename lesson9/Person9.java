package lesson9;

public  class Person9 {
    /*Creati o clasa Person care sa aiba 3 proprietati. Long id , String firstName, lastName.
Face-ti in asa fel incit atunci cind creati cite un obiect in main, id sa se incrementeze.
Adica pentru fiecare obiect creat, sa-i fie generat pe durata rularii programului, un id unic.*/
    public class Person {
       long id = 0; // Does not work with public 
        String firstName, lastName;

        public Person() {
            id++;
        }

        public  void main(String[] args) {
            Person9 p = new Person9();
            Person9 p2 = new Person9();
            System.out.println(id);
        }
    }
}
