package addEmployeePackage;
import static org.junit.Assert.*;
import org.junit.Test;
public class addEmployeeServletTest {
	addEmployeeServlet requestparameter = new addEmployeeServlet();

    String[] reqpara = {"EMP201","Jackson","Bond", "01/21/1989",
    		"Male", "jackson@yahoo.com" ,
    		"0172345658", "H.N0 34,Jack Street,Malaysia" ,""
    				+ "Developer" ,"ICT", "6000", "02/21/2004" };
	/*String []reqpara={""};*/
    @Test
  public void testParameter() {

        System.out.println("Parameter passed by the users()");

        assertArrayEquals(reqpara,requestparameter.ReqParameter());
    }
  
}
