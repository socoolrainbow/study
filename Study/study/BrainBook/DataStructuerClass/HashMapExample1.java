package DataStructuerClass;

import java.util.HashMap;

public class HashMapExample1
{
    public static void main(String[] args)
    {
        /*
         * HashMap Ŭ������ ��� ��
         */
        HashMap<String, Integer> hashtable = new HashMap<String, Integer>();
        hashtable.put("�ظ�", new Integer(95));
        hashtable.put("�츣�̿´�", new Integer(100));
        hashtable.put("��", new Integer(85));
        hashtable.put("�巹����", new Integer(93));
        hashtable.put("�׺�", new Integer(70));
        Integer num = hashtable.get("�츣�̿´�");
        System.out.println("�츣�̿´��� ������? " + num);
        
    }
}
