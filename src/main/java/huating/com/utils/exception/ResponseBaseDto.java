package huating.com.utils.exception;

import java.io.Serializable;

public class ResponseBaseDto implements Serializable{
    private String message="操作成功";
    private String success="1";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}
