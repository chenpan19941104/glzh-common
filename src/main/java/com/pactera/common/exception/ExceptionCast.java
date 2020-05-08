package com.pactera.common.exception;

import com.pactera.common.result.IErrorCode;

public class ExceptionCast {

    /**
     * 使用此静态方法抛出自定义异常
     * @param errorCode
     */
    public static void cast(IErrorCode errorCode){
        throw new CommonException(errorCode);
    }
}
