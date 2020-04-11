
package restmanage;
//import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Manager extends Employee implements Serializable{
    /*public static ArrayList<Department> departments__ALL = new ArrayList<Department>();*/
    int branchno;
//    String branchname;
//    String corporatereport;

    public Manager(int branchno, int id, String firstname, String lastname, String email, Department department, Address adress) {
        super(id, firstname, lastname, email, department, adress);
        this.branchno = branchno;
    }

    public Manager(int branchno, int id, String firstname, String lastname, String email, Department department, String street, String Town) {
        super(id, firstname, lastname, email, department, street, Town);
        this.branchno = branchno;
    }
    
    
    
    public void hireemployee()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Which position you want to hire?");
        System.out.println("/n1.Waiter");
        System.out.println("/n2.Chef");
        System.out.println("/n3.Cashier");
        System.out.println("Enter any number(1-3)");
        int n=input.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("Id no:");
                int iD=input.nextInt();
                System.out.println("Type firstname");
                String name=input.next();
                System.out.println("Type lastname");
                String name1=input.next();
                System.out.println("Email");
                String eml=input.next();
                department.id=011;
                department.name="Waiter";
                System.out.println("type streetname");
                
                adress.streetname=input.next();
                System.out.println("Type town name");
                adress.town=input.next();
                waiter waiterr=new waiter(iD,name,name1,eml,department,adress);
                //1. Create File I Stre fis<<-----Waiter Info
                //1.5. Create Object Input Stream ois <<----- fis
                //2. Extract ArrayList of waiters
                //3. Add waiterr to ArrayList 
                //4. Close The file and Object input streams
                //5. Create File and Object Outputstream
                //6. enter arraylist to file
                //7. close file and object outputstream
                try{
                
                    FileInputStream fiiis    = new FileInputStream("Employee Info");  //     Read File
                    ObjectInputStream oiiis  = new ObjectInputStream(fiiis);
                    ArrayList  Employee_ALL  = (ArrayList)oiiis.readObject();
                    Employee_ALL.add(waiterr);
                    fiiis.close();      oiiis.close();
                    
                    FileOutputStream fooos   = new FileOutputStream("Employee Info");   
                    ObjectOutputStream ouuus = new ObjectOutputStream(fooos);
                    ouuus.writeObject(Employee_ALL);
                    fooos.close();  ouuus.close();
                    
                    FileInputStream fis     = new FileInputStream("Waiter Info");  //     Read File
                    ObjectInputStream ois   = new ObjectInputStream(fis);        //     Read Object from file 
                    ArrayList  Waiter_ALL    = (ArrayList)ois.readObject();       //
                    Waiter_ALL.add(waiterr);
                    fis.close();        ois.close();
                    FileOutputStream fos = new FileOutputStream("Waiter Info");   
                    ObjectOutputStream ous = new ObjectOutputStream(fos);
                    ous.writeObject(Waiter_ALL);
                    fos.close();    ous.close();
                    
                
                }catch(FileNotFoundException e){
                    try {
                        FileOutputStream fooos            = new FileOutputStream("Employee Info");   //fus
                        ObjectOutputStream ouuus          = new ObjectOutputStream(fooos);       //ous
                        ArrayList<Employee> employee_List = new ArrayList<Employee>();        // created array List
                        employee_List.add(waiterr);
                        fooos.close();      ouuus.close();
                        
                        ouuus.writeObject(employee_List);
                        fooos.close();
                        ouuus.close();
                        
                        
                        FileOutputStream fos = new FileOutputStream("Waiter Info");   //fus
                        ObjectOutputStream ous = new ObjectOutputStream(fos);       //ous
                        ArrayList<waiter> Waiter_List = new ArrayList<waiter>();        // created array List
                        Waiter_List.add(waiterr);                                      // added the newly created chef to arr
                        
                        ous.writeObject(Waiter_List);                                 //written the arrayList into the file
                        fos.close();                                                //closed the fileoutputStream
                        ous.close();                                                //closed the object outputstream
                        
                        
                    } catch (Exception exe) {
                            System.out.println(exe);
                    }
                
                } catch (Exception ex) { 
                    System.out.println(ex);
                } 
                 
                break;
                
            case 2:
                
                 System.out.println("Id no:");
                int iDc=input.nextInt();
                System.out.println("Type firstname");
                String namec=input.next();
                System.out.println("Type lastname");
                String name1c=input.next();
                System.out.println("Email");
                String emlc=input.next();
                department.id=012;
                department.name="Chef";
                System.out.println("type streetname");
                
                adress.streetname=input.next();
                System.out.println("Type town name");
                adress.town=input.next();
                 Chefs chef01=new Chefs(iDc,namec,name1c,emlc,department,adress);
                //1. Create File I Stre fis<<-----Waiter Info
                //1.5. Create Object Input Stream ois <<----- fis
                //2. Extract ArrayList of waiters
                //3. Add chef to ArrayList 
                //4. Close The file and Object input streams
                //5. Create File and Object Outputstream
                //6. enter arraylist to file
                //7. close file and object outputstream
                try{
                
                    FileInputStream fiiis    = new FileInputStream("Employee Info");  //     Read File
                    ObjectInputStream oiiis  = new ObjectInputStream(fiiis);
                    ArrayList  Employee_ALL  = (ArrayList)oiiis.readObject();
                    Employee_ALL.add(chef01);
                    fiiis.close();      oiiis.close();
                    
                    FileOutputStream fooos   = new FileOutputStream("Employee Info");   
                    ObjectOutputStream ouuus = new ObjectOutputStream(fooos);
                    ouuus.writeObject(Employee_ALL);
                    fooos.close();  ouuus.close();
                    
                    FileInputStream fis     = new FileInputStream("Chef Info");  //     Read File
                    ObjectInputStream ois   = new ObjectInputStream(fis);        //     Read Object from file 
                    ArrayList  Chef_ALL    = (ArrayList)ois.readObject();       //
                    Chef_ALL.add(chef01);
                    fis.close();        ois.close();
                    FileOutputStream fos = new FileOutputStream("Chef Info");   
                    ObjectOutputStream ous = new ObjectOutputStream(fos);
                    ous.writeObject(Chef_ALL);
                    fos.close();    ous.close();
                    
                
                }catch(FileNotFoundException e){
                    try {
                        FileOutputStream fooos            = new FileOutputStream("Employee Info");   //fus
                        ObjectOutputStream ouuus          = new ObjectOutputStream(fooos);       //ous
                        ArrayList<Employee> employee_List = new ArrayList<Employee>();        // created array List
                        employee_List.add(chef01);
                        fooos.close();      ouuus.close();
                        
                        ouuus.writeObject(employee_List);
                        fooos.close();
                        ouuus.close();
                        
                        FileOutputStream fos = new FileOutputStream("Chef Info");   //fus
                        ObjectOutputStream ous = new ObjectOutputStream(fos);       //ous
                        ArrayList<Chefs> Chef_List = new ArrayList<Chefs>();        // created array List
                        Chef_List.add(chef01);                                      // added the newly created chef to arr
                        
                        ous.writeObject(Chef_List);                                 //written the arrayList into the file
                        fos.close();                                                //closed the fileoutputStream
                        ous.close();                                                //closed the object outputstream
                        
                        
                    } catch (Exception exe) {
                            System.out.println(exe);
                    }
                
                } catch (Exception ex) { 
                    System.out.println(ex);
                } 
                break;
                
            case 3:
                
                System.out.println("Id no:");
                int iDm=input.nextInt();
                System.out.println("Type firstname");
                String namem=input.next();
                System.out.println("Type lastname");
                String name1m=input.next();
                System.out.println("Email");
                String emlm=input.next();
                department.id=013;
                department.name="Cashier";
                System.out.println("type streetname");
                
                adress.streetname=input.next();
                System.out.println("Type town name");
                adress.town=input.next();
                Cashier bright=new Cashier(iDm,namem,name1m,emlm,department,adress);
                //1. Create File I Stre fis<<-----Waiter Info
                //1.5. Create Object Input Stream ois <<----- fis
                //2. Extract ArrayList of waiters
                //3. Add waiterr to ArrayList 
                //4. Close The file and Object input streams
                //5. Create File and Object Outputstream
                //6. enter arraylist to file
                //7. close file and object outputstream
                try{
                
                   
                    FileInputStream fiiis    = new FileInputStream("Employee Info");  //     Read File
                    ObjectInputStream oiiis  = new ObjectInputStream(fiiis);
                    ArrayList  Employee_ALL  = (ArrayList)oiiis.readObject();
                    Employee_ALL.add(bright);
                    fiiis.close();      oiiis.close();
                    
                    FileOutputStream fooos   = new FileOutputStream("Employee Info");   
                    ObjectOutputStream ouuus = new ObjectOutputStream(fooos);
                    ouuus.writeObject(Employee_ALL);
                    fooos.close();  ouuus.close();
                    
                    
                    FileInputStream fis      = new FileInputStream("Cashier Info");  //     Read File
                    ObjectInputStream ois    = new ObjectInputStream(fis);           //     Read Object from file 
                                                                                     //     Read Object from file 
                    ArrayList  Cashier_ALL   = (ArrayList)ois.readObject();          //
                    
                    Cashier_ALL.add(bright);
                    fis.close();        ois.close();
                    
                    FileOutputStream fos   = new FileOutputStream("Cashier Info");   
                    ObjectOutputStream ous = new ObjectOutputStream(fos);
                    ous.writeObject(Cashier_ALL);
                    fos.close();    ous.close();
                    
                
                }catch(FileNotFoundException e){
                    try {
                        
                        FileOutputStream fooos            = new FileOutputStream("Employee Info");   //fus
                        ObjectOutputStream ouuus          = new ObjectOutputStream(fooos);       //ous
                        ArrayList<Employee> employee_List = new ArrayList<Employee>();        // created array List
                        employee_List.add(bright);
                        fooos.close();      ouuus.close();
                        
                        ouuus.writeObject(employee_List);
                        fooos.close();
                        ouuus.close();
                        
                        FileOutputStream fos            = new FileOutputStream("Cashier Info");   //fus
                        ObjectOutputStream ous          = new ObjectOutputStream(fos);       //ous
                        ArrayList<Cashier> Cashier_List = new ArrayList<Cashier>();        // created array List
                        Cashier_List.add(bright);                                      // added the newly created chef to arr
                        
                        ous.writeObject(Cashier_List);                                 //written the arrayList into the file
                        fos.close();                                                //closed the fileoutputStream
                        ous.close();                                                //closed the object outputstream
                        
                        
                    } catch (Exception exe) {
                            System.out.println(exe);
                    }
                
                } catch (Exception ex) { 
                    System.out.println(ex);
                } 
                break;
            default:
                System.out.println("Type correct number");          
                
        }
         
    }
      
}
