package lesson10;

 public class MyClass {
    public static long id;
    private String  lastName;
    private String firstName;


     public MyClass(){
        id++;
    }


    public String getLastName(){
        return lastName;

    }
    public void setLastName(String setLN) {
        lastName=setLN;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String setFN){
        firstName=setFN;
    }
}
