package org.example;

public class Fibonacci {
    int babies = 0;
    int adults = 0;
    int grown_babies = 1;

    //K es el número de parejas de hijos que tiene cada pareja y n el número de meses que pasa
    public int compute(int k, int n){
        if(k<1||n<1){
            throw new RuntimeException("Error: Número negativo introducido");
        }else if(n==1||n==2){
            return 1;
        }
        else{
            for(int i=1;i<n;i++){
                babies = adults*k;
                adults = adults + grown_babies;
                grown_babies = babies;
            }
            int total = adults + babies;
            return total;
        }
    }
}
