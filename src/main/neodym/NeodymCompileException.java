package neodym;

/**
 * An exception that is being thrown when the code cannot be compiled
 */
public class NeodymCompileException extends RuntimeException {
    public NeodymCompileException() {
        super();
    }

    public NeodymCompileException(String message) {
        super(message);
    }
}
