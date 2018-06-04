package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Task {

    private String description;
    private boolean completed;
    private LocalDateTime createdAt;
    private int id;
    private int categoryId;

    public Task(String description, int categoryId) {
        this.description = description;
        this.completed = false;
        this.createdAt = LocalDateTime.now();
        this.categoryId = categoryId;
    }

    public void setDescription(String description) { this.description = description; }
    public String getDescription() {
        return description;
    }

    public void setCompleted(boolean completed) { this.completed = completed; }
    public boolean getCompleted(){
        return this.completed;
    }

    public LocalDateTime getCreatedAt() { return createdAt; }

    public void setId(int id) { this.id = id; }
    public int getId() {
        return id;
    }

    public int getCategoryId() { return categoryId; }
    public void setCategoryId(int categoryId) { this.categoryId = categoryId; }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Task task = (Task) o;
      if (completed != task.completed) return false;
      if (id != task.id) return false;
      if (categoryId != task.categoryId) return false;
      return description != null ? description.equals(task.description) : task.description == null;
    }

    @Override
    public int hashCode() {
      int result = description != null ? description.hashCode() : 0;
      result = 31 * result + (completed ? 1 : 0);
      result = 31 * result + id;
      result = 31 * result + categoryId;
      return result;
    }
}
