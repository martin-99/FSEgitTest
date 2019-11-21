public class Person{
   private String fistName;
    
   private String surname;
    public Person(String firstName,String surname){
        this.fistName = firstName;
        this.surname = surname;
    }
    public String getFisrtName(){
        return firstName;
    }
    public String getSurname(){
        return surname;
    }
    public String setFistName(String newFisrtName){
        return this.firstName = newFisrtName;
    }
    public String setSurname(String newSurname){
        return this.firstName = newSurname;
    }


}