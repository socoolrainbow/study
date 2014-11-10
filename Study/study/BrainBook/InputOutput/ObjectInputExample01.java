package InputOutput;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.GregorianCalendar;

public class ObjectInputExample01
{
    public static void main(String[] args)
    {
        ObjectInputStream in = null;
        try
        {
            in = new ObjectInputStream(new FileInputStream("output.dat"));
            while (true)
            {
                GregorianCalendar calendar = (GregorianCalendar) in
                        .readObject();
                int year = calendar.get(calendar.YEAR);
                // ���� 0���� 1���� ǥ�������� +1�� �������ش�.
                int month = calendar.get(calendar.MONTH) + 1;
                int date = calendar.get(calendar.DATE);
                // ���Ϸκ��� GregorianCalendar ��ü�� �о YYYY/MM/DD �������� ����Ѵ�.
                System.out.println(year + "/" + month + "/" + date);
            }
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("������ �������� �ʽ��ϴ�.");
        }
        catch (EOFException eofe)
        {
            // ���Ϸκ��� �� �̻� ���� ��ü�� ���� �� �߻��ϴ� �ͼ����� ó��.
            System.out.println("��");
        }
        catch (IOException ioe)
        {
            System.out.println("������ ������ �����ϴ�.");
        }
        catch (ClassNotFoundException cnfe)
        {
            System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
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
