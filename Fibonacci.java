/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal.pkg1;

/**
 *
 * @author Praktikum
 */
public class Fibonacci {
    private int input;
    private int hasil;
    
    public Fibonacci(){
    }
    
    public Fibonacci(int input) {
        this.input = input;
    }
    
    public void setInput(int input){
        this.input = input;
    }
    
    public int getHasil(){
        int N1 = 0, N2 = 1;
        System.out.println(N2);
        for(int i = 1; i < input; i++){
                this.hasil = N1 + N2;
                System.out.println(this.hasil);
                N1 = N2;
                N2 = hasil;
        }
        return hasil;
    }
    
    public int getHasilSum(){
        int N1 = 0, N2 = 1;
        System.out.println(N2);
        for(int i = 1; i < input; i++){
                this.hasil = N1 + N2;
                System.out.println(this.hasil);
                N1 = N2;
                N2 = hasil;
                
        }
        return hasil;
    }    
}
