package addEmployeePackage;
import static org.junit.Assert.*;
import org.junit.Test;
public class EmailTesting {
 @Test
    public void test() {
	  
	/* Employees Page correct input  form */
	 
        String obj1 = "EMP201";                           
        String obj3 = "Jackson";
        String obj5 = "Bond";
        String obj7 = "01/21/1989";
        String obj9 =  "Male";
        String obj11= "jackson@yahoo.com";
        String obj13 =  "Male";
        String obj16= "0172345658";
        String obj17=  "H.N0 34,Jack Street,Malaysia";
        String obj19= "Developer";
        String obj21=  "ICT";
        String obj23= "6000";
        String obj25="02/21/2004";

    /* Error When User enter some other form of value or 
     * submit page without any parameter*/

        String obj2 = "EMP201";
        String obj4 = "Jackson";
        String obj6 = "Bond";
        String obj8 = "01/21/1989";
        String obj10 =  "Male";
       String obj12= "jackson@yahoo.com";
        /*String obj12= "jackso.com";*/
        String obj14 =  "Male";
      String obj15= "0172345658";
       /* String obj15= "";*/
        String obj18 =  "H.N0 34,Jack Street,Malaysia";
        String obj20= "Developer";
        String obj22 =  "ICT";
         /*int  obj22 =  22;*/
        String obj24= "6000";
        String obj26="02/21/2004";
         
        /*Testing paramter when entering values are in correct form*/
          /*assertEquals(obj1, obj2);*/
          assertEquals(obj3, obj4);
          assertEquals(obj5, obj6);
          assertEquals(obj7, obj8);
          assertEquals(obj9, obj10);
          assertEquals(obj11, obj12);
          assertEquals(obj13, obj14);
         assertEquals(obj15, obj16);
          assertEquals(obj17, obj18);
          assertEquals(obj19, obj20);
        assertEquals(obj21, obj22);
          assertEquals(obj23, obj24);
          assertEquals(obj25, obj26); 
          
         /*assertNull(obj15);*/
          
  
       

    }

}
