//Declare All ArrayLists Here
package restmanage;
import java.util.*;
import java.io.*;

public class ResturantManagement {
    
    //public static Department[] departments__ALL = new Department();
    public static void main(String[] args) {
       //ArrayList<String> al=new ArrayList<String>();
        ArrayList<Department> departments__ALL = new ArrayList<Department>();
        Department first = new Department(101,"Management");
        Department second = new Department(201,"Cuisine");
        Department third = new Department(301,"Errands and Delivary");
        departments__ALL.add(first);    
        departments__ALL.add(second);    
        departments__ALL.add(third);    
             
            
          try  
          {  
              //Serialization  
              FileOutputStream fos=new FileOutputStream("Department Table");  
              ObjectOutputStream oos=new ObjectOutputStream(fos);  
              oos.writeObject(departments__ALL);  
              fos.close();  
              oos.close();  
              //Deserialization  
              FileInputStream fis=new FileInputStream("Department Table");  
              ObjectInputStream ois=new ObjectInputStream(fis);  
            ArrayList  Dept_list=(ArrayList)ois.readObject();  
            System.out.println(Dept_list);    
          }catch(Exception e)  
          {  
              System.out.println(e);  
          }  
    }
    
}
