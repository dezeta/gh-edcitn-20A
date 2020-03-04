package c0304;

public class ATM {

    //Atributos
    private boolean usuarioAutenticado;
    private int nroCuentaAutenticado;
    private StringBuilder menuPrincipal;

    //referencia a objetos asociados
    private final Pantalla pantalla;
    private final Teclado teclado;
    private final BaseDatosBanco baseDatos;
    private Transaccion transaccion;    

    //Constructor
    public ATM() {
        usuarioAutenticado = false;
        nroCuentaAutenticado = 0;
        pantalla = new Pantalla();
        teclado = new Teclado();
        baseDatos = new BaseDatosBanco();
        inicializarMensajesYMenus();
    }

    private void inicializarMensajesYMenus() {
        menuPrincipal = new StringBuilder();
        menuPrincipal.append("Menu Principal");
        menuPrincipal.append("\n\t1. Ver mi saldo");
        menuPrincipal.append("\n\t2. Retirar efectivo");
        menuPrincipal.append("\n\t3. Depositar fondos");
        menuPrincipal.append("\n\t4. Salir");
        menuPrincipal.append("\n\nEscriba el nro. de la opcion seleccionada: ");
    }

    //metodo que inicia una sesion del usuario
    private void iniciarSesion() {
        int nroCuentaIngresado;
        int pinIngresado;

        pantalla.limpiarPantalla();
        pantalla.mostrarMensaje("Bienvenido/a al ATMStar");
        pantalla.mostrarMensaje("\n\n\tEscriba su nro. de cuenta (o un nro. negativo para terminar): ");
        nroCuentaIngresado = teclado.obtenerEntradaInt();
        if (nroCuentaIngresado < 0) System.exit(0);
        
        pantalla.mostrarMensaje("\n\n\tEscriba su nro. de PIN (o un nro. negativo para terminar): ");
        pinIngresado = teclado.obtenerEntradaInt();
        if (pinIngresado < 0) System.exit(0);
        
        usuarioAutenticado = baseDatos.autenticarUsuario(nroCuentaIngresado, pinIngresado);        
        if (usuarioAutenticado) {
            nroCuentaAutenticado = nroCuentaIngresado;
        }
    }

    //Metodo que maneja y controla las operaciones del ATM.
    //el controlador principal invocado desde el main
    public void ejecutarOperacionesATM() {
        int opcionElegida;
        while (true) {
            iniciarSesion();
            if (usuarioAutenticado) {
                do {
                    pantalla.limpiarPantalla();
                    pantalla.mostrarMensaje(menuPrincipal.toString());
                    opcionElegida = teclado.obtenerEntradaInt();
                    switch (opcionElegida) {
                        case 1: //Ver saldo
                            transaccion = new SolicitudSaldo();
                            transaccion.setNumeroCuenta(nroCuentaAutenticado);
                            transaccion.ejecutar();
                            break;
                            
                        case 2: //Retirar efectivo
                            transaccion = new Retiro();
                            transaccion.setNumeroCuenta(nroCuentaAutenticado);
                            transaccion.ejecutar();
                            break;
                            
                        case 3: //Depositar
                            transaccion = new Deposito();
                            transaccion.setNumeroCuenta(nroCuentaAutenticado);
                            transaccion.ejecutar();
                            break;
                            
                        case 4: //Salir
                            transaccion = null;
                            nroCuentaAutenticado = 0;
                            usuarioAutenticado = false;
                            break;
                    }
                    
                } while (opcionElegida != 4);
                
            } else {
                pantalla.mostrarMensaje("\n\n\t\tNro. de Cuenta o PIN invalido!!\n\n");
                teclado.hacerPausa();
            }
        }
    }
}
