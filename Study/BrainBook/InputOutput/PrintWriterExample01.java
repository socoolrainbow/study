package InputOutput;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

public class PrintWriterExample01
{
    public static void main(String[] args)
    {
        PrintWriter writer = null;
        try
        {
            writer = new PrintWriter("output.txt");
            writer.println("    ### ����ǥ  ###    ");
            // %3s �� 3�ڸ��� ����Ÿ���� ���ϰ�, %3d �� 3�ڸ��� ����Ÿ��, %5.1f �� �Ǽ�ǥ������ 5�ڸ��� ������
            // 1�ڸ��� �Ҽ����ڸ��� ǥ���ϴ� �������̴�.
            writer.printf("%3s : %3d %3d %3d %5.1f %n", "���¾�", 92, 87, 95,
                          91.3f);
            writer.printf("%3s : %3d %3d %3d %5.1f %n", "�ӳ���", 100, 90, 80,
                          80.9f);
            writer.printf("%3s : %3d %3d %3d %5.1f %n", "��ȿ��", 95, 45, 100,
                          77.5f);
            writer.printf("%3s : %3d %3d %3d %5.1f %n", "����", 98, 86, 98,
                          88.1f);
            // CalendarŸ���� ��ü�� ǥ���ϴ� ��,��,���� �����ϴ� ���ڴ� ���� %tY, %tm, %td �̴�.
            // $1,$2,$3 �������ǰ��� �ƱԸ�Ʈ �ε�����(argument index)�� �θ��µ�, 1%�� ù��° �Ķ����,
            // 2%�� �ι�° �Ķ���� �ε����� ���Ѵ�.
            // Calentar�ǰ��� 1��°�� ���������� %1�� �־ �������� �Ѵ� !!
            writer.printf("�ۼ����� : %1$tY�� %1$tm�� %1$td��",
                          new GregorianCalendar());
            
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
            }
        }
    }
}
