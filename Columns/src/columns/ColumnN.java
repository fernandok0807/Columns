/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package columns;

/**
 *
 * @author enmanuel
 */
public class ColumnN {
    
    
    public String cols(int num){
        String respuesta="";
        
        String columns[] = new String[1000]; 
        
        int resta=0;
        int reinicio=0;
        for(int i = 65; i<(num+65) ;i++){
            if(resta==0){
                System.out.print((char)(i-(resta*26)) +" | ");
                columns[i-65]= String.valueOf((char)(i-(resta*26)));
                reinicio++;
                if(reinicio==26){
                    resta++;
                    reinicio=0;
                }
            }
            else{
                if(resta<=26){
                    columns[i-65]=   String.valueOf(((char)(resta+64)));
                    columns[i-65]= columns[i-65] +String.valueOf((char)(i-(resta*26)));
                    System.out.print(columns[i-65]+" | ");
                    reinicio++;
                    if(reinicio==26){
                        resta++;
                        reinicio=0;
                    }
                }
                else{
                    
                    columns[i-65]=  "A";
                    columns[i-65]= columns[i-65] + String.valueOf(((char)(resta+38)));
                    columns[i-65]= columns[i-65] +String.valueOf((char)(i-(resta*26)));
                    System.out.print(columns[i-65]+" | ");

                    reinicio++;
                    if(reinicio==26){
                        resta++;
                        reinicio=0;
                    }
                }
                
                
            }
            
            System.out.println(i-64);
        }

        
        
        
        return respuesta;
    }
   
    
}
