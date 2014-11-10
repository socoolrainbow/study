package arryCollectionFrame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SortExample
{
    private final int LENGTH = 15;
    
    private Random random;
    
    private String[] strArray;
    
    private ArrayList<String> strList;
    
    public static void main(String[] args)
    {
        SortExample example = new SortExample();
        example.init();
        example.sort();
    }
    
    public void init()
    {
        this.random = new Random();
        strArray = new String[this.LENGTH];
        strList = new ArrayList<String>();
        
        for (int i = 0; i < LENGTH; i++)
        {
            // 65�̻��� ���ڰ� ���� ��������� A~Z ������ ���� �Է�
            String item = String.valueOf((char) (random.nextInt(26) + 65));
            strArray[i] = item;
            strList.add(item);
        }
        this.printArrayItem();
        this.printArryListItem();
    }
    
    public void printArrayItem()
    {
        for (int i = 0; i < strArray.length; i++)
        {
            System.out.print("[" + strArray[i] + "] ");
        }
        System.out.println();
    }
    
    public void printArryListItem()
    {
        for (int i = 0; i < strArray.length; i++)
        {
            System.out.print("(" + strList.get(i) + ") ");
        }
        System.out.println();
    }
    
    public void sort()
    {
        // ���� �޼ҵ带 �̿��� ����
        Arrays.sort(strArray);
        Collections.sort(strList);
        
        this.printArrayItem();
        this.printArryListItem();
    }
    
}
