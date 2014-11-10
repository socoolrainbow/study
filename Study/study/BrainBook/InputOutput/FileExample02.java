package InputOutput;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample02
{
    public static void main(String[] args)
    {
        FileWriter writer = null;
        try
        {
            // ���丮�� �⺻������ ó���� ����� ��������... �³�?
            File tmpdir = new File("C:\\temp");
            tmpdir.mkdir();
            File file = File
                    .createTempFile("tmp", ".txt", new File("C:\\temp"));
            writer = new FileWriter(file);
            writer.write('��');
            writer.write('��');
        }
        catch (IOException ioe)
        {
            System.out.println("�ӽ� ���Ͽ� �� �� �����ϴ�.");
        }
        finally
        {
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
