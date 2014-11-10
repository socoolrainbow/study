package DataStructuerClass;

public class Name
{
    String firstName;
    
    String lastName;
    
    Name(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    // put,get,remove �޼ҵ�� �� ��ȣ�� ����ؼ� �����Ͱ� �ִ� ���� ã�� �� ����, �� �� �ȿ� �ִ� ���� �����͵� �߿�
    // �Ȱ��� Ű ���� ���� �����͸� ã�� ���� equals�޼ҵ带 ����Ѵ�.
    // �ؼ� equals �޼��带 �������̵��Ͽ� �����Ѵ�.
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Name)) { return false; }
        Name name = (Name) obj;
        if (firstName.equals(name.firstName) && lastName.equals(name.lastName))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int hashCode()
    {
        return firstName.hashCode() + lastName.hashCode();
    }
    
}
