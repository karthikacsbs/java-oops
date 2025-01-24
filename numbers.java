// Use of Object and Classes in Java

class numbers {
    // Properties
    public int a;
    public int b;

    // Methods
    public void sum() { System.out.println(a + b); }

    public void sub() { System.out.println(a - b); }

    public static void main(String[] args)
    {

        // Creating Instance of Class
        // Object
        numbers obj = new numbers();

        // Assigning Values to the Properties
        obj.a = 1;
        obj.b = 2;

        // Using the Methods
        obj.sum();
        obj.sub();
    }
}