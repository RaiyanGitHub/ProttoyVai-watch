//Declare All ArrayLists Here
package restmanage;
import java.util.*;
import java.io.*;

public class ResturantManagement {

    public static void ManagerCC(){
        Scanner InPut = new Scanner(System.in);
        System.out.println("Enter the Employee ID:");
        int ID = InPut.nextInt();
        
        System.out.println("Enter the First Name:");
        String fname = InPut.next();
        
        System.out.println("Enter the Last Name:");
        String nameL = InPut.next();
        
        System.out.println("Enter Email:");
        String email = InPut.next();
        
        System.out.println("Enter Department id");
        int deptID = InPut.nextInt();
        Department depB = null;
        /*String deptName;
        for(Department x: departments__ALL){
            if(x.id == deptID){
                 this.department = x;
            }
            else 
                System.out.println(" Department not found:");
        }
        */try{
        FileInputStream fis=new FileInputStream("Department Table");  
              ObjectInputStream ois=new ObjectInputStream(fis);              
              ArrayList  Dept_list=(ArrayList)ois.readObject();
              
              Iterator itr = Dept_list.iterator();
              while(itr.hasNext()){
                  Department x = (Department)itr.next();
                  if(x.id == deptID)
                  {depB = x; break;}
              }
              fis.close();
              ois.close();
              if(depB == null){
                  System.out.println("Error! Department does not exist!");
                  return;
              }
              
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Enter Street Name:");
        String streetname = InPut.next();
        System.out.println("Enter Town name:");
        String Town = InPut.next();
        //super(ID,fname,nameL,email,depB,streetname,Town);
        
        System.out.println("Enter Branchno:");
        String BNo = InPut.next();
        System.out.println("Enter Branch Name:");
        String BName = InPut.next();
        System.out.println("Enter Corporate report:");
        String CorpRep = InPut.next();
        
        Manager m0001 = new Manager(BNo,BName,CorpRep,ID,fname,nameL,email,depB,streetname,Town);
        ArrayList<Manager> managers__ALL = new ArrayList<Manager>();
        managers__ALL.add(m0001);
        
        try  
          {  
            //Serialization  
              FileOutputStream fos = new FileOutputStream("Manager Info");  
              ObjectOutputStream oos = new ObjectOutputStream(fos);  
              oos.writeObject(managers__ALL);  
              fos.close();  
              oos.close();  
            }catch(Exception e)  
          {  
              System.out.println(e);  
          }
        
    }//End of Manager Function
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
              FileOutputStream fos = new FileOutputStream("Department Info");  
              ObjectOutputStream oos = new ObjectOutputStream(fos);  
              oos.writeObject(departments__ALL);  
              fos.close();  
              oos.close();  
            //Deserialization  
              FileInputStream fis=new FileInputStream("Department Info");  
              ObjectInputStream ois=new ObjectInputStream(fis);              
              ArrayList<Department>  Dept_list=(ArrayList<Department>)ois.readObject();  
              
            /*//Iterating and displaying                  ///// Done!!!
              Iterator itr = Dept_list.iterator();
            // This actually works
                while(itr.hasNext()){
                    Department Node = (Department)itr.next();
                    Node.display();
                }
              
*/
                fis.close();
                oos.close();
          }catch(Exception e)  
          {  
              System.out.println(e);  
          } 
          
          //For Inserting  Info:
          
          ManagerCC();
    }// End Of Main Function
    
}
