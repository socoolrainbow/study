package SystemClass;

public class SystemExample3
{
    public static void main(String[] args)
    {
        /*
         * ǥ�� ��°� ǥ�� ���� ����� ��� �ϴ� ���α׷�
         */
        int arr1[] = { 77, 82, 99, 100, -27, 0, 42, -35, 60, 72 };
        
        int arr2[] = { 7, 0, 3, 0, -1, 2, 11, 5, 0, 9 };
        for (int cnt = 0; cnt < arr1.length; cnt++)
        {
            try
            {
                int result = arr1[cnt]/ arr2[cnt];
                // printf�޼���� API�� ���� �����Ұ�
                // %d�� ������� �Ķ���ͷ� �޴� ������ �������� ������ ���� �������� ǥ���Ͽ� ����Ѵ�.
                System.out.printf("%d / %d = %d %n", arr1[cnt],arr2[cnt],result);
            }
            catch (ArithmeticException e)
            {
                System.out.println("�߸��� �����Դϴ�. (index = " + cnt + " )");
            }
        }
    }
}
