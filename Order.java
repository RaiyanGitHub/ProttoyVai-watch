
package restmanage;

public class Order {
    
    int orderid;
    int customerid;
    String customername;
    Fooditem fooditem;
    Drinkitem drinkitem;
    boolean takeout;

    public Order(int orderid, int customerid, String customername, Fooditem fooditem, Drinkitem drinkitem, boolean takeout) {
        this.orderid = orderid;
        this.customerid = customerid;
        this.customername = customername;
        this.fooditem = fooditem;
        this.drinkitem = drinkitem;
        this.takeout = takeout;
    }
    
    public void display()
    {
        System.out.println("Order ID="+orderid);
        System.out.println("Customer ID="+customerid);
        System.out.println("Customer Name="+customername);
    }
    
}
