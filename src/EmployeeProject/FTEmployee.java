
package EmployeeProject;

public class FTEmployee extends Employee {
    public FTEmployee(){
        super();
    }

    public double getPay() {
      double pay = rate * 40 + (hours-40)*(rate*2);
      totalpay += pay;
      return pay;
        
    }
    
}
