package chapter7;

import java.util.Random;

public class ArrayExample2
{
    private final int IDX_NAME =0;
    private final int IDX_ADDRESS =1;
    private final int IDX_GENDER =2;
    
    private String[][] infoTable;
    private String[] addrArray = new String[]{"Kuala lumpur", "Seoul", "Roma"};
    private String[] genderArray = new String[]{"Female", "Male"};
    
    public static void main(String[] args)
    {
        ArrayExample2 example = new ArrayExample2();
        example.init();
        example.printInfo();
    }
            
    public void init()
    {
        // 3*3 �� �����Ҽ� �ִ� 2���� �迭 
        Random random = new Random();
        infoTable = new String[3][3];
        
        for (int i = 0; i < 3; i++)
        {
            infoTable[i][IDX_NAME] = "Person" + i;
            infoTable[i][IDX_ADDRESS] = addrArray[random.nextInt(addrArray.length)];
            infoTable[i][IDX_GENDER] = genderArray[random.nextInt(genderArray.length)];
        }
    }
    
    public void printInfo()
    {
        if (infoTable == null)
        {
            System.out.println("InfoTable Array is null");
            return;
        }
        
        for (int i = 0; i < 3; i++)
        {
            System.out.println(infoTable[i][IDX_NAME] + " : " + infoTable[i][IDX_ADDRESS] + " : " + infoTable[i][IDX_GENDER]);
        }
    }
}
