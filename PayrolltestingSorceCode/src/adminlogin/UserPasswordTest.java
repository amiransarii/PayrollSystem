package adminlogin;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class UserPasswordTest {

   String password = "admin1000";	
   adminaccount upassword = new adminaccount(null, password);
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Password  of the admin is");    
      assertEquals(password, upassword.Password());     
   }
}