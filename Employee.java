
package restmanage;



import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public abstract class Employee implements Serializable {

int id;
String firstname;
String lastname;
String email;

//String position;
//Address adress;
//Efficiency efficiency;

    public Employee(int id, String firstname, String lastname, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    

public  void login()
{
    LocalTime time=LocalTime.now();
    DateTimeFormatter timef=DateTimeFormatter.ofPattern("hh:mm:ss");
    String formattime=time.format(timef);
    System.out.println("Employee ID: "+this.id+"\nEntry Time:"+formattime);
}
public  void logout()
{
      LocalTime time=LocalTime.now();
    DateTimeFormatter timef=DateTimeFormatter.ofPattern("hh:mm:ss");
    String formattime=time.format(timef);
    System.out.println("Employee ID: "+this.id+"Exit Time:"+formattime);
    
}
    public void display(){
        System.out.println("Employee ID: "+id
                +"\nFirst Name: "+this.firstname
                +"\nLast Name: "+this.lastname
                +"\nEmail: "+this.email
                +"");
    }
     
}
 

   
