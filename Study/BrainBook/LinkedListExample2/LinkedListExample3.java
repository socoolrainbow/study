package LinkedListExample2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample3
{
    public static void main(String[] args)
    {
        /*
         * Iterator ��ü�� ����Ͽ� ���������� LinkedList��ü�� �����ϴ� ���� 
         */
        LinkedList<String> list = new LinkedList<String>();
        list.add("����");
        list.add("���ξ���");
        list.add("�ٳ���");
        // iterator �޼ҵ带 ȣ���Ͽ� Iterator ��ü�� ��´�.
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
        {
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
