class answer{
    static int maxSubArray(int a[]){
        int x = a.length;
        int max_ending_here = 0,max_so_far = Integer.MIN_VALUE;
        for(int i=0;i<x;i++){

            max_ending_here = max_ending_here + a[i];
            if(max_so_far<max_ending_here)
                max_so_far = max_ending_here;
            else if(max_ending_here<0)
                max_ending_here=0;

        }
        return max_so_far;
    }


    public static void main(String args[]){
    int a[] = {1,-2,2,-1,3,4,5};
    System.out.print("Max Sum is using Kadanes "+ maxSubArray(a));
    }
 }
