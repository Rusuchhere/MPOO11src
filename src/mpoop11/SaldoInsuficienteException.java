/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop11;

/**
 * Clase que hereda de Exception
 * @author alumno
 */
public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException() {
        super("Límite de retiros");
    }
    
}
