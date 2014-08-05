import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class SIZECONPROGRAM
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(bufferReader.readLine());
        int sumofnumbers = 0;
        while(testcase>0)
        {
            int number = Integer.parseInt(bufferReader.readLine());
            if(number>=0)
            {
                sumofnumbers = sumofnumbers + number;
            }
            testcase=testcase-1;
        }
        bufferWriter.write(sumofnumbers+"\n");
        bufferWriter.flush();
    }
}