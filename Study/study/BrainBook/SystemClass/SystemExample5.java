package SystemClass;

import java.util.Properties;

public class SystemExample5
{
    public static void main(String[] args)
    {
        // System Property�� �о���� ���α׷�
        // �ý���������Ƽ�� �ڹ� ���α׷��� ����ȯ�濡 ���� �������� ������ �㤤�� ������ �ϴ� ������ �����̴�.
        // �ý��� ������Ƽ�� �ڹ� ���� ��ư� �ڹ� ���α׷��� ������ �� �ü���� ���� �о�ͼ� �ڵ����� �����Ѵ�.
        Properties props = System.getProperties();
        props.list(System.out);
    }
}
