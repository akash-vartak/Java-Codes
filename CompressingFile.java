import java.io.*;
import java.util.zip.*;

public class CompressingFile
{
    public static void doCompressFile(String inFileName)
    {
        try
        {
            File file = new File(inFileName);
            System.out.println(" you are going to gzip the: "+ file + "file");
            FileOutputStream fos = new FileOutputStream(file+".gz");
            System.out.println(" Now the name of this gzip file is: "+ file + ".gz" );
            GZIPOutputStream gzos = new GZIPOutputStream(fos);
            System.out.println("opening the input stream");
            FileInputStream fin = new FileInputStream(file);
            BufferedInputStream in = new BufferedInputStream(fin);
            System.out.println("Transferring file from" + inFileName + " to "+ file + ".gz");
            byte[] buffer = new byte[1024];
            int i;
            while ((i = in.read(buffer)) >= 0)
            {
                gzos.write(buffer,0,i);
            }
            System.out.println(" file is in now gzip format");
            in.close();
            gzos.close();
        }
        catch(IOException e)
        {
            System.out.println("Exception is" + e);
        }
    }  


    public static void main(String args[])throws IOException
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        if(args.length!=1)
        {
            System.err.println("Please enter the file name which needs to be compressed ");
            doCompressFile(obj.readLine());
        }
        else
        {
            doCompressFile(args[0]);
        }
    }
}

/*
   
na jaane Q aisa lagta hai
tune zindagi badal di
kabhi soochta hun toh lagata hai
tune mujhe badal diya
lekin gaur kiya to saamajh aaya
ki tune toh zindagi ka nazariya badal diya

kuch mahino pehele tak
ham eek dusare ko bhul chuke they
lekin jab pichale hafte
tu "amrica" keliye rawana hui
aisa laga jaise koi apna, koi mera, koi pyaara
duur jaa raha hai

Landsat, google earth aur kuch other secret tech
use karke maan ko laga ki tu ittni bhi duur nahi hai
lekin dimag jaanta hai....intelligent hai yaar....
wahan "tu kaise hogi??"...yeh sooch kar
main kuch nahi kar sakta

<<Sweet music>>
Ho love of mine
with a song and a wine
its harsh and divine
like truths and a lie

but the tale ends not here
there's nothing to fear
for my love's a yell forgiving and holdin on

in the bright emptininess
in a room full of it
there's a cruel misteress...my hearttttt
and i fell the unrest
that nests all hollowness
for i have nowhere to go when i'm coldddd

AND i fell so looo oooo nely ,yeah!!
there's a better place than this
emptinessss yeah
and i'm so   looo ooo oonely yeahhh
there's a better place than this
it's emptinesssss.....yeah ah aha ah <<Sentimental music>>


   
   */