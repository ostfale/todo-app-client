package de.ostfale.todoappclient.todo;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Domain model
 * Created :  23.09.2019
 *
 * @author : Uwe Sauerbrei
 */
public class ToDo {

    private String id;
    private String description;
    private LocalDateTime created;
    private LocalDateTime modified;
    private boolean completed;

    public ToDo() {
        LocalDateTime dateTime = LocalDateTime.now();
        this.id = UUID.randomUUID().toString();
        this.created = dateTime;
        this.modified = dateTime;
    }

    public ToDo(String description) {
        this();
        this.description = description;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                ", completed=" + completed +
                '}';
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
