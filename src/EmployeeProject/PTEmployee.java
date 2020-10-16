
package EmployeeProject;


public class PTEmployee extends Employee {
    public PTEmployee(){
        super();
    }

    
    public double getPay() {
      double pay = rate * 40;
      totalpay += pay;
      return pay;
        
    }
    
}
