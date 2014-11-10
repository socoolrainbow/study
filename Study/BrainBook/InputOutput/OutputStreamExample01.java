package InputOutput;
import java.io.FileOutputStream;
import java.io.IOException;


public class OutputStreamExample01
{
    public static void main(String[] args)
    {
        // FileOutputStream 클래스를 이용하여 바이트 데이터를 파일로 출력하기
        FileOutputStream out = null;
        try
        {
            out = new FileOutputStream("output.dat");
            byte arr[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
            for (int cnt = 0; cnt < arr.length; cnt++)
            {
                out.write(arr[cnt]);
            }
        }
        catch (IOException ioe)
        {
            // TODO: handle exception
            System.out.println("파일로 출력할 수 없습니다.");
        }
        finally
        {
            try
            {
                out.close();
            }
            catch (Exception e)
            {
                // TODO: handle exception
            }
        }
    }
}
