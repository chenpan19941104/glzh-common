package com.pactera.common.result;

import lombok.Getter;

@Getter
public enum ObsErrorCode implements IErrorCode {

    UPLOAD_SUCCESS(9001, "上传成功"),
    UPLOAD_FAILED(9002,"上传失败");

    private int code;
    private String message;

    ObsErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
