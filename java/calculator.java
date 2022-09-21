import java.util.*;
class calculator {
    public static void main(String args[])
    {
        System.out.print("Enter two number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter choice :");
        int ch = sc.nextInt();
        switch(ch){
        
            case 1:System.out.println("addition is "+ (a+b));
            break;
            case 2:System.out.println("substraction is "+ (a-b));
            break;
            case 3:System.out.println("multiplication is "+ (a*b));
            break;
            case 4:System.out.println("divison is "+ (a/b));
            break;
            case 5:System.out.println("modulo is "+ (a%b));
            break;
            default:System.out.println("invalid input");


        }
    }
    
}
