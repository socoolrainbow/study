package DataStructuerClass;

import java.util.LinkedList;

public class LinkedListExample3
{
    public static void main(String[] args)
    {
        /*
         * LinkedList Ŭ������ �������� ����ϴ� ����
         */
        LinkedList<Integer> stack = new LinkedList<Integer>();
        // addLast�޼��带 ����Ͽ� ���Լ������� ���� ������� �����͸� �迭�Ҽ��ִ�.
        stack.addLast(new Integer(12));
        stack.addLast(new Integer(59));
        stack.addLast(new Integer(7));
        while (!stack.isEmpty())
        {
            // removeLast�޼��带 ����Ͽ� �������� ������ ���� �о���̰� �ش� �迭�� �����Ѵ�.
            Integer num = stack.removeLast();
            System.out.println(num);
        }
    }
}
