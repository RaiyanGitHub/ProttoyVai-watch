
package restmanage;
import java.io.Serializable;
public class Menuitem implements Serializable{
    int itemid;
    double itemprice;
    boolean available;
    int  quantity;
  String itemdescription;

    public Menuitem(int itemid, double itemprice, int quantity, String itemdescription) {
        this.itemid = itemid;
        this.itemprice = itemprice;
        this.quantity = quantity;
        this.itemdescription = itemdescription;
    }
  
  public void display()
  {
      System.out.println("Item id="+itemid);
      System.out.println("Price="+itemprice);
      System.out.println("Quantity="+quantity);
      System.out.println("Description:"+itemdescription);
  }
}
