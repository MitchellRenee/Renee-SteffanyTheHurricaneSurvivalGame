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
public class MoneyAccountException extends Exception {

    public MoneyAccountException() {
    }

    public MoneyAccountException(String message) {
        super(message);
    }

    public MoneyAccountException(String message, Throwable cause) {
        super(message, cause);
    }

    public MoneyAccountException(Throwable cause) {
        super(cause);
    }

    public MoneyAccountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
