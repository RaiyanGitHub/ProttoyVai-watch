
package restmanage;
import java.io.Serializable;

public class Fooditem extends Menuitem implements Serializable{
    
    String foodname;
    boolean wcombo;

    public Fooditem(String foodname, int itemid, double itemprice, int quantity, String itemdescription) {
        super(itemid, itemprice, quantity, itemdescription);
        this.foodname = foodname;
    }
    
    public void display()
    {
        System.out.println("Foodname="+foodname);
        System.out.println("wCombo package="+wcombo);
        super.display();
    }
    
}
