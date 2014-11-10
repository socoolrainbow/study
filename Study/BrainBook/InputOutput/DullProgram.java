package InputOutput;
import java.io.FileWriter;
import java.io.IOException;


public class DullProgram
{
    public static void main(String[] args)
    {
        FileWriter writer = null;
        try
        {
            writer = new FileWriter("output.txt");
            String str1 = "�� �ʹ� �Ҷ���";
            String str2 = "�ٴ� �Ҹ��� �⸮���Ѵ�.";
            for (int cnt = 0; cnt < str1.length(); cnt++)
            {
                writer.write(str1.charAt(cnt));
            }
            writer.write('\n');
            for (int cnt = 0; cnt < str2.length(); cnt++)
            {
                writer.write(str2.charAt(cnt));
            }
            writer.write('\n');
            
        }
        catch (IOException ioe)
        {
            System.out.println("���Ϸ� ����� �� �����ϴ�.");
        }
        finally
        {
            try
            {
                writer.close();
            }
            catch (Exception e)
            {
                System.out.println("������ ���������� ���� ���߽��ϴ�.");
            }
        }
    }
}
