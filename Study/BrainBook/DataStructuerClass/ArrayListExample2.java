package DataStructuerClass;

import java.util.ArrayList;

public class ArrayListExample2
{
    public static void main(String[] args)
    {
        /*
         * ArrayList�� �����͸� ����/����/�����ϴ� ����  
         */
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("����");
        list.add("����");
        list.add("������"); 
        // ���� ���� ������ ����
        list.add(2, "Ű��");
        // ���� ���� Ű�� ������
        list.add(0, "������");
        // ������ ���� ���� Ű�� ������
        list.remove(1);
        // ������ ���� Ű�� ������
        list.remove("Ű��");
        // ������ ���� ������
        
        int num = list.size();
        for (int cnt = 0; cnt < num; cnt++)
        {
            String str = list.get(cnt);
            System.out.println(str);
        }
        
        
        
        
        
    }
}
