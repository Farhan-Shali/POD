import java.util.*;
class Main
{
    public static int prop(int n)
    {
        int l=0;
        for(int i=1;i<n;i++)
            if(n%i==0)
                l=i;
        return l;
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
            boolean flag=true;
            for(int j=i+1;j<n;j++)
            {
                if(prop(arr[j])>prop(arr[i]))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.println(arr[i]);
        }
        System.out.println(arr[arr.length-1]);
    }
}
