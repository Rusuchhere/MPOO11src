/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop11;

/**
 *Clase cuenta donde implementamos
 * los métodos
 * @author alumno
 */
public class Cuenta {
    /**
     * único variable (saldo)
     */
    private float saldo;
    
    /**
     * Constructor vacío
     */
    public Cuenta() {
    }
    
    public float getSaldo() {
        return saldo;
    }
    /**
     * Método que lanza una excepción cuando el saldo en la cuenta
     * es menor que el retiro deseado 
     * @param monto
     * @throws SaldoInsuficienteException 
     */
    public void retirar(float monto) throws SaldoInsuficienteException {
        int n=0;
        while (n<3){
            System.out.println("Retirando..." + monto);
            if(saldo<monto){
                throw new SaldoInsuficienteException();
            }else{
            saldo-=monto;
            }
            n++;
        }
    }
    /**
     * Método que lanza la excepción de monto máximo
     * que con la condición if no deja depositar más de 20 mil pesos
     * @param monto
     * @throws SaldoMaximoException 
     */
    public void depositar(float monto) throws SaldoMaximoException{
        if(monto<=20000){
        System.out.println("Depositando...");
        saldo+=monto;
        }else{
            throw new SaldoMaximoException();
        }
    
}
    /*public void retiro(float monto) throws RetiroMaximoException{
        int n=0;
        do{
            System.out.println("Retirando..."); otro método
             
        }while (n<3);
         n++;
        throw new RetiroMaximoException();
    }*/
 
}    

    


