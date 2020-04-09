
package restmanage;

import java.io.Serializable;

public class Address implements Serializable{
    
    String streetname;
   
    String town;

    public Address(String streetname, String town) {
        this.streetname = streetname;
        
        this.town = town;
    }
    
}
