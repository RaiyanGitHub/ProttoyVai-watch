
package restmanage;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public abstract class Employee {

int id;
String firstname;
String lastname;
String email;
Department department;
//String position;
Address adress;
//Efficiency efficiency;

    public Employee(int id, String firstname, String lastname, String email, Department department,  Address adress) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.department = department;
        //this.position = position;
        this.adress = adress;
        //this.efficiency = efficiency;
    }
    public Employee(int id, String firstname, String lastname, String email, Department department,  String street, String Town) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.department = department;
        //this.position = position;
        this.adress =new Address(street,Town);
        //this.efficiency = efficiency;
    }

public  void login()
{
    LocalTime time=LocalTime.now();
    DateTimeFormatter timef=DateTimeFormatter.ofPattern("hh:mm:ss");
    String formattime=time.format(timef);
    System.out.println("Entry Time:"+formattime);
}
public  void logout()
{
      LocalTime time=LocalTime.now();
    DateTimeFormatter timef=DateTimeFormatter.ofPattern("hh:mm:ss");
    String formattime=time.format(timef);
    System.out.println("Exit Time:"+formattime);
    
}
     
}
 

   
