package managerlogin;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class MUserPasswordTest {

   String mpassword = "eman1000";	
ManagerAccount mpass = new ManagerAccount(null, mpassword);
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Password  of the Manager  is");    
      assertEquals(mpassword, mpass.MPassword());     
   }
}