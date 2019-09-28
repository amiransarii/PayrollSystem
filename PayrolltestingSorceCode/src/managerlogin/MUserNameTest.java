package managerlogin;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class MUserNameTest {

   String musername = "eman";	
   ManagerAccount muser = new ManagerAccount(musername, null);
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Username of the Manager is");    
      assertEquals(musername, muser.MUserName());     
   }
}