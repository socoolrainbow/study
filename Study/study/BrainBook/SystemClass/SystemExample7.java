package SystemClass;

public class SystemExample7
{
    public static void main(String[] args)
    {
        /*
         * exit�޼ҵ��� ��� ���� �����ִ� ���α׷�
         * 
         * exit�޼ҵ忡�� intŸ���� �Ķ���͸� �Ѱ��־�� �Ѵ�.
         * �� �Ķ���� ���� ������ ������ ������ �ٸ� ���α׷��� ���� �ڹ� ���α׷��� ȣ�� �Ǿ��� ��쿡 �����α׷��� ���� ���ɼ��� �ִ�.
         * ���ʿ� ������ �� �Ķ���� ���� 0�� ���� ���α׷��� ���� �����Ͽ����� ǥ���ϰ�, 0�� �ƴ� ���� ���� �� ���� �� ��ġ�� ������ �����Ͽ����� ǥ���Ѵ�.
         */
        
        if (args.length !=2)
        {
            System.out.println("Usage: java SystemExample7 <����> <����>");
            System.exit(1);
        }
        try
        {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int sum = num1 + num2;
            System.out.println("sum = " + sum);
            System.exit(0);
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("�߸��� ���� �Դϴ�.");
            System.exit(-1);
        }
    }
}
