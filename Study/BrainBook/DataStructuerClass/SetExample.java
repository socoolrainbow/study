package DataStructuerClass;

import java.util.HashSet;
import java.util.Iterator;


public class SetExample
{
    public static void main(String[] args)
    {
        /*
         * �������� ����Ҽ� �ִ� Ŭ�����̴�.
         * HashSet�� ��� �������� ������ �����Ƿ� HashSet�� �����͸� ������� �о���ų�, Ư�� ��ġ�� �����͸� �о�ü� �ִ� ����� ����.
         * ������ ���տ� �ִ� �����͸� ��� �о�� �� �ִ� ����� �ִ�. LinkedList Ŭ������ �ִ� �Ͱ� �Ȱ��� iterator �޼ҵ带 ����ϸ� �ȴ�.
         */
        HashSet<String> set = new HashSet<String>();
        set.add("�ڹ�");
        set.add("īǪġ��");
        set.add("����������");
        set.add("�ڹ�");
        System.out.println("����� �������� �� = " + set.size());
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext())
        {
            String str = iterator.next();
            System.out.println(str);
        }
        
    }
}
