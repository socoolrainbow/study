package InputOutput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamExample01
{
    public static void main(String[] args)
    {
        DataInputStream in = null;
        try
        {
            in = new DataInputStream(new FileInputStream("output.dat"));
            // ������ ����.
            while (true)
            {
                int data = in.readInt();
                System.out.println(data);
                // ���Ϸκ��� ������ �о ����Ѵ�.
                if (data == -1)
                {
                    break;
                }
            }
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("������ �������� �ʽ��ϴ�.");
        }
        catch (EOFException eofe)
        {
            System.out.println("��");
        }
        catch (IOException ioe)
        {
            System.out.println("������ ������ �����ϴ�.");
        }
        finally
        {
            try
            {
                in.close();
            }
            catch (Exception e)
            {
                // TODO: handle exception
            }
        }
        
    }
}
