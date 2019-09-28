package searchrecords;
import static org.junit.Assert.*;
import org.junit.Test;

public class SearchRecordsTest {

	SearchRecords sr= new SearchRecords();
	String empid="Emp001";
	 String empid1="Emp009";  //Employee Id does not exist ,
	 @Test
	  public void testParameter() {

	System.out.println("Employee ID Emp001 Exist in the company database");// Employee Id exist
	System.out.println("Empoyee ID does not exist in the database");//Message appeared no existence employee id

	        assertEquals(empid,sr.ReqParameterEmpId());
	        
	    }

}
