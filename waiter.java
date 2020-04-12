
package restmanage;

import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class waiter extends Employee implements Serializable{



    

    public waiter(int id, String firstname, String lastname, String email) {
        super(id, firstname, lastname, email);
    }

public void deliverfood()
{
      LocalTime time=LocalTime.now();
    DateTimeFormatter timef=DateTimeFormatter.ofPattern("hh:mm:ss");
    String formattime=time.format(timef);
    System.out.println("Delivered Time:"+formattime);
    
}

}
  