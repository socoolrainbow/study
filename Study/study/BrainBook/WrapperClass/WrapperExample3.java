package WrapperClass;

public class WrapperExample3
{
    public static void main(String[] args)
    {
        int total = 0;
        for (int cnt = 0; cnt < args.length; cnt++)
        {
            // Parse�޼ҵ���� ���� ��ü�� �������� �ʰ� ���ڿ��� �ؼ��ϱ� ������, Example2���� ����� ���ڿ� �Ķ���͸� �޴� �����ں��� ȿ�����̴�.
            total += Integer.parseInt(args[cnt]);
        }
        System.out.println(total);
    }
}
