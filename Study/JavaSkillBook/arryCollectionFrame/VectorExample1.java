package arryCollectionFrame;

import java.util.Vector;

public class VectorExample1
{
    private int count = 0;
    private Vector<String> vector = new Vector<String>(10,5);
    public static void main(String[] args)
    {
        VectorExample1 example = new VectorExample1();
        example.execute();
    }
    public void execute()
    {
        // ù��° ȣ��
        this.printStatus();
        for (int i = 0; i < 4; i++)
        {
            vector.addElement(String.valueOf(i));
        }
        // �ι�° ȣ��
        this.printStatus();
        for (int i = 0; i < 4; i++)
        {
            vector.add(String.valueOf(i));
        }
        // ����° ȣ��
        this.printStatus();
        // Ŭ������ �뷮�� �ɹ������ ������ŭ���� ����
        vector.trimToSize();
        // �׹�° ȣ��
        this.printStatus();
        vector.setSize(20);
        
        this.printStatus();
        
        System.out.println(vector.toString());
    }
    public void printStatus()
    {
        count++;
        System.out.println("[" + count + "] Capacity : " + vector.capacity() + "Elememt size : " + vector.size());
    }
    
}
