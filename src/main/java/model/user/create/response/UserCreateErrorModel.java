package model.user.create.response;

public class UserCreateErrorModel
{
    private boolean success;
    private String message;


    public UserCreateErrorModel() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
