package bbfond;

/**
 *
 * @author Ken
 */






public class Izdanie {
    
    
     private int id;
     private String tip;
     private String avtor;
     private String naimenovanie; 
     private String godizd;
     private String stranic;
     private String izdatelstvo;
     private String zhanr;
     private String kratkoe;
     private String spisokst;
    
    
    public Izdanie(int id, String tip, String avtor, String naimenovanie, String godizd, String stranic, String izdatelstvo, String zhanr , String kratkoe, String spisokst ) {
        this.id = id;
        this.tip = tip;
        this.avtor=avtor;
        this.naimenovanie=naimenovanie;    
        this.godizd=godizd;
        this.stranic=stranic;
        this.izdatelstvo=izdatelstvo;
        this.zhanr=zhanr;
        this.kratkoe=kratkoe;
        this.spisokst=spisokst;
    
    
    
    
    }




    public int getId(){
        return id;
    }
    
    public String getTip(){
        return tip;
    }
    public String getAvtor(){
        return avtor;
    }
    
    
    public String getNaimenovanie(){
        return naimenovanie;
    }
    
    
    public String getGodizd(){
        return godizd;
    }
    
    
    public String getStranic(){
        return stranic;
    }
    
    
    public String getIzdatelstvo(){
        return izdatelstvo;
    }
    
    public String getZhanr(){
        return zhanr;
    }
    
    public String getKratkoe(){
        return kratkoe;
    }
    
    
    public String getSpisokst(){
        return spisokst;
    }
    
    
    public void setId(int id){
    this.id = id;
    }
    
    
public void printF() {
        System.out.printf("%-7d%-14s%-60s%-22s%-9s%-20s%n",id,tip,naimenovanie,godizd,stranic,izdatelstvo);
    }





public void printI() {
        
    }


}
