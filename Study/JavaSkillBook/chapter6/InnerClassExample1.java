package chapter6;

public class InnerClassExample1
{
     private int outerHashCode;
     public String outerClassName;
     static boolean isOuter;
     
     public InnerClassExample1()
    {
         outerHashCode = System.identityHashCode(this);
         outerClassName = this.getClass().getName();
         isOuter =true;
    }
    public static void main(String[] args)
    {
        // �ܺ� Ŭ���� ��ü example ����
        InnerClassExample1 example = new InnerClassExample1();
        
        //example ��ü�� ����Ͽ� ���� Ŭ���� ��ü innerExample ����
        //inner Ŭ������ �ν��Ͻ��ϴ� ���� �߿��� ���� �߿�~!
        InnerClassExample1.InnerClass innerExample = example.new InnerClass();
        
        innerExample.printInnerInfo();
        System.out.println("-------------------------------");
        innerExample.printOuterInfo();
        
    }
    
    class InnerClass
    {
        private int innerHashCode;
        public String innerClassName;
        // final Ű����� �ܵ����� ���Ұ�
        static final boolean isInner = true;
        
        public InnerClass()
        {
            innerHashCode = System.identityHashCode(this);
            innerClassName = this.getClass().getName();
        }
        
        // ���� Ŭ������ �������� ���� �����ڷ� ����� Ŭ���� ������ ������ �� �ִ�.
        public void printOuterInfo()
        {
            System.out.println("Outer object HashCode : " + outerHashCode);
            System.out.println("Outer object class Name : " + outerClassName);
            System.out.println("Is it outer class :" + isOuter);
        }
        
        // ���� Ŭ���� �ڽ��� �������� ������ �� �ִ�.
        public void printInnerInfo()
        {
            System.out.println("Inner object HashCode : "+ this.innerHashCode);
            System.out.println("Inner object class Name: "+ this.innerClassName);
            System.out.println("Is it inner class :" + isInner);
        }
    }
    
}
