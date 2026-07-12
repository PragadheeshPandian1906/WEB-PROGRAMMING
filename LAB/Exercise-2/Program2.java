import java.util.Scanner;

public class Program2 {
    public static int[] findMinAndMax(int nums[])
    {
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        return new int[]{min,max};
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter array size n : ");
        n=sc.nextInt();
        int nums[]=new int[n];  

        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }

        int [] ans=findMinAndMax(nums);
        System.out.printf("The minimum and maximum numbers in the array is : %d and %d \n",ans[0],ans[1]);
    }
}
