/**
 * @author Alfazard on 22.06.2023
 */
public class Cat {
    public Cat() {
    }

    public Cat(String message) {
        this.message = message;
    }

    private String message;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
