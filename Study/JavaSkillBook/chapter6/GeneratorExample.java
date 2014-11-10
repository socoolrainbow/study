package chapter6;

public class GeneratorExample
{
    public static void main(String[] args)
    {
        /*
         * GeneratorInterfaceŬ������ ����ؼ� �������̽��� ���踦 ���� Ŭ�������� �������̽���� ���������� ��ĳ������ �����ϴٴ� ���� �����ش�.
         */
        ServiceGenerator svc = new ServiceGenerator();
        SystemGenerator sys = new SystemGenerator();
        
        String svcName = svc.getClass().getSimpleName();
        if (svc instanceof GeneratorInterface)
        {
            System.out
                    .println(svcName + " is a instance of GeneratorInterface");
        }
        else
        {
            System.out.println(svcName
                    + " is not a instance of generatorInterface");
        }
        
        if (svc instanceof ServiceGenerator)
        {
            System.out.println(svcName + " is a instance of ServiceGenerator");
        }
        else
        {
            System.out.println(svcName
                    + " is not a instance of ServiceGenerator");
        }
        
        String sysName = sys.getClass().getSimpleName();
        if (sys instanceof GeneratorInterface)
        {
            System.out
                    .println(sysName + " is a instance of GeneratorInterface");
        }
        else
        {
            System.out.println(sysName
                    + " is not a instance of generatorInterface");
        }
        
        if (sys instanceof SystemGenerator)
        {
            System.out.println(sysName + " is a instance of SystemGenerator");
        }
        else
        {
            System.out.println(sysName
                    + " is not a instance of SystemGenerator");
        }
        
        GeneratorInterface genIf1 = (GeneratorInterface)sys;
        GeneratorInterface genIf2 = (GeneratorInterface)svc;
    }
}
