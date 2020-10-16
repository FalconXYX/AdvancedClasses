package EmployeeProject;

abstract public class Employee {

    protected String name;
    
    protected double rate;
    protected int hours;
    private static double MINRATE = 6.75;
    private static double MAXRATE = 30.50;
    private static double MINHOUR = 1;
    private static double MAXHOUR = 60;
    protected static double totalpay=0; 
            

    public Employee() {
        name = "";
        //type = 0;
        rate = 0;
        hours = 0;
    }

    public final static String getNameRules() {
        return "nonblank";
    }

    public final static String getTypeRules() {
        return "1 or 2";
    }

    public final static String getRateRules() {
        return "between 6.75 and 30.50, inclusive";
    }

    public final static String getHoursRules() {
        return "between 1 and 60, inclusive";
    }

    final public boolean setName(String nm) {
        if (nm.equals("")) {
            return false;
        } else {
            name = nm;
            return true;
        }
    }

    //public boolean setType(int tp) {
    //    if (tp != 1 && tp != 2) {
     //       return false;
     //   } else {
     //       type = tp;
     //       return true;
      //  }
   // }

    final public boolean setRate(double rt) {
        if (rt < MINRATE || rt > MAXRATE) {
            return false;
        } else {
            rate = rt;
            return true;
        }
    }
    final public double getTotalpay() {
        return totalpay;
    
    }
    final public boolean setHours(int hrs) {
        if (hrs < MINHOUR || hrs > MAXHOUR) {
            return false;
        } else {
            hours = hrs;
            return true;
        }
    }

    final public String getName() {
        return name;
    }

    abstract public double getPay(); 
}
