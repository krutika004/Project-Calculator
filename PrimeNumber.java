import java.util.Scanner;
class PrimeNumber
{
public static void main(String args[])
{
    int n1;
    int n2;
    boolean flag;
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range: ");
    System.out.println("\nLowest");
    n1 = sc.nextInt();
    System.out.println("Higest");
    n2 = sc.nextInt();
    sc.close();
    
    if (n1 < 2)
        n1 = 2;
    if (n2 < 2)
    {
        System.out.println("No prime numbers in range.");
        return;
    }
    
    System.out.println("Result: ");
    for(int i = n1; i <= n2; i++)
    {
        flag = false;
        for(int j = 2; j < i; j++)
        { 
            if(i % j == 0)
            {
                flag = true;
            }
        }
        if(!flag)
            System.out.println(i);
    }
}
}