package chapter6;

public class SystemGenerator implements GeneratorInterface
{

    public static void main(String[] args)
    {
        SystemGenerator sysGenerator = new SystemGenerator();
        String uniqueId = sysGenerator.getUniqueValue();
        System.out.println("Generate unique ID : " + uniqueId);
    }
    @Override
    public String getUniqueValue()
    {
        // System.nanoTime()�޼ҵ�� System.currentTimeMillis()�޼ҵ�� �ٸ��� ���� �ʱ��� ��ȯ�ϹǷ� �ߺ��� ���� ���� ���ɼ��� ����.
        String rt = SystemGenerator.ID_HEADER + System.nanoTime() + SystemGenerator.DELIMITER + System.identityHashCode(this);
        return rt;
    }
    
}
