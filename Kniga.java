
package bbfond;

/**
 *
 * @author Ken
 */


public class Kniga extends Izdanie{
    
    
    public Kniga(int id, String tip, String avtor, String naimenovanie, String godizd, String stranic, String izdatelstvo, String zhanr , String kratkoe, String spisokst ) {
        
                  
       super(id, tip, avtor, naimenovanie, godizd, stranic, izdatelstvo, zhanr , kratkoe, spisokst ); 
        
        
           
    
    
    
    }
       
        
    @Override
    public void printI() {
        System.out.println(getId() + "     " + getAvtor()+"     " + getNaimenovanie() + "     " + getGodizd() + "     " + getStranic() + "     " + getIzdatelstvo() + "     " + getZhanr() + "     " + getKratkoe());
    }
    
    
    
    /*
    public void printIJ() {
        System.out.println(naimenovanie + "     " + godizd + "     " + stranic + "     " + izdatelstvo + "     " + spisokst);
    }
    */
    
    /*
   public void printIB() {
        System.out.println(naimenovanie + "     " + godizd + "     " + izdatelstvo + "     " + kratkoe);
    } 
    */
    
    
}
