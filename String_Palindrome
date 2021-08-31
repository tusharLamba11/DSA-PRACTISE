import java.util.Scanner;

class answer{
    static boolean reverseString(String s){
        int n = s.length();
        char[] arr = s.toCharArray();

        int i,j;
        char temp;
        for( i=0,j=n-1;i<n/2;i++,j--){
            if(arr[i]==arr[j]){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        System.out.print("Enter any string");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        if(reverseString(str))
            System.out.print("String is a Palindrome" );
        else
            System.out.print("String is not a palindrome ");
    }

}
