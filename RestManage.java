/*
 *                      Presenting: Restaurant Management Project 
 *                      Featuring: Joy Bangla
 */
package restmanage;

import java.io.*;
import java.util.*;
import static restmanage.ResturantManagement.FoodCC;
import static restmanage.ResturantManagement.DrinkCC;
import static restmanage.ResturantManagement.ManagerCC;

import static restmanage.ResturantManagement.ManagerLL;
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
    public static void MainMenu() {
        ArrayList<Employee> EMPLOYEE_ALL = new ArrayList<Employee>();
        System.out.println("Welcome to our Restaurant Management Project!"
                + "Featuring:\t Team Joy Bangla!!!");
        boolean flow = true;
        
            Manager man = new Manager(12126,"Sheikh","Ahmed","sheikh15-12126@DUUU.edu.bd");
            
        while (flow) {

            System.out.println("What would you  like to do?");
            System.out.println("-------------***MainMenu***-------------------" + "\n"
                    + "1. Administrative:"
                    + "2. Services:"
                    + "3. Menu List:"
                    + "4. Reservation:"
                    + "5. Exit");
            switch (input.nextInt()) {
                case 1:
                    System.out.println("-------------***MainMenu***-------------------" + "\n"
                            + "1. Hire Employee\n"
                            + "2. Login Employee\n"
                            + "3. Logout Employee\n"
                            + "4. Display All Employee\n");
                    //1. Open the Manager File.
                    //2. Extract the ArrayList of Managers.
                    //3. Login as a manager.
                    switch (input.nextInt()) {//Inside Administrative
                        case 1:
                            /**
                             * Call Manager Node.Hire Employee
                             */
                            
                            
                            /* VERY USEFUL CODE IF YOU DEBUG IT CORRECTLY
                            try {
                                FileInputStream fis = new FileInputStream("Manager Info");
                                ObjectInputStream ois = new ObjectInputStream(fis);
                                ArrayList Xman_list = (ArrayList) ois.readObject();
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
                                        while (itr.hasNext()) {
                                            Manager Node = (Manager) itr.next();
                                            if (Node.id == key01) {
                                                //login using Node
                                                //return Node;
                                                Node.hireemployee();
                                            }
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Enter the Name.");
                                        String key02 = innn.next();
                                        while (itr.hasNext()) {
                                            Manager Node = (Manager) itr.next();
                                            if (Node.firstname.matches(key02)) {
                                                //login using Node
                                                 Node.hireemployee();
                                            }
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Enter the Name.");
                                        String key03 = innn.next();
                                        while (itr.hasNext()) {
                                            Manager Node = (Manager) itr.next();
                                            if (Node.lastname.matches(key03)) {
                                                //login using Node
                                                Node.hireemployee();
                                            }
                                        }
                                        break;
                                    default:
                                        System.out.println("No other Data kan be used as key... sorry");
                                        break;
                                }

                            } catch (EOFException ex) {
                                System.out.println("You have no managers, enter one?");
                                if(input.next().equalsIgnoreCase("y")){
                                    
                                }
                                    
                            } catch (Exception e) {
                                System.out.println("Line 118");
                                System.out.println(e);
                            }
                            */
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
                /*
                department.id=011;
                department.name="Waiter";
                System.out.println("type streetname");
                
                adress.streetname=input.next();
                System.out.println("Type town name");
                adress.town=input.next();*/
                waiter waiterr=new waiter(iD,name,name1,eml);
                //1. Create File I Stre fis<<-----Waiter Info
                //1.5. Create Object Input Stream ois <<----- fis
                //2. Extract ArrayList of waiters
                //3. Add waiterr to ArrayList 
                //4. Close The file and Object input streams
                //5. Create File and Object Outputstream
                //6. enter arraylist to file
                //7. close file and object outputstream
                EMPLOYEE_ALL.add(waiterr); 
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
            /*  department.id=012;
                department.name="Chef";
                System.out.println("type streetname");
                
                adress.streetname=input.next();
                System.out.println("Type town name");
                adress.town=input.next();
                */
                 Chefs chef01=new Chefs(iDc,namec,name1c,emlc);
                //1. Create File I Stre fis<<-----Waiter Info
                //1.5. Create Object Input Stream ois <<----- fis
                //2. Extract ArrayList of waiters
                //3. Add chef to ArrayList 
                //4. Close The file and Object input streams
                //5. Create File and Object Outputstream
                //6. enter arraylist to file
                //7. close file and object outputstream
                EMPLOYEE_ALL.add(chef01);
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
        /*
                department.id=013;
                department.name="Cashier";
                System.out.println("type streetname");
                
                adress.streetname=input.next();
                System.out.println("Type town name");
                adress.town=input.next();
        */
                Cashier bright=new Cashier(iDm,namem,name1m,emlm);
                //1. Create File I Stre fis<<-----Waiter Info
                //1.5. Create Object Input Stream ois <<----- fis
                //2. Extract ArrayList of waiters
                //3. Add waiterr to ArrayList 
                //4. Close The file and Object input streams
                //5. Create File and Object Outputstream
                //6. enter arraylist to file
                //7. close file and object outputstream
                EMPLOYEE_ALL.add(bright);
                break;
            default:
                System.out.println("Type correct number");          
                
        }
         
    
      
                            
                            man.hireemployee();
                            break;
                        case 2:
                            try {
                                // *   Call Manger Node.Login Employee   XXXXXXXXX
                                //1. Open Employee File <<---------File Input Stream
                                //2. Extract ArrayList Of Employees from File <<---------- Object Input Stream
                                //3. Take user input <<----- Employee ID
                                //4. Search ArrayList for Employee <<------ Basic Search
                                //5. Employee.Login()
                                //6. Fis.close() & Ois.close()
                                FileInputStream fees = new FileInputStream("Employee Info");//1
                                ObjectInputStream oees = new ObjectInputStream(fees);//2
                                ArrayList employees_ALL = (ArrayList) oees.readObject();

                                System.out.println("Enter the ID of the Employee: ");//3
                                int keyID = input.nextInt();
                                /*
                                fees.close();
                                oees.close();
                                //*/
                                Iterator itr = employees_ALL.iterator();//4
                                while (itr.hasNext()) {

                                    Employee node = (Employee) itr.next();
                                    if (node.id == keyID) {
                                        node.login();
                                        fees.close();
                                        oees.close();
                                        break;
                                    }

                                }

                            } catch (Exception ex) {
                                System.out.println("Line 168");
                                man.login();
                                System.out.println(ex);
                            }

                            break;

                        case 3://**   Call Manager Node.Logout Employee

                            try {    //1. Open Employee File <<---------File Input Stream 
                                //2. Extract ArrayList Of Employees from File <<---------- Object Input Stream
                                //3. Take user input <<----- Employee ID
                                //4. Search ArrayList for Employee <<------ Basic Search
                                //5. Employee.Logout()
                                //6. Fis.close() & Ois.close()
                                FileInputStream fees = new FileInputStream("Employee Info");//1
                                ObjectInputStream oees = new ObjectInputStream(fees);//2
                                ArrayList employees_ALL = (ArrayList) oees.readObject();

                                System.out.println("Enter the ID of the Employee: ");//3
                                int keyID = input.nextInt();
                                ///*
                                fees.close();
                                oees.close();
                                //*/
                                Iterator itr = employees_ALL.iterator();//4
                                while (itr.hasNext()) {

                                    Employee node = (Employee) itr.next();
                                    if (node.id == keyID) {
                                        node.logout();
                                        /*fees.close();
                        oees.close();*/
                                        break;
                                    }

                                }
                            } catch (Exception ex) {
                                man.logout();
                                System.out.println(""+ex);
                            }
                            break;
                            
                        case 4:
                                
                            try {
                                // *   Call Manger Node.Login Employee   XXXXXXXXX
                                //1. Open Employee File <<---------File Input Stream
                                //2. Extract ArrayList Of Employees from File <<---------- Object Input Stream
                                //3. Take user input <<----- Employee ID
                                //4. Search ArrayList for Employee <<------ Basic Search
                                //5. Employee.Login()
                                //6. Fis.close() & Ois.close()
                                FileInputStream fees = new FileInputStream("Employee Info");//1
                                ObjectInputStream oees = new ObjectInputStream(fees);//2
                                ArrayList employees_ALL = (ArrayList) oees.readObject();

                                
                                Iterator itr = employees_ALL.iterator();//4
                                while (itr.hasNext()) {

                                    Employee node = (Employee) itr.next();
                                    node.display();

                                }

                            } catch (Exception ex) {
                                System.out.println("Line 233");
                                //ArrayList employees_ALL = (ArrayList) oees.readObject();

                                
                                Iterator itr = EMPLOYEE_ALL.iterator();//4
                                while (itr.hasNext()) {

                                    Employee node = (Employee) itr.next();
                                    node.display();

                                }
                                System.out.println(ex);
                            }

                            break;


                        default:
                    }

                    break;
                //goto infiniteLoop;
                case 2://service:
                    System.out.println("-------------***MainMenu***-------------------" + "\n"
                            + "1. Place Order:"
                            + "2. Bill Order:"
                            + "3. Take Out:"
                            + "4. Accept Order:");

                    switch (input.nextInt()) {
                        case 1: //Place Order
                            break;
                        case 2:     // BILL Order
                            break;
                        case 3:     //Take Out
                            break;
                        case 4:     //Accept Order

                        default:

                    }
                    break;

                case 3:     //Consumer Choice   Menu and what not 
                    System.out.println("-------------***MainMenu***-------------------" + "\n"
                            + "1. Food Menu:"
                            + "2. Check Item Available:"
                            + "3. Add Food Item"
                            + "4. Add Drink Item");

                    switch (input.nextInt()) {
                        case 1:     //FoodMenu
                            try {
                                FileInputStream foodis = new FileInputStream("Food Info");
                                ObjectInputStream foo = new ObjectInputStream(foodis);
                                
                                ArrayList Food_ALL = (ArrayList)foo.readObject();
                                
                                Iterator itr000 = Food_ALL.iterator();
                                while(itr000.hasNext()){
                                    Fooditem node = (Fooditem)itr000.next();
                                    node.display();
                                }
                                
                                FileInputStream drinkis = new FileInputStream("Drink Info");
                                ObjectInputStream oof = new ObjectInputStream(drinkis);
                                
                                ArrayList Drink_ALL = (ArrayList)oof.readObject();
                                
                                Iterator itr111 = Drink_ALL.iterator();
                                while(itr111.hasNext()){
                                    
                                    Drinkitem node = (Drinkitem)itr111.next();
                                    node.display();
                                }
                                
                            }catch(FileNotFoundException ex){
                                System.out.println("Line 254");
                                System.out.println("Accident inside:"+ex+"\nMaybe the File has not been created yet");
                                
                            } catch (Exception e) {
                                System.out.println("Line 258");
                                System.out.println(e);
                                
                            }
                            break;
                        case 2:     //Check Item Available
                            try {
                                FileInputStream foodis = new FileInputStream("Food Info");
                                ObjectInputStream foo = new ObjectInputStream(foodis);
                                
                                ArrayList Food_ALL = (ArrayList)foo.readObject();
                                
                                Iterator itr000 = Food_ALL.iterator();
                                while(itr000.hasNext()){
                                    Fooditem node = (Fooditem)itr000.next();
                                    if(node.available)
                                    node.display();
                                }
                                
                                FileInputStream drinkis = new FileInputStream("Drink Info");
                                ObjectInputStream oof = new ObjectInputStream(drinkis);
                                
                                ArrayList Drink_ALL = (ArrayList)oof.readObject();
                                
                                Iterator itr111 = Drink_ALL.iterator();
                                while(itr111.hasNext()){
                                    
                                    Drinkitem node = (Drinkitem)itr111.next();
                                    if(node.available)
                                    node.display();
                                }
                                
                            }catch(FileNotFoundException ex){
                                System.out.println("Line 291");
                                System.out.println("Accident inside:"+ex);
                            } catch (Exception e) {
                                System.out.println("Line 294");
                            }
                            break;
                        case 3:
                            FoodCC();
                            break;
                        case 4:
                            DrinkCC();
                            break;
                        default:

                    }
                    break;
                case 4:     //Fixed Assets:
                    System.out.println("-------------***MainMenu***-------------------" + "\n"
                            + "1. Reservation:"
                            + "2. Dining Rooms available:"
                            + "3. Tables Available");
                    switch (input.nextInt()) {
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
    // }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //while(true){
       /* System.out.println("Which file do you want to clear out?\n Enter its name:");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
         new FileOutputStream(fileName).close();  
        // */
        MainMenu();
        //}
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
