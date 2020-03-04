package c0304;

public class PrototipoATM {
    
    //Esta es la clase ejecutable del proyecto, 
    //instancia un objeto ATM y ejecuta la llamada a la funcion que orquesta la ejecucion.
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.ejecutarOperacionesATM();
    }
}
