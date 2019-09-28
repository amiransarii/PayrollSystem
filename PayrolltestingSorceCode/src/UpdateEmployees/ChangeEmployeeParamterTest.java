package UpdateEmployees;
import static org.junit.Assert.*;
import org.junit.Test;

public class ChangeEmployeeParamterTest {

ChangeEmployeeParamter cep= new ChangeEmployeeParamter();

String[] changeparamter= { "EMP201","Jack","Bod", "02/12/1889", 
		"Male", "jack@yahoo.com" ,
 "9987645738", "H.N0 32,Jack Street,Singapore" 
 ,"Cleaner" ,"General Worker", "600", "03/11/2006" };

@Test
public void testParameter() {

      System.out.println("Request to change input paramter by the users");

      assertArrayEquals(changeparamter,cep.changeParameterforUpdate());
  }

}
