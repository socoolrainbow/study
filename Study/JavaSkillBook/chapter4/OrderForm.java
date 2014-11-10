package chapter4;

public class OrderForm
{
    
    public static void main(String[] args)
    {
        // �Ʒ��� �����̸� �̷������� �ڵ��ϸ� �������� ���� ��������, ������������ OrderForm2 �������� ������!
        if (args == null || args.length == 0)
        {
            System.out
                    .println("Usage : java OrderForm [Coffee name]. [number of coffee]");
        }
        // �Ű������� 1���� ���
        else if (args.length == 1)
        {
            System.out.println("Please input number of coffee");
            System.out
                    .println("Usage : java OrderForm [Coffee name], [number of coffee]");
        }
        else if (args.length == 2)
        {
            String coffeeName = args[0];
            // 2-depth if ����
            if ("espresso".equalsIgnoreCase(coffeeName))
            {
                String verb = "";
                int count = Integer.parseInt(args[1]);
                // 3-depth if����
                if (count == 1)
                {
                    verb = "is";
                }
                else
                {
                    verb = "are";
                }
                System.out.println("Here " + verb + " " + args[1]
                        + " cup(s) of " + coffeeName);
            }
            else
            {
                System.out.println("Sorry. it is out of stock");
            }
        }
        // �Ű������� 3�� �̻��� ���
        else
        {
            System.out
                    .println("Usage : java OrderForm [Coffee name], {number of coffee]");
        }
    }
    
}
