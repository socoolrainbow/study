package chapter3;

public class StringOperation6
{
    public static void main(String[] args)
    {
        System.out.println("���� ���õ� ������ format");
        System.out.println(String.format("%,d",1000000));
        System.out.println(String.format("%,.2f", 1000000f));
        
        System.out.println("\n ���ڿ� �ڸ��� ���ߴµ� ������ format");
        // �ش� ���ڿ��� 10������ ���� ǥ��
        System.out.println(String.format("%10s", "abcde"));
        System.out.println(String.format("%10s", "abcdefghijklmnopqr"));
        
        System.out.println("\n �ε��Ҽ����� ���� ������ format");
        // %.?f �� ? �ڸ�����ŭ�� �Ҽ����� ���� �ϴ� ���Խ�
        System.out.println(String.format("%.2f", 12345.121245));
        System.out.println(String.format("%.2f", 12.1));
    }
}
