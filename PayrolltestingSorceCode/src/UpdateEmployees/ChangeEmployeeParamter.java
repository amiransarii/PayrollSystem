package UpdateEmployees;

import java.util.Arrays;

public class ChangeEmployeeParamter {

	public String[] changeParameterforUpdate() {

		String[] changeparamter= { "EMP201","Jack","Bod", "02/12/1889", "Male", "jack@yahoo.com" ,
			       "9987645738", "H.N0 32,Jack Street,Singapore" ,"Cleaner" ,"General Worker", "600", "03/11/2006" };
			// Employee Id fixed

		System.out.println("Employee records succesully updated the paramter  : "   + Arrays.toString(changeparamter ));

			        return changeparamter;

			   
			    }

			}
