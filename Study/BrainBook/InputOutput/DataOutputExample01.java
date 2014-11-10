package InputOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataOutputExample01
{
    public static void main(String[] args)
    {
        DataOutputStream out = null;
        try
        {
            out = new DataOutputStream(new FileOutputStream("output.dat"));
            int arr[] = {0,1,2,3,4,5,6,7,8,9};
            for (int cnt = 0; cnt < arr.length; cnt++)
            {
                out.writeInt(arr[cnt]);
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
