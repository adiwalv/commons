/**
 * © Vikas Adiwal (adiwalv@gmail.com) 2020. All rights reserved.
 * CONFIDENTIAL AND PROPRIETARY INFORMATION OF VIKAS ADIWAL.
 */
package com.adiwal.commons.exceptions;

public class AdiwalAuthException extends RuntimeException {
    public AdiwalAuthException(String msg) {
        super(msg);
    }

    public AdiwalAuthException(Exception ex) {
        super(ex);
    }

    public AdiwalAuthException(String message, Throwable cause) {
        super(message, cause);
    }
}