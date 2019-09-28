package UpdateEmployees;

import java.util.Arrays;

public class UpdateEmployee {

       public String[] ReqParameterUpdate() {

String[] requestparameterforupdate = { "EMP201","Jackson","Bond", "01/21/1989", "Male", "jackson@yahoo.com" ,
	       "0172345658", "H.N0 34,Jack Street,Malaysia" ,"Developer" ,"ICT", "6000", "02/21/2004" };
	// Employee Id fixed

System.out.println("Request Parameters are for update : "   + Arrays.toString(requestparameterforupdate ));

	        return requestparameterforupdate;

	   
	    }

	}
