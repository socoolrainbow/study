package SystemClass;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemExample1
{
    public static void main(String[] args)
    {
        // SystemŬ������ in�ʵ带 ������ InputStreamReader ��ü�� ����
        InputStreamReader reader = new InputStreamReader(System.in);
        try
        {
            while (true)
            {
                char ch = (char)reader.read();
                System.out.println("�Էµ� ���� :" + ch);
                // Ű����� �ѱ��ھ� �Է� �޾Ƽ� ����ϴ� ���� ��ħǥ�� �Էµɶ����� �ݺ��Ѵ�.
                if (ch=='.')
                {
                    break;
                }
            }
        }
        catch (IOException ioe)
        {
            System.out.println("Ű�����Է� ����!!");
        }
    }
}
