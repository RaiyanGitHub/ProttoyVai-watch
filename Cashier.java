
package restmanage;

import java.io.*;

public class Cashier extends Employee implements Serializable{
    
    
    Order order;

    public Cashier(Order order, int id, String firstname, String lastname, String email) {
        super(id, firstname, lastname, email);
        this.order = order;
    }

    public Cashier(int id, String firstname, String lastname, String email) {
        super(id, firstname, lastname, email);
    }

    

    
    
    public void takeorder(Order order)
    {
        System.out.println("Order id:"+order.orderid);
        System.out.println("Customer id:"+order.customerid);
    }
    public double calculation(int quantity,double perprice )
    {
        double price=quantity*perprice;
        return price;
    }
    
    public void bill(double price)
    {
        if(price>1000)
        {
           double discount=price*(10.0/100);
           double Price=price-discount;
            System.out.println("your bill is="+Price);
        }
        else if(price>2000)
        {
            double discount=price*(15.0/100);
            double Price=price-discount;
            System.out.println("your bill is="+Price);
        }
    }// end of bill 
    
}
