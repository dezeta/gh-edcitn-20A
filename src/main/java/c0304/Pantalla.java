package c0304;

public class Pantalla {
    
    //Operacion que recibe un String y lo despliega en pantalla.
    public void mostrarMensaje(String mensaje) {
        System.out.print(mensaje);
    }
    
    //funcion auxiliar que simula un limpiado de pantalla
    public void limpiarPantalla() {
        for (int i = 0; i < 40; i++) {
            System.out.print("\n");
        }
    }
        
}
