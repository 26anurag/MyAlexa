import java.util.*;
class table {
    public static void main(String args[])
    {   int i;
        System.out.print("Enter number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(i=1;i<=10;i++)
        {
            int table = i*n;
            System.out.println(table);
        }

    }
    
}
