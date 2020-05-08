package com.pactera.common.exception;

import com.pactera.common.result.CommonResult;
import com.pactera.common.result.IErrorCode;
import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;

//@ControllerAdvice
@Slf4j
public class ExceptionCatch {

    //捕获 CustomException异常
//    @ExceptionHandler(CommonException.class)
//    @ResponseBody
//    public ResponseEntity<CommonResult<IErrorCode>> commonException(CommonException e){
//        log.error("catch exception : {}\r\nexception: ",e.getMessage(), e);
//        IErrorCode errorCode = e.getErrorCode();
//        HttpStatus httpStatus = getHttpStatus(errorCode.getCode());
//        return new ResponseEntity<>(CommonResult.failed(errorCode), httpStatus);
//    }

//    private HttpStatus getHttpStatus(int errorCode) {
//        HttpStatus httpStatus = HttpStatus.resolve(errorCode);
//        if(null == httpStatus){
//            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
//        }
//        return httpStatus;
//    }

   /* @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<CommonResult> exception(Exception e){
        log.error("catch exception : {}\r\nexception: ",e.getMessage(), e);
        if(null == EXCEPTIONS){
            EXCEPTIONS = builder.build();
        }
        IErrorCode errorCode = EXCEPTIONS.get(e.getClass());
        if (null == errorCode){
            return new ResponseEntity<>(CommonResult.failed(CommonErrorCode.SERVER_ERROR, e.getMessage()),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
        HttpStatus httpStatus = getHttpStatus(errorCode.getCode());
        return new ResponseEntity<>(CommonResult.failed(errorCode), httpStatus);
    }


    static{
        //在这里加入一些基础的异常类型判断
        builder.put(HttpMessageNotReadableException.class, CommonErrorCode.INVALID_PARAM);
        builder.put(MissingServletRequestParameterException.class, CommonErrorCode.INVALID_PARAM);
        builder.put(NullPointerException.class, CommonErrorCode.SERVER_ERROR);
        builder.put(HttpRequestMethodNotSupportedException.class, CommonErrorCode.METHOD_NOT_SUPPORTED);
    }*/
}
