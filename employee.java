public class employee 
{
    // Properties Declared
    public static String Employee_name;
    public static float Employee_salary;

    // Methods Declared
 public  static void set(String n, float p) {
      Employee_name  = n;
      Employee_salary  = p;
  }

 public static void get() {
      System.out.println("Employee name is: " +Employee_name );
      System.out.println("Employee CTC is: " + Employee_salary);
  }

    // Main Method
  public static void main(String args[]) {
      employee.set("Rathod Avinash", 10000.0f);
      employee.get();
  }
}

