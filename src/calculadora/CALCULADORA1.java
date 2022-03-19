/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Cristhian
 */
public class CALCULADORA1 {
       private int Num_001;
         private int Num_002;
        
      //inicia el proceso de constructores.
      
    public CALCULADORA1(){
        
    }
    public CALCULADORA1 (int Num_001, int Num_002){
        
        this.Num_001 = Num_001;
        this.Num_002 = Num_002;
        
      //Inicia el metodo
      
    
    }
    //Aqui inicia los metodos.
    public int sumar(){
        int suma = this.Num_001 + this.Num_002;
        return suma;
    }
    public int restar(){
        int restar = this.Num_001 - this.Num_002;
        return restar;
    }

    public int multiplicar(){
        int multiplicar = this.Num_001 * this.Num_002;
        return multiplicar;
    }

    public double dividir(){
        double division = (double)this.Num_001 / (double)this.Num_002;
        return division;
    }

    
    
    public int getNum_001() {
        return Num_001;
    }

    public void setNum_001(int Num_001) {
        this.Num_001 = Num_001;
    }

    public int getNum_002() {
        return Num_002;
    }

    public void setNum_002(int Num_002) {
        this.Num_002 = Num_002;
    }
    
    
    
    
}
    
    
      

