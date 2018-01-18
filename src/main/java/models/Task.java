package models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Task {

    private String taskName;
    private String description;
    private boolean completed;
    private int id;
    private int categoryId;
    private LocalDateTime createdAt;

    public Task(String taskName, String description, int categoryId){
        this.taskName = taskName;
        this.description = description;
        this.completed = false;
        this.categoryId = categoryId;
        this.createdAt = LocalDateTime.now();


    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getCompleted(){
        return this.completed;
    }

    public int getId() {
        return this.id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (completed != task.completed) return false;
        if (id != task.id) return false;
        if (categoryId != task.categoryId) return false;
        return description.equals(task.description);
    }

    @Override
    public int hashCode() {
        int result = description.hashCode();
        result = 31 * result + (completed ? 1 : 0);
        result = 31 * result + id;
        result = 31 * result + categoryId;
        return result;
    }
}