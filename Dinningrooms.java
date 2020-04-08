
package restmanage;


public class Dinningrooms {
    private Table[] table;
    private int totalchair;
    private waiter[] waitrs;
    private final boolean free=true;

    public Dinningrooms(Table[] table, int totalchair, waiter[] waitrs) {
        this.table = table;
        this.totalchair = totalchair;
        this.waitrs = waitrs;
    }

    public Table[] getTable() {
        return table;
    }

    public void setTable(Table[] table) {
        this.table = table;
    }

    public int getTotalchair() {
        return totalchair;
    }

    public void setTotalchair(int totalchair) {
        this.totalchair = totalchair;
    }

    public waiter[] getWaitrs() {
        return waitrs;
    }

    public void setWaitrs(waiter[] waitrs) {
        this.waitrs = waitrs;
    }
     public int tablefree()
     {
       
           int b = 0;
           return b;
            
          }
    public int freechair()
    {
        int free=totalchair;
        return free;
        
    }
    
}
