import java.util.Scanner;
public class DiamondOfStars {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        int n,i=1,j=0,space,star,t,l=1,u,p;
        n=sc.nextInt();
        t=n/2+1;
        while(i<=t)
        {
            space=t-i;
                while(space-- >0)
                    System.out.print(" ");
            j=2*i-1;
            l=j;
            while(j-- >0)
                System.out.print("*");
            System.out.println();
            i++;
        }
        i=t+1;
        space=1;
         int k=l;
        while(i<=n)
        {
            p=space;
            while(p-->0)
                System.out.print(" ");
            k-=2;
            u=k;
            while(u-->0)
                System.out.print("*");
            System.out.println();
            i++;
            space++;
        }
    }
}
