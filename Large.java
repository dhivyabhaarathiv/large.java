import java.util.*;
public class Large
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if(n1>n2 && n1>n3)
        {
        System.out.println(n1+" is the largest number");
        }
        if(n2>n3 && n2>n1)
        {
        System.out.println(n2+" is the largest number");
        }
        if(n3>n2 && n3>n1)
        {
        System.out.println(n3+" is the largest number");
        }
        }
        }
