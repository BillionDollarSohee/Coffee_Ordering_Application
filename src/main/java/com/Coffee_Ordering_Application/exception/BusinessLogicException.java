package com.Coffee_Ordering_Application.exception;

import lombok.Getter;

public class BusinessLogicException extends RuntimeException{
    @Getter
    private ExceptionCode exceptionCode;

    public BusinessLogicException(ExceptionCode exceptionCode){
        this.exceptionCode = exceptionCode; //super(exceptionCode.getMessage());
    }
}
