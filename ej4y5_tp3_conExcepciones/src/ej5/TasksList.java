package ej5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TasksList {
    private List<Task> tasks = new ArrayList<>();



    public TasksList() {}



    public void addTask(Task task) {
        tasks.add(task);
        orderByPriority();
    }
    public int getTaskSize() {
        return tasks.size();
    }
    public List<Task> getTasks() {
        return tasks;
    }
    public void orderByPriority() {
        tasks.sort(Comparator.comparingInt(Task::getPriority).reversed());
    }
    public Iterator<Task> iterator() {
        return tasks.iterator();
    }
    public void removeByDescription(String description) {
        for (Task t : tasks) {
            if (t.getDescription().equals(description)) {
                tasks.remove(t);
                System.out.println("Tarea eliminada");
                break;
            } else {
                System.out.println("La descripcion no coincidio");
                break;
            }
        }
    }
}
