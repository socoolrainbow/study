package chapter2;

public class CharUsage
{
    
    public static void main(String[] args)
    {
        char tab = '\t';
        // line feed ���๮��
        char linefeed = '\n';
        // carrage return ���͹���
        char cRetrun = '\r';
        // �ֵ���ǥ
        char dQuote = '\"';
        // Ȭ����ǥ
        char sQuote = '\'';
        // ��������
        char bSlash = '\\';
        
        System.out.println("1> ABCD" + tab + "EFG");
        System.out.println("2> ABCD" + linefeed + "EFG");
        System.out.println("3> ABCD" + cRetrun + "EFG");
        System.out.println("4> ABCD" + dQuote + "EFG");
        System.out.println("5> ABCD" + sQuote + "EFG");
        System.out.println("6> ABCD" + bSlash + "EFG");
        
        /*
         * �����ǵ�� LF��� ǥ���ϸ� Ŀ���� ���� ������ �ű�� ����� �Ѵ�. ĳ���� ������ CR�̶�� ǥ���ϸ� ���� ���� ���ʿ�
         * ��ġ��Ű�� ������ �Ѵ�. ���� ���α׷��ֿ��� LF�� CR�� ���� ��(����)���� �̵���Ű�µ� ����ϰ� ������ �� ���� ����
         * ���ڶ�� �Ѵ�. �����쿡���� ���� ���ڸ� '\r\n'���� ����ϰ� UNIX������ '\n'�� ����Ѵ�.
         */
    }
    
}
