package arryCollectionFrame;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

// ������ ASCII�ڵ� ��ȯ����
public class MapExample1
{
    //Key = �빮�� ���ĺ�, Value = 10�� ascii�ڵ�
    private HashMap<String, Integer> asciiMap = new HashMap<String, Integer>();
    
    public static void main(String[] args)
    {
        MapExample1 example = new MapExample1();
        example.init();
        example.execute();
    }

    public void init()
    {
        for (int i = 65; i <= 90; i++)
        {
            // 65�� ASCII = 'A'
            asciiMap.put(String.valueOf((char)i), i);
        }
    }

    public void execute()
    {
        // entrySet() �޼ҵ� �����
        Set<Entry<String, Integer>> entrySet = asciiMap.entrySet();
        for (Entry<String, Integer> entry : entrySet)
        {
            System.out.print("[" + entry.getKey() + "/" + entry.getValue() + "] ");
        }
        System.out.print("\n");
        
        System.out.println();
        System.out.println("asciiMap contains 69 value : " + asciiMap.containsValue(69));
        System.out.println("asciiMap contains C key : " + asciiMap.containsKey("C"));
        
        // remove
        asciiMap.remove("Z");
        
        //values() �޼ҵ带 �̿��� value�� ���
        Collection<Integer> values = asciiMap.values();
        for (Integer value : values)
        {
            System.out.print("(" + value + ") ");
        }
        System.out.print("\n");
        
        //keySet() �޼ҵ带 �̿��� value �� ���
        Set<String> keySet = asciiMap.keySet();
        for (String key : keySet)
        {
            System.out.print("[" + asciiMap.get(key) + "] ");
        }
        System.out.println();
        
    }
}
