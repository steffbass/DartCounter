
package BL;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stefan
 */
public class DartCountModelTest {
    
    public DartCountModelTest() {
    }

    /**
     * Test of checkwin_einfach method, of class DartCountModel.
     */

    @Test
    public void testCheckwin_einfach() throws Exception {
       
        Player p = new Player("Hans", 121);
        
        DartCountModel instance = new DartCountModel();
        instance.throw_input_value(p, 121);
     
        assertEquals(0, p.getFormat());

    }

    /**
     * Test of checkwin_doppel method, of class DartCountModel.
     */
    @Test
    public void testCheckwin_doppel() throws Exception {
         Player p = new Player("Peter", 170);
        
        DartCountModel instance = new DartCountModel();
        instance.throw_input_einzeln(p, "T20");
         instance.throw_input_einzeln(p, "T20");
          instance.throw_input_einzeln(p, "DBUL");
     
        assertEquals(0, p.getFormat());
    }

    /**
     * Test of throw_input_einzeln method, of class DartCountModel.
     */
    @Test
    public void testThrow_input_einzeln() throws Exception {
     Player p = new Player("Stefan", 501);
     
        DartCountModel bl = new DartCountModel();
        
        bl.throw_input_einzeln(p, "1");
          bl.throw_input_einzeln(p, "D10");
            bl.throw_input_einzeln(p, "T20");
            
            assertEquals(420,p.getFormat());
        
    }

    /**
     * Test of throw_input_value method, of class DartCountModel.
     */
    @Test
    public void testThrow_input_value() {
       Player p = new Player("Stefan", 501);
     
        DartCountModel bl = new DartCountModel();
        
        bl.throw_input_value(p, 100);
      
            
            assertEquals(401,p.getFormat());
    }


     /**
     * Test of correct value of thrwos 
     */
    @Test
    public void testthrow() throws Exception {
        System.out.println("getCheckout");
        Player p = new Player("Philipp", 501);
        DartCountModel instance = new DartCountModel();
       instance.throw_input_einzeln(p, "5");
       instance.throw_input_value(p, 1);
        assertEquals(4,p.getWürfe());
        // TODO review the generated test code and remove the default call to fail.
     
    }


   
    
}
