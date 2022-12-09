import java.util.*;
class Main
{
    public static int len(int n,int temp)
    {
        int l=0,rev=0;
        while(n!=0)
        {
            l++;
            rev=rev*10+n%10;
            n/=10;
        }
        return temp==1?l:rev;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            int l1=len(arr[i],1),l2=len(arr[i+1],1);
            int rev1=len(arr[i],2),rev2=len(arr[i+1],2);
            int size=l1>l2?l2:l1;
            rev1=rev1/(int)Math.pow(10,size-l1);
            rev2=rev2/(int)Math.pow(10,size-l2);
            if(rev1>rev2 && l1>=size)
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}
