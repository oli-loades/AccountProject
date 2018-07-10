package qa.com.account.accountproject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(AccountToXML.accountToXML(new Account("abc", "xyz",1),"test"));
    }
}
