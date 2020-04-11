
package restmanage;
import java.io.Serializable;
public class Menuitem implements Serializable{
    int itemid;
    double itemprice;
    boolean available;
    int  quantity;
  String name;

    public Menuitem(int itemid, double itemprice, int quantity, String name) {
        this.itemid = itemid;
        this.itemprice = itemprice;
        this.quantity = quantity;
        this.name = name;
    }
    public Menuitem(int itemid, double itemprice, String name) {
        this.itemid = itemid;
        this.itemprice = itemprice;
     
        this.name = name;
    }
  
  public void display()
  {
      System.out.println("Item id="+itemid);
      System.out.println("Price="+itemprice);
      System.out.println("Quantity="+quantity);
      System.out.println("Description:"+name);
  }
}
