
package expenditureReportPackage;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class ExpenditureReportServletTest {
	ExpenditureReportServlet ers = new ExpenditureReportServlet();
int netsalary= ers.
EMPID001NetSalary(1, 1, "EMP001", 2016-04, 15000, 2000, 1500);
	  
/*int netsalarytest=15500; Success*/

int netsalarytest=14000; // Fail Test
	 @Test
	 
public void netsaltest() {

System.out.println("@Net Salary test(): " + netsalary + ""
		+ " = " + netsalarytest);
	assertEquals(netsalary, netsalarytest);

	   }}




/*Calculate calculation = new Calculate();
int sum1 = calculation.sum(2, 5);
 int testSum = 7;
 @Test
public void testSum() {

       System.out.println("@Test sum(): " + sum1 + " = " + testSum);
       assertEquals(sum1, testSum);

   }



}
*/