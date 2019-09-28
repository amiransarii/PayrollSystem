package addEmployeePackage;
import java.util.Arrays;

public class addEmployeeServlet {

	public String[] ReqParameter() {

String[] requestparameter = { "EMP201","Jackson","Bond", "01/21/1989", "Male", "jackson@yahoo.com" ,
       "0172345658", "H.N0 34,Jack Street,Malaysia" ,"Developer" ,"ICT", "6000", "02/21/2004" };

        System.out.println("Request Parameters are : "   + Arrays.toString(requestparameter ));

        return requestparameter;

   
    }

}
