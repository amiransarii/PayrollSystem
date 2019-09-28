package calculateDeductionPackage;

public class CalculateDeductionServlet {

	 public double netsalary(double advance_pay, double leaves,double gst,double other_tax,double gross_salary) {
		 
		double gvt = (gross_salary * gst);
 		
 		double otherT = (gross_salary * other_tax);
 		
 		double deduction = (advance_pay + leaves + otherT + gvt);
 		
 		double net_salary = (gross_salary - deduction);
		 

	       System.out.println("Deduction values are: " + deduction);
	       System.out.println("Net Salary is values are: " + net_salary);

	      return deduction;

	    }
	}

