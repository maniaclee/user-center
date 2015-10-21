package psyco.user.center.client.exceptions;

import psyco.user.center.client.enums.BaseEnum;

/**
 * Created by lipeng on 15/10/21.
 */
public class ErrorCodeException extends Exception {
    private BaseEnum errorCode;

    public ErrorCodeException(BaseEnum errorCode) {
        super(errorCode.toString());
    }

    public BaseEnum getErrorCode() {
        return errorCode;
    }

    @Override
    public String toString() {
        return "ErrorCodeException{" +
                "errorCode=" + errorCode +
                '}';
    }
}
