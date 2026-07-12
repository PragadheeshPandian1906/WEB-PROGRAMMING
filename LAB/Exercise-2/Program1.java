import java.lang.*;
import java.util.*;

public class Program1
{

    public static int [] subset(int []nums,int startidx,int endidx)
    {
        int ans[]=new int[endidx-startidx+1];
        int k=0;
        for(int i=startidx;i<=endidx;i++)
        {
            ans[k++]=nums[i];
        }
        return ans;
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

        System.out.print("Enter start index : ");
        int start=sc.nextInt();
        System.out.print("Enter end index : ");
        int end=sc.nextInt();
        int ans[]=subset(nums,start,end);
        System.out.println("The subset is  : ");
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}