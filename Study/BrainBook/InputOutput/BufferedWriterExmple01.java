package InputOutput;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExmple01
{
    public static void main(String[] args)
    {
        BufferedWriter out = null;
        try
        {
            out = new BufferedWriter(new FileWriter("output.txt"));
            char arr[] = { '��', '��', '��', '��', '��', '��', ' ', 'J', 'A', 'V',
                    'A' };
            for (int cnt = 0; cnt < arr.length; cnt++)
            {
                out.write(arr[cnt]);
            }
        }
        catch (IOException ioe)
        {
            System.out.println("���Ϸ� ����� �� �����ϴ�.");
        }
        finally
        {
            try
            {
                out.close();
            }
            catch (Exception e)
            {
            }
        }
    }
}
