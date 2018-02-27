
package bbfond;

/**
 *
 * @author Ken
 */


public class Broshura extends Izdanie{
    
    
    public Broshura(int id, String tip, String avtor, String naimenovanie, String godizd, String stranic, String izdatelstvo, String zhanr , String kratkoe, String spisokst ) {
        
                  
       super(id, tip, avtor, naimenovanie, godizd, stranic, izdatelstvo, zhanr , kratkoe, spisokst ); 
        
        
           
    
    
    
    }
       
        
    
   @Override 
   public void printI() {
        System.out.println(getNaimenovanie() + "     " + getGodizd() + "     " + getIzdatelstvo() + "     " + getKratkoe());
    } 
    
    
    
}
