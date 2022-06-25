package com.mycompany.animals1;
/**
 *
 * @lf
 */
public class Cachorro extends Lobo {
  
   @Override 
   public void emitirSom(){
       System.out.println("Au Au !!!");
    }  
   
   public void reagir(String frase){
       if (!frase.equals("Pega comida") && !frase.equals("Olá")){
          System.out.println("Rosnar");
      } else {
          System.out.println("Abanar e Latir");
      }
   
   }    
    public void reagir(int hora, int min){
        if (hora < 13){
            System.out.println("Abanar");
        }else if (hora >= 17){    
            System.out.println("Ignorar");
        }else {    
            System.out.println("Abanar e Latir");
        }    
    }
   public void reagir(boolean dono){
       if (dono){
           System.out.println("Abanar");
       } else 
           System.out.println("Rosnar e Latir");
       
   }    
   
  public void reagir(int idade, float peso){
      if (idade < 6 ) {
          if (peso < 11) {
              System.out.println("Abanar");              
          } else {
              System.out.println("Latir");
          }
      } else {
          if (peso < 11) {
              System.out.println("Rosnar");   
          } else {
              System.out.println("Ignorar");
          }
      }
       
   }         
  
   
}
