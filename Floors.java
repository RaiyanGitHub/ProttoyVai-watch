
package restmanage;

public class Floors {
    private Dinningrooms[] dinningrooms;
    private Kitchen[] kitchen;
    private int totalemployees;

    public Floors(Dinningrooms[] dinningrooms, Kitchen[] kitchen, int totalemployees) {
        this.dinningrooms = dinningrooms;
        this.kitchen = kitchen;
        this.totalemployees = totalemployees;
    }

    public Dinningrooms[] getDinningrooms() {
        return dinningrooms;
    }

    public void setDinningrooms(Dinningrooms[] dinningrooms) {
        this.dinningrooms = dinningrooms;
    }

    public Kitchen[] getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen[] kitchen) {
        this.kitchen = kitchen;
    }

    public int getTotalemployees() {
        return totalemployees;
    }

    public void setTotalemployees(int totalemployees) {
        this.totalemployees = totalemployees;
    }
    
    public void kitchenavailable()
    {
        System.out.println("kitchen available");
    }
    public void dinningroomsavailable()
    {
        System.out.println("dinnrooms available");
    }
    
}
