import java.util.Scanner;

class answer{
    static void reverseString(String s){
        int n = s.length();
        char[] arr = s.toCharArray();

        int i,j;
        char temp;
        for( i=0,j=n-1;i<n/2;i++,j--){
            temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
        }
        for(char c:arr){
            System.out.print(c +" ");
        }
    }
    public static void main(String args[]){
        System.out.print("Enter any string");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.print("Reverse of the given String:" );
        reverseString(str);
    }

}
