
package restmanage;
import java.io.Serializable;

public class Fooditem  implements Serializable{
    
    String foodid;
    String foodname;
   String quantity;
   double price;

    public Fooditem(String foodid,String foodname, String quantity, double price) {
        this.foodid=foodid;
        this.foodname = foodname;
        this.quantity = quantity;
        this.price = price;
    }

   
    

    
    public void display()
    {
        System.out.println("food id="+foodid);
        System.out.println("Foodname="+foodname);
        System.out.println("Food quantity="+quantity);
        System.out.println("Food price="+price);
    }
    
}