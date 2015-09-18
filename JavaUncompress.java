import java.util.zip.GZIPInputStream;
import java.io.*;

public class JavaUncompress
{
    public static void main(String args[])throws IOException
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            //To Uncompress GZip File Contents we need to open the gzip file.....
            System.out.println("Please enter the valid file name");
            String inFilename = obj.readLine();
            System.out.println("Opening the gzip file................... :  opened");
            GZIPInputStream gzipInputStream = null;
            FileInputStream fileInputStream = null;
            gzipInputStream = new GZIPInputStream(new FileInputStream(inFilename));
            System.out.println("Opening the output file................. :  opened");
            String outFilename = inFilename +".pdf";
            OutputStream out = new FileOutputStream(outFilename);
            System.out.println("Transferring bytes from the compressed file to the output file........:Transfer successful");
            byte[] buf = new byte[1024];  //size can be changed according to programmer's need.
            int len;
            while ((len = gzipInputStream.read(buf)) > 0)
            {
                out.write(buf, 0, len);
            }
            System.out.println("The file and stream is......closing.......... : closed"); 
            gzipInputStream.close();
            out.close();
        }
        catch(IOException e)
        {
            System.out.println("Exception has been thrown" + e);
        }
    }
} 