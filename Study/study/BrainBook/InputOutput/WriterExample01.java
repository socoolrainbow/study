package InputOutput;
import java.io.FileWriter;
import java.io.IOException;


public class WriterExample01
{
    public static void main(String[] args)
    {
        FileWriter writer = null;
        try
        {
            writer = new FileWriter("output.txt",true);
            char arr[] = {'��','��','��','��','��','!','!'};
            for (int cnt = 0; cnt < arr.length; cnt++)
            {
                writer.write(arr[cnt]);
            }
        }
        catch (IOException ioe)
        {
            // TODO: handle exception
            System.out.println("���Ϸ� ����� �� �����ϴ�.");
        }
        finally{
            try
            {
                writer.close();
            }
            catch (Exception e)
            {
                // TODO: handle exception
            }
        }
    }
    
}
