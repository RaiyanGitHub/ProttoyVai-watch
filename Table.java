
package restmanage;



public class Table {
    private int capacity;
    private final boolean free;

    public Table(int capacity, boolean free) {
        this.capacity = capacity;
        this.free = free;
    }

  
    

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void display()
    {
        System.out.println("Capacity="+capacity);
        System.out.println("free="+free);
    }
    
    
    
}
