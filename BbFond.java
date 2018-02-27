package bbfond;

import java.util.Scanner;

/**
 *
 * @author Ken
 */
public class BbFond {

    
    public static void main(String[] args) {
        
    
    
        Izdanie[] fond = new Izdanie[200];
        
        
        fond[0] = new Kniga(0, "kniga" , "Pushkin" , "Evgenii Onegin" , "1800" , "120" , "Moskva" , "Roman v stihah" , "Pro zhizn molodogo cheloveka","pusto");
        fond[1] = new Kniga(1, "kniga" , "Lermontov" , "Geroi nashego vremeni" , "1825" , "230" , "Piter" , "Roman v stihah" , "Pro geroya sovremenosti","pusto");
        fond[2] = new Kniga(2, "kniga" , "Tolstoy" , "Voina i mir" , "1850" , "4500" , "Moskva" , "Roman" , "Pro voinu i mir","pusto");

        int granica=2;
        
        
        
        
        
        
        
        
        while(1==1){
        
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
            
            
        System.out.print("MENU dostupnih komand:\n1 - prosmotr zaregistrirovannih izdanii v fonde\n2 - dobavlenie novogo izdania v fond\n3 - prosmotr informacii vibranogo izdania\n4 - udalenie vibranogo izdaniya\n5 - vihod\nVvedite nomer komandi:");
        int comanda = in1.nextInt();
        
        
        
        
        if(comanda != 1 & comanda != 2 & comanda != 3 & comanda != 4 & comanda != 5){System.out.println("UKAZAN NEVERNII NOMER KOMANDI!!!");}
        
        if (comanda==4){
        
                             System.out.print("Vvedite id dlya udalenia: ");
                             Scanner in10 = new Scanner(System.in);
                             int idud = in10.nextInt();
        
                             
                             
                             if (idud>=0 & idud<=granica) {
                             
                             for (int i = idud; i < granica; i++){
                             
                             fond[i]=fond[i+1];
                             fond[i].setId(i);
                             
                             
                             
                             
                             }
                             
                             
                             granica--;
                             }
                             else System.out.println("UKAZANII IDENTIFIKATOR NE SUSHESTVUET!!!");
                             
                             
                             
        
        }
        
        if (comanda==1){
                          for (int i = 0; i <= granica; i++) {
             
                            fond[i].printF();
                 
                           
                           
                            }
                        }
        
        
        
        if (comanda==3){
        
                             
            
                             System.out.print("Vvedite id izdania dlya prosmotra informacii: ");
                             Scanner in11 = new Scanner(System.in);
                             int idizd = in11.nextInt();
        
                            
                            if (idizd>=0 & idizd<=granica) {
                             
                            fond[idizd].printI();
                             
                            
        
                            
        
                            }
                       else System.out.println("UKAZANII IDENTIFIKATOR NE SUSHESTVUET!!!");    
        }
        
        
        if (comanda==5){
                          System.exit(0);
                             }
        if (comanda ==2) {
                         
        System.out.print("TIPI izdania:\nk - kniga\nj - jurnal\nb - broshura\nVvedite tip izdania:");
        String tipizd = in2.nextLine();
            
        
        if (tipizd.equals("k")){
        
                             System.out.print("Vvedite avtora: ");
                             Scanner in3 = new Scanner(System.in);
                             String avtorname = in3.nextLine();
                              
                             System.out.print("Naimenovanie knigi: ");
                             Scanner in4 = new Scanner(System.in);
                             String naimen = in4.nextLine();
                             
                             
                             System.out.print("God izdatelstva: ");
                             Scanner in5 = new Scanner(System.in);
                             String godiz = in5.nextLine();
                             
                             System.out.print("Kolichestvo stranic: ");
                             Scanner in6 = new Scanner(System.in);
                             String kolvostr = in6.nextLine();
                             
                             
                             System.out.print("Izdatelstvo: ");
                             Scanner in7 = new Scanner(System.in);
                             String izdat = in7.nextLine();
                             
                             
                             
                             
                             System.out.print("Zhanr knigi: ");
                             Scanner in8 = new Scanner(System.in);
                             String zhanrkn = in8.nextLine();
                             
                             
                             
                             
                             
                             System.out.print("Kratkoe soderzhanie: ");
                             Scanner in9 = new Scanner(System.in);
                             String kratsod = in9.nextLine();
                             
                             
                             
                             fond[granica+1]=new Kniga(granica+1,"kniga",avtorname,naimen,godiz,kolvostr,izdat,zhanrkn,kratsod,"pusto");
                             
                             granica++;
        
                            }
        
                       if (tipizd.equals("b")){
        
                             
                              
                             System.out.print("Naimenovanie broshuri: ");
                             Scanner in30 = new Scanner(System.in);
                             String naimenb = in30.nextLine();
                             
                             
                             System.out.print("Mesyac i god izdatelstva: ");
                             Scanner in31 = new Scanner(System.in);
                             String godizb = in31.nextLine();
                             
                             
                             
                             
                             System.out.print("Izdatelstvo: ");
                             Scanner in32 = new Scanner(System.in);
                             String izdatb = in32.nextLine();
                             
                             
                             
                             
                             
                             
                             
                             
                             
                             
                             System.out.print("Kratkoe opisanie broshuri: ");
                             Scanner in33 = new Scanner(System.in);
                             String kratopis = in33.nextLine();
                             
                             
                             
                             fond[granica+1]=new Broshura(granica+1,"broshura","pusto",naimenb,godizb,"pusto",izdatb,"pusto",kratopis,"pusto");
                             
                             granica++;
        
                            }            
        
                 if (tipizd.equals("j")){
        
                             
                              
                             System.out.print("Naimenovanie jurnala: ");
                             Scanner in20 = new Scanner(System.in);
                             String naimenj = in20.nextLine();
                             
                             
                             System.out.print("Mesyac i god izdatelstva: ");
                             Scanner in21 = new Scanner(System.in);
                             String godizj = in21.nextLine();
                             
                             System.out.print("Kolichestvo stranic: ");
                             Scanner in22 = new Scanner(System.in);
                             String kolvostrj = in22.nextLine();
                             
                             
                             System.out.print("Izdatelstvo: ");
                             Scanner in23 = new Scanner(System.in);
                             String izdatj = in23.nextLine();
                             
                             
                             
                             
                             
                             
                             
                             
                             
                             
                             System.out.print("Spisok statei: ");
                             Scanner in24 = new Scanner(System.in);
                             String spisoks = in24.nextLine();
                             
                             
                             
                             fond[granica+1]= new Jurnal(granica+1,"jurnal","pusto",naimenj,godizj,kolvostrj,izdatj,"pusto","pusto",spisoks);
                             
                             granica++;
        
                            }       
        
            
        }
        
        
        
        
        
        
           
        }
        
        
    
    }
}
