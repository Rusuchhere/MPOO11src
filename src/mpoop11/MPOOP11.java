/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop11;

/**
 *
 * @author alumno
 */
public class MPOOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        String[] mensaje ={"mensaje 1","mensaje 2", "mensaje 3"};
        for (int i = 0; i < 3; i++) {
            System.out.println(mensaje[i]);
        }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Sigue el código");
        System.out.println("#######Division entre 0#########");
        try{
        float x = 10/0;
        System.out.println("x= " +x);
        }catch(ArithmeticException ex){
            System.out.println("Error"+ex.getMessage());
        }finally{
            System.out.println("Apesar de todo se ejecuta el finally");
        }
        System.out.println("#######catch anidado#########");
        try{
        float x = 10/0;
        System.out.println(" Error x= " +x);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }catch(ArithmeticException ex){
            System.out.println("Error"+ex.getMessage());
        }finally{
            System.out.println("Apesar de todo se ejecuta el finally");
        }
        System.out.println("#####Propagación de excepciones#####");
        try{
        double division = miMetodoDivision(20.0f,0);
        System.out.println(division);
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("########MI cuenta######");
        Cuenta cuenta = new Cuenta();
        
        try{
        System.out.println(cuenta.getSaldo());
        cuenta.depositar(1500);
        System.out.println(cuenta.getSaldo());
        cuenta.retirar(500);
        System.out.println(cuenta.getSaldo());
        cuenta.retirar(500);
        
        
        }catch (SaldoInsuficienteException ex){
            System.out.println(ex.getLocalizedMessage());
        }
        
        catch (SaldoMaximoException ex){
            System.out.println(ex.getLocalizedMessage());
        }
        System.out.println("saldo final "+cuenta.getSaldo());
       
        
    }

    private static double miMetodoDivision(float f, double d) throws ArithmeticException{
        return f/d;
    }
    
}
