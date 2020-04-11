
package restmanage;
import java.io.Serializable;

public class Fooditem extends Menuitem implements Serializable{
    
//    String foodid;
//    String foodname;
//   String quantity;
//   double price;



    public Fooditem(int itemid, double itemprice, int quantity, String name) {
        super(itemid, itemprice, quantity, name);
    }

    public Fooditem(int itemid, double itemprice, String name) {
        super(itemid, itemprice, name);
    }

   
    

    
    
    
}