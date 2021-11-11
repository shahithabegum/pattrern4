import java.util.*;
class pattern9	
{
     public static void main(String arg[])
    {
        try{
            int n,i,j;
            Scanner t=new Scanner(System.in);
            System.out.println("Enter n");
            n=t.nextInt();
            for(i=n;i>=1;i--)
             {
                   for(j=1;j<=i;j++)
                    {
                                System.out.print("*");
                    }
                     System.out.println();
               }
       }
       catch(Exception e)
	{
	   System.out.println(e);
	 }
       }
}
