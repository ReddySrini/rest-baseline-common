package rest.baseline.commom.model;

/**
 * 
 * <code>Error</code> is a model class used to hold the error details.<br>
 *
 * @author Mindstix-ychawda, susmit
 */
public class Error {

    /**
     * Business Error code
     */
    private String error;

    /**
     * Business Error Message / Description
     */
    private String message;

    /**
     * This is a parameterized constructor.
     * 
     * @param error
     * @param message
     */
    public Error(String error, String message) {
        this.error = error;
        this.message = message;
    }

    /**
     * This is a default constructor.
     */
    public Error() {
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
