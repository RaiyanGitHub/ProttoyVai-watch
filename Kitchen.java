
package restmanage;

public class Kitchen {
    private int numberstoves;
    private int numberstoveswrking;
    private int numberofemply;
  private  double servingcapacity;
  private Chefs[] chefsassingn;
  private Employee[] employeeasng;

    public Kitchen(int numberstoves, int numberstoveswrking, int numberofemply, double servingcapacity, Chefs[] chefsassingn, Employee[] employeeasng) {
        this.numberstoves = numberstoves;
        this.numberstoveswrking = numberstoveswrking;
        this.numberofemply = numberofemply;
        this.servingcapacity = servingcapacity;
        this.chefsassingn = chefsassingn;
        this.employeeasng = employeeasng;
    }

    public int getNumberstoves() {
        return numberstoves;
    }

    public void setNumberstoves(int numberstoves) {
        this.numberstoves = numberstoves;
    }

    public int getNumberstoveswrking() {
        return numberstoveswrking;
    }

    public void setNumberstoveswrking(int numberstoveswrking) {
        this.numberstoveswrking = numberstoveswrking;
    }

    public int getNumberofemply() {
        return numberofemply;
    }

    public void setNumberofemply(int numberofemply) {
        this.numberofemply = numberofemply;
    }

    public double getServingcapacity() {
        return servingcapacity;
    }

    public void setServingcapacity(double servingcapacity) {
        this.servingcapacity = servingcapacity;
    }

    public Chefs[] getChefsassingn() {
        return chefsassingn;
    }

    public void setChefsassingn(Chefs[] chefsassingn) {
        this.chefsassingn = chefsassingn;
    }

    public Employee[] getEmployeeasng() {
        return employeeasng;
    }

    public void setEmployeeasng(Employee[] employeeasng) {
        this.employeeasng = employeeasng;
    }
  
  public void display()
  {
      System.out.println("Number of stoves="+numberstoves);
      System.out.println("Number of employees assigned="+numberofemply);
      System.out.println("Number of stoves not working="+numberstoveswrking);
      System.out.println("Serving Capacity="+servingcapacity);
      
  }
  public int stoveavailable()
  {
      int available=numberstoves-numberstoveswrking;
      return available;
  }
    
}
