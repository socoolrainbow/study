package DataStructuerClass;

import java.util.HashMap;

public class HashMapExample2
{
    public static void main(String[] args)
    {
        HashMap<Name, Integer> hashtable = new HashMap<Name, Integer>();
        hashtable.put(new Name("�ظ�", "����"), new Integer(95));
        hashtable.put(new Name("�츣�̿´�", "�׷�����"), new Integer(100));
        hashtable.put(new Name("��", "����"), new Integer(85));
        hashtable.put(new Name("�巹����", "������"), new Integer(93));
        hashtable.put(new Name("�׺�", "�չ���"), new Integer(70));
        Integer num = hashtable.get(new Name("�츣�̿´�", "�׷�����"));
        System.out.println("�츣�̿´� �׷������� ������ ? " + num);
        
    }
}
