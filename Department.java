
package restmanage;

import java.io.Serializable;


public class Department implements Serializable {
    
    public int id;
    public String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }
    
    
    
}
