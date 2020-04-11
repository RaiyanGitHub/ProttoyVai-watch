//Declare All ArrayLists Here
package restmanage;
import java.util.*;
import java.io.*;

public class ResturantManagement {
    public static void FoodCC(){
        Scanner InPut = new Scanner(System.in);
        System.out.println("Enter the Item ID:");
        String ID = InPut.next();
        
          System.out.println("Enter the Name:");
        String nameL = InPut.next();
        System.out.println("Enter the Item Price:");
        double price = InPut.nextDouble();
        //change input appropriate:
     
        
        System.out.println("Enter quantity:");
        String email = InPut.next();
        
      Fooditem fooditem;
        fooditem = new Fooditem(ID,nameL,email,price);
        try{
            FileInputStream foodf    = new FileInputStream("menu Info");  //     Read File
                    ObjectInputStream ooof  = new ObjectInputStream(foodf);
                    ArrayList  Food_All  = (ArrayList)ooof.readObject();
                    Food_All.add(fooditem);
                    foodf.close();     ooof.close();
                    
                    FileOutputStream fooos   = new FileOutputStream("menu Info");   
                    ObjectOutputStream ouuus = new ObjectOutputStream(fooos);
                    ouuus.writeObject(fooditem);
                    fooos.close();  ouuus.close();
                    
        }catch(FileNotFoundException ex){
            try{
                FileOutputStream fos = new FileOutputStream("menu Info");// must create a file (if it does not exist)
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                
                ArrayList<Fooditem> Food_List = new ArrayList<Fooditem>();
                Food_List.add(fooditem);
                
                oos.writeObject(Food_List);
                
                fos.close();
                oos.close();
                
            }catch(Exception exe){System.out.println("Nested "+exe);
            
            }
        }catch(Exception e){
            System.out.println(e);
        
        }
    
    }
    
    public static void DrinkCC()
    {
               Scanner InPut = new Scanner(System.in);
        System.out.println("Enter the Item ID:");
        String ID = InPut.next();
        
          System.out.println("Enter Drinks Name:");
        String nameL = InPut.next();
        System.out.println("Enter the Item Price:");
        double price = InPut.nextDouble();
        //change input appropriate:
     
        
        System.out.println("Enter Size:");
        String email = InPut.next();
        
     
        Drinkitem drinkitem = new Drinkitem(ID,nameL,email,price);
        try{
            FileInputStream foodf    = new FileInputStream("menu Info");  //     Read File
                    ObjectInputStream ooof  = new ObjectInputStream(foodf);
                    ArrayList  Food_All  = (ArrayList)ooof.readObject();
                    Food_All.add(drinkitem);
                    foodf.close();     ooof.close();
                    
                    FileOutputStream fooos   = new FileOutputStream("menu Info");   
                    ObjectOutputStream ouuus = new ObjectOutputStream(fooos);
                    ouuus.writeObject(drinkitem);
                    fooos.close();  ouuus.close();
        
        }catch(FileNotFoundException ex){
            try{
            FileOutputStream fos = new FileOutputStream("menu Info");// must create a file (if it does not exist)
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                
                ArrayList<Drinkitem> Food_List = new ArrayList<Drinkitem>();
                Food_List.add(drinkitem);
                
                oos.writeObject(Food_List);
                
                fos.close();
                oos.close();
            }catch(Exception exx){
                System.out.println("Inner loop: "+exx);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static Manager ManagerLL(){//Input manager Id and login for manager
        //1. Create file input stream fis
        //2. create object input stream  ois
        //3. for manager create array list
        //4. import the object from the file "Manager Info"
        try{
        FileInputStream fis=new FileInputStream("Manager Info");  
              ObjectInputStream ois=new ObjectInputStream(fis);              
              ArrayList  Xman_list=(ArrayList)ois.readObject();
              fis.close();
              ois.close();
              //Upto 4. done! 
              
        //5. Now propmt User: Name or ID
        //6. search for the key in Xman_list
            Scanner innn = new Scanner(System.in);
            System.out.println("Do you want to login as a manager using:\n 1. ID \n  or\n 2. firt Name?\n or 3.lastname.");
            int choice1 = innn.nextInt();
            
                    Iterator itr = Xman_list.iterator();
            switch (choice1) {
                case 1:
                    System.out.println("Enter the ID.");
                    int key01 = innn.nextInt();
                    while(itr.hasNext()){
                        Manager Node = (Manager)itr.next();
                        if(Node.id == key01){
                            //login using Node
                            return Node;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter the Name.");
                    String key02 = innn.next();
                    while(itr.hasNext()){
                        Manager Node = (Manager)itr.next(); 
                        if(Node.firstname.matches(key02)){
                            //login using Node
                            return Node;
                        }
                    }                    
                    break;
                case 3:
                    System.out.println("Enter the Name.");
                    String key03 = innn.next();
                    while(itr.hasNext()){
                        Manager Node = (Manager)itr.next(); 
                        if(Node.lastname.matches(key03)){
                            //login using Node
                            return Node;
                        }
                    }                    
                    break;
                default:
                    System.out.println("No other Data kan be used as key... sorry");
                    break;
            }
            
        
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
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
