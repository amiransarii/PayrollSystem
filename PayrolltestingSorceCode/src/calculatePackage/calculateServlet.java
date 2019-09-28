package calculatePackage;

public class calculateServlet {

public double allowance(double  gross_salary,  double overtime,double medical, double lunch, double bonus ) {
	double allowance = (medical + overtime + bonus + lunch);

	double net_salary = (gross_salary + allowance);
	System.out.println("Allowance values is : " + allowance);
    System.out.println("Net Salary is values are: " + net_salary);

   return allowance;

}
}






/*
Double gross_salary = Double.parseDouble(req.getParameter("gross_salary"));
Double medical =  Double.parseDouble(req.getParameter("medical"));

Double  overtime = Double.parseDouble(req.getParameter("overtime"));
Double bonus = Double.parseDouble(req.getParameter("bonus"));
Double lunch = Double.parseDouble(req.getParameter("lunch"));
 


Double allowance = (medical + overtime + bonus + lunch);

Double net_salary = (gross_salary + allowance);
*/