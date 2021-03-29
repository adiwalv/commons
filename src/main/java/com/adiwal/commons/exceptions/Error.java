/**
 * © Vikas Adiwal (adiwalv@gmail.com) 2020. All rights reserved.
 * CONFIDENTIAL AND PROPRIETARY INFORMATION OF VIKAS ADIWAL.
 */
package com.adiwal.commons.exceptions;

import lombok.Data;

@Data
public class Error {
    private final int status;
    private final String errorName;
    private final String exception;
    private final String errorDescription;
}