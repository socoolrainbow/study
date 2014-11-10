package arryCollectionFrame;

import java.util.HashSet;
import java.util.Random;

public class HashSetExample
{
    
    private int count = 0;
    
    private Random random = new Random();
    
    private HashSet<Integer> set = new HashSet<Integer>();
    
    public static void main(String[] args)
    {
        HashSetExample example = new HashSetExample();
        example.init();
        example.execute();
        
    }
    
    public void init()
    {
        for (int i = 0; i < 10; i++)
        {
            set.add(random.nextInt(10));
        }
        this.printStatus(set);
    }
    
    public void execute()
    {
        HashSet<Integer> setObj = new HashSet<Integer>();
        for (int i = 0; i < 10; i++)
        {
            // 10 �̸��� ������ ������ set��ü�� �߰�
            setObj.add(random.nextInt(5));
        }
        
        this.printStatus(setObj);
        set.addAll(setObj);
        this.printStatus(set);
    }
    
    public void printStatus(HashSet<Integer> hashSet)
    {
        // �����Ͱ� �ִ����� ���� �˻�
        if (hashSet == null || hashSet.size() == 0)
        {
            System.out.println("Object is null or size is zero");
        }
        count++;
        
        // �迭�� ���� ���� Ȯ��
        Integer[] array = hashSet.toArray(new Integer[hashSet.size()]);
        System.out.print("count : " + count + ", ");
        for (Integer item : array)
        {
            System.out.print("[" + item + "] ");
        }
        System.out.println("\n");
    }
}
