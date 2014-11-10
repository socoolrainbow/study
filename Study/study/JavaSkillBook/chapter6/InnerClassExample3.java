package chapter6;

import java.util.Date;

public class InnerClassExample3
{
    public static void main(String[] args)
    {
        InnerClassExample3 example = new InnerClassExample3();
        example.printStatus();
    }
    
    public void printStatus()
    {
        class DateFormat
        {
            private Date date;
            
            // ���� ���� Ŭ���� DateFormat ������
            public DateFormat(Date date)
            {
                this.date = date;
            }
            
            //���� ���� Ŭ���� DateFormat�� �޼ҵ�
            public String getDateFormat()
            {
                return date.toString();
            }
        }
        
        DateFormat format = new DateFormat(new Date());
        System.out.println("The Date : " + format.getDateFormat());
        
    }
}
