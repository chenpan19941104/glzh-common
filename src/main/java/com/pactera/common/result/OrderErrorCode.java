package com.pactera.common.result;

import lombok.Getter;

@Getter
public enum OrderErrorCode implements IErrorCode {

    ILLEGAL_QUANTITY(8001, "非法数量"),
    AFTER_SALE_OPERATE_TYPE_ERROR(8002,"售后操作类型错误"),
    AFTER_SALE_EXPIRED(8003, "售后时间过期"),
    ORDER_HAS_COMMENTED(8004, "订单已评论"),
    DISCOUNT_AMOUNT_ERROR(8005, "单品折扣金额超限"),
    SUBSCRIBE_EXPRESS_FAIL(8006, "订阅快递信息失败"),
    ORDER_REFUND_DUPLICATE(8007,"订单退款申请重复"),
    ORDER_HAS_LOCKED(8008, "订单被锁定，无法修改"),
    TRADE_NOT_FOUND(8009, "未找到对应的交易记录");


    private int code;
    private String message;

    OrderErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
