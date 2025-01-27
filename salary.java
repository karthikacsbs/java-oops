package inheritance;
class programmer{
    int sal = 40000;
    
}
class salary extends programmer{
    int bonus = 15000;
    public static void main(String[] args) {
         salary   s  = new salary();
         System.out.println("monthy salary of programmer"+s.sal);
        System.out.println("bonus of programmer"+s.bonus);
    }

}


