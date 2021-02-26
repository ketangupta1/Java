import java.util.Scanner;

public class TriangleOfNumbers {

	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc=new Scanner(System.in);
        int n,i=1,j,val=1,space;
        n=sc.nextInt();
        while(i<=n)
        {
            space=n-i;
            while(space-- >0)
                System.out.print(" ");
            j=i;
            int t=val;
            while(j-- >0)
            {
                System.out.print(t);
                t++;
            }
            j=i-1;
            t--;
            while(j-- >0)
            {
                t--;
                System.out.print(t);
                
            }
               System.out.println();
            i++;
            val++;
        }
	}
}
