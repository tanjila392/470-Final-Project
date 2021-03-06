
import employee.systemMethods;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class systemMethodsTest {
    
    systemMethods m;
   
    
    @Before
    public void setUp() throws Exception {
        m = new systemMethods();
    }
      
    
    @Test
    public void testLogin(){
        String u = "admin";
        String p = "admin";
        
        boolean b = m.login(u, p);
        assertTrue(b);
        
    }
    
    @Test
    public void testAddEmployee() {
      assertEquals(Arrays.asList("1", "Tanjila", "20","2","John","22","3","Tom","24"), m.AddEmployee());
    }
    
    @Test
    public void testRemoveEmployees(){
     assertEquals(Arrays.asList(), m.RemoveEmployee());
    }
    
    @Test
    public void testUpdateEmployee(){
        
      assertEquals("XYZ",m.UpdateEmployee());    
    
    }
   
    @Test
    public void testSearchEmployee(){
     
       assertEquals(Arrays.asList("1","Tanjila", "20","2","John","22","3","Tom","24").contains("Tanjila"), m.SearchEmployee());
        
    }
    
    @Test
    public void testViewDetails(){   
        assertEquals("You can now view the details",m.ViewDetails());   
    }
     
    
    @Test
    public void testForgotPassword(){
        String old_password = "Tanjila";
        String new_password = "admin";
        
        assertEquals("New Password Set Successfully",m.ForgotPassword(old_password, new_password));
    }
    
    
    @Test
    public void testRequestForSalary() {
        
       assertEquals("Approved",m.salary(500));
    }
    
    
    @Test
    public void testOvertime(){
        
        assertEquals(2700,m.Overtime(2500, 4, 50));  
    
    }
    
    @Test
    public void testTax(){
   
      assertEquals(225, m.Tax(1500, 0.15),0);
      
    }
    
    }
    
    
   
    
    
    


