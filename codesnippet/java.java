import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class SIZECONPROGRAM
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(br.readLine());
        int sumofnumbers = 0;
        while(testcase>0)
        {
            int number = Integer.parseInt(br.readLine());
            if(number>=0)
            {
                sumofnumbers = sumofnumbers + number;
            }
            testcase=testcase-1;
        }
        bw.write(sumofnumbers+"\n");
        bw.flush();
    }
}