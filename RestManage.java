/*
 *                      Presenting: Restaurant Management Project 
 *                      Featuring: Joy Bangla
 */
package restmanage;
import java.util.Scanner;
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
        System.out.println("What would you  like to do?");
        System.out.println("-------------***MainMenu***-------------------"+"\n"
            +"1. Administrative:"          
            +"2. Services:"
            +"3. Menu List:"
            +"4. Reservation:"
            +"5. Exit");
        switch(input.nextInt()){
            case 1:
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
        }
    }
    public static void main(String[] args) {
        
    }
    
}
