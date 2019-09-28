package calculatePackage;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class calculateServletTest {
	
	calculateServlet al 
	= new calculateServlet();
	 double allowance =
 al.allowance(15000,1000, 500,1200, 900);
	 
  double totalallowance = 3600;  //success allowance
	/* Fail double totalallowance = 3599;*/
	  @Test
	public void netsum() {
	 System.out
.println("Total Allowance of the specific "
+ "employee is:"+allowance+"="+totalallowance);
		 
assertEquals(Double.doubleToLongBits(allowance), 
		Double.doubleToLongBits(totalallowance));

	    }

	 

	}
