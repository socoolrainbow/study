package chapter6;

public class LongHandler extends AbstractHandler
{
    
    public static void main(String[] args)
    {
        LongHandler longHandler = new LongHandler();
        System.out.println(longHandler.getRangeInfo());
    }
    
    // ��ӹ��� �߻�޼��带 �ϼ��Ѵ�.
    @Override
    public String getRangeInfo()
    {
        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;
        String rt = "From : " + max + ", To : " + min;
        return rt;
    }
}
