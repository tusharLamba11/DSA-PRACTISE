public class Solution{
    public static void main(String[] args){
        int[] a = {1,2,3,4};
        int[] result = productExceptSelf(a);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }


    }
    public static int[] productExceptSelf(int[] nums)
    {
        int[] res = new int[nums.length];
        int zero=0;
        int product = 1;
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i]==0)
                zero++;
            else
                product = product * nums[i];
        }

        for(int i=0 ; i<nums.length ; i++)
        {
            if(zero==1)
            {
                if(nums[i]==0)
                    res[i]=product;
                else
                    res[i]=0;
            }

            else if(zero>1)
                res[i]=0;

            else if(zero==0)
                res[i]=product/nums[i];
        }
        return res;
    }

}
