package calculateDeductionPackage;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculateDeductionServletTest {
	
	 CalculateDeductionServlet dect = new  CalculateDeductionServlet();
	  double deduction= dect.netsalary(2000, 700, 0.06,0.05,15000);

	 
	 double netdeduction=4350; //success  
	  
	 /* double netdeduction= 4000; */// wrong calculation
	  
	  @Test
	public void netsum() {
System.out.println(" Comparison of two values of deduction is : " 
	+ deduction+ " "
		+ ""+ "= " +netdeduction);
	       
assertEquals(Double.doubleToLongBits(netdeduction),
		Double.doubleToLongBits(deduction));
    }	 
	}
