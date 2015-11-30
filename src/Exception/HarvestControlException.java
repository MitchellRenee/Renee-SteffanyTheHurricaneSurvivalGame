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
public class HarvestControlException extends Exception {

    public HarvestControlException() {
    }

    public HarvestControlException(String message) {
        super(message);
    }

    public HarvestControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public HarvestControlException(Throwable cause) {
        super(cause);
    }

    public HarvestControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
