package InputOutput;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;


public class LineNumberExample01
{
    public static void main(String[] args)
    {
        LineNumberReader reader = null;
        try
        {
            reader = new LineNumberReader(new FileReader("poem.txt"));
            System.out.println("####### # # ������� ���� # # #######");
            while (true)
            {
                String str = reader.readLine();
                if (str == null)
                {
                    System.out.println("####### # # ������� �� # # #######");
                    break;
                }
                int lineNo = reader.getLineNumber();
                System.out.println(lineNo + ": " + str);
            }
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("������ �������� �ʽ��ϴ�.");
        }
        catch (IOException ioe)
        {
            System.out.println("������ ���� �� �����ϴ�.");
        }
        finally
        {
            try
            {
                reader.close();
            }
            catch (Exception e)
            {
                // TODO: handle exception
            }
        }
    }
}
