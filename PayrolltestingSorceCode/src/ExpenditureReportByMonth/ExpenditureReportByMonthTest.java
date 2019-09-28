package ExpenditureReportByMonth;
import static org.junit.Assert.*;
import org.junit.Test;


public class ExpenditureReportByMonthTest {


	ExpenditureReportByMonth srbm= new ExpenditureReportByMonth();
	String date="Febuary 2016"; 
	// checking this value to entering into the textbox

	 @Test
	  public void testParameter() {

  System.out.println(" Date does exist in the database and expediture "
  		+ "report follows::"+date);
	
	        assertEquals(date,srbm.ReqDateParameter());
	        
	    }

}

