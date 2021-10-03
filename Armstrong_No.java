import java.util.Scanner;

public class Solution
{
    static boolean armstrongNo(int x)
    {
        int temp,sum=1;
        while(x>0)
        {
            temp=x%10;
            sum = sum*(temp^3);
            x=x/10;
        }
        if(sum==x)
            return true;

        return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter any number:\n");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        boolean y = armstrongNo(x);
        if(y== true)
        System.out.println("Armstrong No");
        else
           System.out.println("Not 12Armstrong No");
    }
}
