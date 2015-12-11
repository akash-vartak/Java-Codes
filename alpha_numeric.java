import java.io.*;
public class alpha_numeric
{
    public static void main(String args[])throws IOException
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        String alphabet[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String s="";
        System.out.print("Enter the number of codes required: ");
        int count=Integer.parseInt(obj.readLine());
        System.out.println("\n(Minimum length: 3)");
        System.out.print("Enter the required code size(length) ");
        int size=Integer.parseInt(obj.readLine());
        if(size>=3)
        {
            for(int k=1;k<=count;k++)
            {
                for(int i=0;i<size;i++)
                {
                    double random=Math.random()*10;
                    if(random<5)
                    {
                        int num=(int)(Math.random()*10);
                        s+=Integer.toString(num);
                    }
                    else
                    {
                        int c=(int)(Math.random()*10);
                        s+=alphabet[c];
                    }
                }
                System.out.println(k+".\t"+s);
                s="";
            }
        }
    }
}