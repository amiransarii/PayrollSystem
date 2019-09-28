package adminlogin;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class UserNameTest {

   String username = "admin";	
   adminaccount user = new adminaccount(username, null);
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Username of the admin is");    
      assertEquals(username, user.UserName());     
   }
}