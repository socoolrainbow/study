package chapter4;

public class RuntimeErrorSample3
{
    
    public static void main(String[] args)
    {
        String nullStr = null;
        if ("test".equals(nullStr))
        {
            System.out.println("Find out where it is");
        }
        // null���̳� ���ڸ� ó���ϰ� ���� �ʴٸ� ������ ���� ������ if���� ����ؼ� ó���Ҽ��� �ִ�.
        //if (paramStr != null && !"".equals(paramStr))
        
    }
    
}
