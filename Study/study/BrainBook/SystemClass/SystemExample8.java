package SystemClass;

public class SystemExample8
{
    public static void main(String[] args)
    {
        /*
         * gc�޼ҵ�
         * ������ �÷��Ͱ� �� ���� ���� �ϵ��� ������ �Ҷ� SystemŬ������ gc�޼ҵ带 ����ϸ� �ȴ�.
         * System.gc(); ������ �÷��Ͱ� ������ ���� ���� �ϵ��� �ڹ� ���� ��迡�� ��û�ϴ� �޼ҵ�
         * 
         */
        ResourceUser obj = new ResourceUser();
        obj.use();
        obj = null;
        System.gc();
    }
}
