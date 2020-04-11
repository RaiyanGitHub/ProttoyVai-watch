
package restmanage;
import java.io.Serializable;

public class Drinkitem  implements Serializable{
    String drinkid;
    String drinktype;
    String size;
    double price;

    public Drinkitem(String drinkid,String drinktype, String size, double price) {
        this.drinktype = drinktype;
        this.size = size;
        this.price = price;
    }
    
    

   
    
    
    public void display()
    {
        System.out.println("Drink id="+drinkid);
        System.out.println("Drink type:"+drinktype);
        System.out.println("Drink size:"+size);
        System.out.println("Drink price:"+price);
    }        
    
}