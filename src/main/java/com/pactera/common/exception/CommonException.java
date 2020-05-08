package com.pactera.common.exception;

import com.pactera.common.result.IErrorCode;
import lombok.Getter;

@Getter
public class CommonException extends RuntimeException {

    private IErrorCode errorCode;

    public CommonException(String message) {
        super(message);
    }

    public CommonException(IErrorCode errorCode) {
        super("错误代码："+errorCode.getCode()+";错误信息："+errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
