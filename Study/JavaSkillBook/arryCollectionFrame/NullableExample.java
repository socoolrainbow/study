package arryCollectionFrame;

import java.util.ArrayList;

// NullPointerException ������ �����ϴ� ������ ���
public class NullableExample
{
    public static void main(String[] args)
    {
        NullableExample example = new NullableExample();
        
        ArrayList<String> strList = NullableExample.init();
        // Exception�� strList.size() �޼ҵ带 ȣ���Ҽ� ��� �߻��Ѵ�. strList = null �̹Ƿ� �Ʒ���
        // ���� ���ܻ�Ȳ�� �߻���Ű���ʵ��� �Ѵ�.
        // if (strList != null && strList.size() > 0)
        {
            for (int i = 0; i < strList.size(); i++)
            // �Ʒ��� ���� ���ܻ�Ȳ�� �����Ҽ��� �ִ�.
            // for (int i = 0 ; strList != null && i < strList.size(); i++)
            {
                System.out.println("member value : " + strList.get(i));
            }
        }
        
    }
    
    public static ArrayList<String> init()
    {
        return null;
    }
}
