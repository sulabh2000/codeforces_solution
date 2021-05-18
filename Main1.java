import java.util.*;
public class Main1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    int[] arr = new int[0];
		    int n1=n;
		    while(n!=0)
		    {
		        int r = n%10;
		        arr = Arrays.copyOf(arr,arr.length+1);
		        arr[arr.length-1] = r;
		        n=n/10;
		    }
		    if((n1%Math.pow(10,arr.length-1))==0)
		    {
		        System.out.println("1");
		        System.out.println(n1);
		    }
		    else
		    {
		        int a[] = new int[0];
		        for(int i=0;i<arr.length;i++)
		        {
		            int ans = arr[arr.length-1-i]*(int)(Math.pow(10,arr.length-1-i));
		            if(ans>0)
		            {
		                a=Arrays.copyOf(a,a.length+1);
		                a[a.length-1] = ans;
		            }
		        }
		        System.out.println(a.length);
		            for(int i=0;i<a.length;i++)
		            {
		                System.out.print(a[i]+" ");
		            }
		            System.out.println();
		    }
		    
		    t--;
		}
	}
}
