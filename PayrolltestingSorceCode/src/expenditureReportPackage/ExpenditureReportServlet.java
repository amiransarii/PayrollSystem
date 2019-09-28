package expenditureReportPackage;
import java.util.Arrays;

public class ExpenditureReportServlet {
	
/*Form of  Input Parameter to calculate net salary after all allowance and deduction */
		 
public int  EMPID001NetSalary ( int PaymentID,int PaySlipID, String EmployeeID, int PaymentFor, int GrossSalary, int Allowances ,
		int Deductions)
{
	 System.out.println("Net Salary of the Employee(EMPID001) for a specific month : " 
+ Allowances + " + " +GrossSalary+ " + " + Deductions);
	 return Allowances + GrossSalary-Deductions;
}

}
