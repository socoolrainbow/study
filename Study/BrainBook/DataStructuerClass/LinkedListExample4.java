package DataStructuerClass;

import java.util.LinkedList;

public class LinkedListExample4
{
    public static void main(String[] args)
    {
        /*
         * LinkedList�� ���Լ��� ����� ť������� �����͸� ó���ϴ� ����
         */
        LinkedList<String> queue = new LinkedList<String>();
        // offer�޼��带 ����Ͽ� �����͸� �Է½�Ų��.
        queue.offer("�䳢");
        queue.offer("�罿");
        queue.offer("ȣ����");
        while (!queue.isEmpty())
        {
            // poll�� ����Ͽ� �����͸� �о�帮�� �ش� �����ʹ� �����Ѵ�.
            // ���� �����͸� �о���̰� �����͸� �������� �������� Peek�޼��带 ����Ѵ�.
            String str = queue.poll();
            System.out.println(str);
        }
    }
}
