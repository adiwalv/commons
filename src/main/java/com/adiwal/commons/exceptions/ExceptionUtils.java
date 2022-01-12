/**
 * © Vikas Adiwal (adiwalv@gmail.com) 2020. All rights reserved.
 * CONFIDENTIAL AND PROPRIETARY INFORMATION OF VIKAS ADIWAL.
 */
package com.adiwal.commons.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Slf4j
public class ExceptionUtils {


    public ExceptionUtils() {
    }


    public static ResponseEntity<Error> handle(Exception e, HttpStatus status) {
        Error error = new Error(status.value(), status.getReasonPhrase(), e.getClass().toString(), e.getMessage());
        logError(error, e);
        return new ResponseEntity(error, status);
    }

    public static ResponseEntity<Error> handleBadRequest(Exception e) {
        return handle(e, HttpStatus.BAD_REQUEST);
    }

    public static void logError(Error error, Exception ex) {
        if (log.isDebugEnabled()) {
            log.debug(String.format("error: %d %s Path:%s errorDescription: %s", error.getStatus(), error.getErrorName(), error.getException(), error.getErrorDescription()), ex);
        } else {
            log.info(String.format("error: %d %s Path:%s errorDescription: %s", error.getStatus(), error.getErrorName(), error.getException(), error.getErrorDescription()));
        }

    }
}