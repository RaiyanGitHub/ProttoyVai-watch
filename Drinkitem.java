
package restmanage;
import java.io.Serializable;

public class Drinkitem extends Menuitem implements Serializable{
//    String drinkid;
//    String drinktype;
    String size;
//    double price;

    public Drinkitem(int drinkid,String name, String size, int quantity, double price) {
        super(drinkid,price,quantity,name);
        this.size = size;
        
    }
    public Drinkitem(int drinkid,String name, String size, double price) {
        super(drinkid,price,name);
        this.size = size;
        
    }
    
    

   
    
    
    public void display()
    {
        super.display();
        System.out.println("Drink size:"+size);
        
    }        
    
}