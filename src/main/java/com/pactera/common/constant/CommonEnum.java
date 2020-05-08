package com.pactera.common.constant;

import lombok.Getter;

public class CommonEnum {

    public enum DeleteType {
        /**
         * 未删除
         */
        NOT_DELETED(0),
        /**
         * 已删除
         */
        DELETED(1);


        private Integer value;

        DeleteType(Integer value) {
            this.value = value;
        }

        public int value() {
            return this.value;
        }

    }

    public enum ValidStatus {

        /**
         * 有效
         */
        VALID(0),
        /**
         * 无效
         */
        INVALID(1);

        private Integer value;

        ValidStatus(Integer value) {
            this.value = value;
        }

        public int value() {
            return this.value;
        }
    }

    @Getter
    public enum SmsType {
        LOGIN_VERIFICATION_CODE(1, "loginVerificationCode_", "app登录验证码登录"),
        RESET_PASSWORD(2, "resetPassword_", "app会员忘记密码重置"),
        MODIFY_PHONE(3, "modifyPhone_", "app会员修改手机号"),
        BANK_CARD(4, "bankCard_", "web个人中心--绑定银行卡"),
        ACCOUNT_INFO(5, "accountInfo_", "web商家管理--添加商家管理员发送用户名密码");

        private Integer type;

        private String key;

        private String desc;

        SmsType(Integer type, String key, String desc) {
            this.type = type;
            this.key = key;
            this.desc = desc;
        }

        public static SmsType getByType(Integer type) {
            for (SmsType smsType : SmsType.values()) {
                if (smsType.type.equals(type)) {
                    return smsType;
                }
            }
            return null;
        }
    }
}
