/*
 *                      Presenting: Restaurant Management Project 
 *                      Featuring: Joy Bangla
 */
package restmanage;
import java.io.*;
import java.util.*;
import static restmanage.ResturantManagement.ManagerCC;
//java.io.*;
/**
 *
 * @author U.S.E.R
 */
public class RestManage {
    public static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void MainMenu(){
        System.out.println("Welcome to our Restaurant Management Project!"+
                "Featuring:\t Team Joy Bangla!!!");
        boolean flow = true;
        while(flow){
        System.out.println("What would you  like to do?");
        System.out.println("-------------***MainMenu***-------------------"+"\n"
            +"1. Administrative:"          
            +"2. Services:"
            +"3. Menu List:"
            +"4. Reservation:"
            +"5. Exit");
        switch(input.nextInt()){
            case 1:
                System.out.println("-------------***MainMenu***-------------------"+"\n"
                    +"1. Hire Employee"          
                    +"2. Login Employee"
                    +"3. Logout Employee");
                switch(input.nextInt()){//Inside Administrative
                    case 1:/**
                     *   Hire Employee
                     */
                        ManagerCC();
                        
                
                        break;
                    case 2:// *   Login Employee
                        break;
                    case 3://**   Logout Employee
                        break;
                    
                    default:
                }
                break;
                //goto infiniteLoop;
            case 2://service:
                System.out.println("-------------***MainMenu***-------------------"+"\n"
                    +"1. Place Order:"          
                    +"2. Bill Order:"
                    +"3. Take Out:"
                    +"4. Accept Order:");
                    
                switch(input.nextInt()){
                    case 1: //Place Order
                        break ;
                    case 2:     // BILL Order
                        break;
                    case 3:     //Take Out
                        break;
                    case 4:     //Accept Order
                        
                    default:

                    }
                break;
            
            case 3:     //Consumer Choice   Menu and what not 
                System.out.println("-------------***MainMenu***-------------------"+"\n"
                    +"1. Food Menu:"          
                    +"2. Check Item Available:");
            
                switch(input.nextInt()){
                    case 1:     //FoodMenu
                        break;
                    case 2:     //Check Item Available
                        break;
                    default:

                }
                break;
            case 4:     //Fixed Assets:
                System.out.println("-------------***MainMenu***-------------------"+"\n"
                    +"1. Reservation:"          
                    +"2. Dining Rooms available:"                    
                    +"3. Tables Available");
                switch(input.nextInt()){
                    case 1://       Reservation 
                        break;
                    case 2://       DiningRooms Available
                        break;
                    case 3://       Tables Unoccupied
                        break;
                    case 4://       Floors Available
                        break;
                }
                break;
            case 5:       //
                System.out.println("Exiting......");
                flow = false;
                break;
            default:
        }
        
    }
         
}
    public static void main(String[] args) {
        MainMenu();
    }
/*      testing method ArrayList 
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
              FileOutputStream fos=new FileOutputStream("Department Table.txt");  
              ObjectOutputStream oos=new ObjectOutputStream(fos);  
              oos.writeObject(departments__ALL);  
              fos.close();  
              oos.close();  
              //Deserialization  
              FileInputStream fis=new FileInputStream("Department Table.txt");  
              ObjectInputStream ois=new ObjectInputStream(fis);  
            ArrayList<Department>  Dept_list=(ArrayList<Department>)ois.readObject();  
            
            Iterator itr = Dept_list.iterator();
            while(itr.hasNext()){
                    Department Node = (Department)itr.next();
                    Node.display();
                    //System.out.println(Node.toString()+" ");
                }    
          }catch(Exception e)  
          {  
              System.out.println(e);  
          }  
    }
*/
}
