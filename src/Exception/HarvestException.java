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
public class HarvestException extends Exception {

    public HarvestException() {
    }

    public HarvestException(String message) {
        super(message);
    }

    public HarvestException(String message, Throwable cause) {
        super(message, cause);
    }

    public HarvestException(Throwable cause) {
        super(cause);
    }

    public HarvestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
