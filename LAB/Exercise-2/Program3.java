import java.lang.*;
import java.util.*;




public class Program3 {
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
        
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!(freq.containsKey(nums[i])))
            {
                freq.put(nums[i],1);
            }
            else
            {
                freq.put(nums[i], (freq.get(nums[i]))+1);
            }
        }
        System.out.println("Element\tFrequency");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
        
        
    }
}
