package chapter4;

public class RuntimeErrorSample2
{
    public static void main(String[] args)
    {
        // �Ű����� ���� Ŭ������ ����Ǹ� ������ �񱳹����� NullPointerException�� �߻��Ѵ�.
        // �̷� ������ �������� RuntimeErrorSample3ó�� �ڵ�����~!
        String nullStr = null;
        if (nullStr.equals("test"))
        {
            System.out.println("Find out where it is");
        }
    }
}
