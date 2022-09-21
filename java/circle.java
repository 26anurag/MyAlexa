import java.util.*;
class circle {
    public static void main(String args[])
    {
        System.out.println("Enter radius :");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = 3.14*r*r;
        System.out.println("area of circle is = "+ area);
    }
    
}
