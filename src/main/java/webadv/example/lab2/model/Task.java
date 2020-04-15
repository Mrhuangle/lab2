package webadv.example.lab2.model;

public class Task {
    int id;
    String message;

    public Task(){}

    public Task(int id, String message) {
        super();
        this.id = id;
        this.message = message;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}

