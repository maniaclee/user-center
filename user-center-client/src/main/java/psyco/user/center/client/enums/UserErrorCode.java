package psyco.user.center.client.enums;

/**
 * Created by lipeng on 15/10/21.
 */
public enum UserErrorCode implements BaseEnum {
    USER_EXIST(0, "用户已存在"),
    USER_NONE_EXIST(1, "用户不存在"),

    USER_INSERT_ERROR(101, "用户落库失败"),

    /**
     * -------- bind issue ----------
     */
    USER_PHONE_BINDED(201, "用户手机已绑定"),
    USER_EMAIL_BINDED(202, "用户邮箱已绑定");

    private int code;
    private String desc;

    UserErrorCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "UserErrorCode{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
