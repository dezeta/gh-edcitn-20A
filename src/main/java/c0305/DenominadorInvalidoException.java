package c0305;

/**
 * Clase que representa a un objeto de tipo Exception
 * <br>Sera lanzado cuando el denominador que nos pasan sea invalido
 * @author Derlis Zarate
 */
public class DenominadorInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public DenominadorInvalidoException() {
        super("El denominador es invalido");
    }

    public DenominadorInvalidoException(String msg) {
        super("El denominador es invalido: " + msg);
    }
}
