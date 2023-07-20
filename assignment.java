import java.util.*;
class assignment
{
    public static void rotation(int a[],int c)
    {
        int b=a.length;
        c%=b;
        int rotatedarray[] = new int[b];
        System.arraycopy(a,b-c,rotatedarray,0,c);
        System.arraycopy(a,0,rotatedarray,c,b-c);
        System.out.println("THE ROTATED ARRAY IS:");
        for(int i:rotatedarray)
        {
            System.out.println(i);
        }

    }
        public static void main(String[] args) { 
             Scanner input=new Scanner(System.in);
             int n;
             System.out.println("ENTER THE TOTAL NO. OF ELEMENTS:");;
             n=input.nextInt();
             int a[] = new int[n];
             for(int i=0;i<n;i++)
             {
                System.out.println("ENTER ELEMENT - "+(i+1)+":");
                a[i]=input.nextInt();
             }
             System.out.println("ENTER THE ROTATION COUNT: ");
             int c=input.nextInt();
             rotation(a,c);
    }
}