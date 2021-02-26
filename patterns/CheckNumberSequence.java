// You are given S a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a way that the first part is strictly decreasing while the second is strictly increasing one.
//  Note : We say that x is strictly larger than y when x > y.
// So, a strictly increasing sequence can be 1 4 8. However, 1 4 4 is NOT a strictly increasing sequence.

// That is, in the sequence if numbers are decreasing, they can start increase at one point. And once number starts increasing, they cannot decrease at any point further.
// Sequence made up of only increasing numbers or only decreasing numbers is a valid sequence. So in both the cases, print true.

// You just need to print true/false. No need to split the sequence.

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		// Write your code here
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n==0||n==1)
		{
		    System.out.print("true");
		    return;
		}
		int no=0,x2;
		int x1=scan.nextInt();
		n--;
		while(n!=0)
		{
		    x2=scan.nextInt();
		    if(x2>x1)
		    {
		        no++;
		    }
            else if(x2==x1)
            {
                System.out.print("false");
                return;
            }
		    x1=x2;
		    n--;
		    if(no==1)
		    {
		        break;
		    }
		}
		while(n!=0)
		{
		    x2=scan.nextInt();
		    if(x2<x1)
		    no--;
            else if(x1==x2)
            {
                System.out.print("false");
                return;
            }
		    x1=x2;
		    if(no==0)
		    {
		        System.out.print("false");
		        return;
		    }
            
		    n--;
		}
		        System.out.print("true");
	}
}

