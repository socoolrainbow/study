package WrapperClass;

public class WrapperExample4
{
    public static void main(String[] args)
    {
        Integer obj = new Integer("10");
        // ������Ƽ�� ������ ���� �ڵ����� Unboxing�ȴ�.
        // Integer��ü�� intŸ���� ���� +�����ڷ� ���ϰ� �ֽ��ϴ�. �׷��� + �����ڴ� ���� ��ü�� ���ϴ� �����ڰ� �ƴ϶�
        // ������Ƽ�� Ÿ���� ���� ���ϴ� ������ �Դϴ�. �׷��� �� ��쿡�� Integer��ü�κ��� int���� �ڵ����� ����� �Ŀ� +
        // ������ �̷�� ����.
        int sum = obj + 20;
        System.out.println(sum);
    }
}
