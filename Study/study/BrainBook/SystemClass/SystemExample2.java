package SystemClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemExample2
{
    public static void main(String[] args)
    {
        /*
         * InputStreamReaderŬ������ ���Ҿ� BufferedReaderŬ������ �Բ�����Ͽ�
         * Ű����� �Է¹��� �����͸� ���� ������ �о ó���Ҽ� �ִ�.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String str = reader.readLine();
            System.out.println("�Էµ� ���ڿ�: " + str);
        }
        catch (IOException ioe)
        {
            System.out.println("Ű���� �Է� ����~!");
        }
    }
}
