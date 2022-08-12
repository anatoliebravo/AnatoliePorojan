package lesson8;

public class NewPerson {
    public static void main(String[] args) {
        Person myPerson = new Person();
        myPerson.firstName = "Anatolie";
        myPerson.lastName = "Porojan";
        myPerson.occupation = myPerson.getOccupation();
        myPerson.age = 38;
        myPerson.gender = 'M';


        myPerson.getAge(myPerson.age);
        {
            System.out.println("The age of the person is: " + myPerson.age);
        }

        myPerson.setName(myPerson.firstName, myPerson.lastName);

        myPerson.getOccupation();
        System.out.println(" His jobtitle is: " + myPerson.occupation);

        System.out.println("Gender converted in int is: " + myPerson.method4('M'));
    }
}
