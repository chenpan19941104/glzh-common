package com.pactera.common.result;

import lombok.Getter;

/**
 * 枚举了一些常用API操作码
 * Created by macro on 2019/4/19.
 */
@Getter
public enum CommonErrorCode implements IErrorCode {
    SUCCESS(200, "操作成功"),
    FAILED(-1, "操作失败"),
    NOT_FOUND(404, "页面不存在"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限"),
    INVALID_PARAM(400, "非法参数！"),
    METHOD_NOT_SUPPORTED(405, "调用方式错误"),
    SERVER_ERROR(500,"抱歉，系统异常，请联系管理员！"),

    NOT_FOUND_OR_STATUS_ERROR(1001, "实体不存在或状态错误"),
    ERROR_OPERATE_TYPE(1002,"错误的操作类型"),
    USER_NOT_FOUND(1003,"用户不存在"),
    REMOTE_CALL_FAILED(1004, "远程调用失败"),
    DATA_CONCURRENT_MODIFY(1005, "数据并发修改异常"),
    SEND_SMS_ERROR(1006, "发送短信失败");

    private int code;
    private String message;

    CommonErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
