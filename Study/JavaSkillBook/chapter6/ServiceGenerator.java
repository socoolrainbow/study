package chapter6;

import java.util.UUID;

public class ServiceGenerator implements GeneratorInterface
{
    public static void main(String[] args)
    {
        ServiceGenerator svcGenerator = new ServiceGenerator();
        String uniqueId = svcGenerator.getUniqueValue();
        System.out.println("Generate unique ID : " + uniqueId);
    }
    @Override
    public String getUniqueValue()
    {
        // UUIDŬ������ Universal Unique ID�� ���Ӹ��� �ߺ��� Ȯ���� ���� ���� Ű���� �����Ѵ�.
        String rt = ServiceGenerator.ID_HEADER + UUID.randomUUID();
        return rt;
    }
}
