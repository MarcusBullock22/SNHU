import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskService 
{
	 
    public static List<Task> tasks = new ArrayList<>();

    public static void main(String[] args) 
    {

        TaskService service = new TaskService();


        service.addTask(new Task("1", "Games", "Runescape"));
        service.addTask(new Task("2", "Movies", "Blades of glory"));
        service.addTask(new Task("3", "Music", "Acacia"));
        
        //display all added and updated Task object
        for (Task obj : tasks) 
        {
            System.out.println(obj);
        }
        
        
        service.addTask(new Task("1", "Games", "League of Legends"));

        System.out.println("Delete Task ID #2");
        service.deleteTask("2");
        System.out.println("Update Task ID #3");
        service.update(new Task("3", "Music", "Hello World"));

        
        for (Task obj : tasks) 
        {
            System.out.println(obj);
        }
    }

 
    public boolean addTask(Task task) 
    {

        int index = getIndex(task);

        if (index < 0 && validateID(task.getId()) && validateName(task.getName()) && validateDescription(task.getDescription())) 
        {
            tasks.add(task);
            return true;
        }
        
        return false;
    }


    public void deleteTask(String id)
    {

        int index = getIndex(new Task(id, "", ""));
        
        
        if (index >= 0)
            tasks.remove(index);
    }

    
    public void update(Task task)
    {
        for (Task obj : tasks)
        {
            if (obj.equals(task) && validateName(task.getName()) && validateDescription(task.getDescription())) 
            {
                obj.setName(task.getName());
                obj.setDescription(task.getDescription());
            }
        }
    }

   
    public int getIndex(Task task) 
    {
        int index = Collections.binarySearch(tasks, task, Task.compareById);
        return index;
    }

    public boolean validateID(String id) 
    {
        if (id != null && id.length() <= 10)
            return true;

        return false;
    }

    
    public boolean validateName(String name)
    {
        if (name != null && name.length() <= 20)
            return true;

        return false;
    }

   
    public boolean validateDescription(String description) 
    {
        if (description != null && description.length() <= 50)
            return true;

        return false;
    }
}
