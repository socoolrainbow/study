package chapter4;

public class CustomerClass
{
    public static void main(String[] args)
    {
        String memberClass = "Silver";
        
        switch (memberClass)
        {
            // Java7���� ���ĺ��� String ���ڿ��� �����ִ�.
            case "silver":
                System.out.println("Go to upstair");
                break;
            case "Silver":
                System.out.println("Go to downstair");
                break;
            case "gold" :
                System.out.println("Go to limousine");
                break;
        }
    }
}
