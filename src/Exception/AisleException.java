/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Renee
 */
public class AisleException extends Exception{

    public AisleException() {
    }

    public AisleException(String message) {
        super(message);
    }

    public AisleException(String message, Throwable cause) {
        super(message, cause);
    }

    public AisleException(Throwable cause) {
        super(cause);
    }

    public AisleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
