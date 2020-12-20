import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskServiceTest 
{
	 public static List<Task> tasks = new ArrayList<>();

	   @Test public void validTaskData() 
	   {
	      Task task = new Task("1", "Games", "Runescape");
	      addTask(task);
	      System.out.println("New Task: " + tasks);
	      System.out.println("size: " + tasks.size());
	   }

	   
	   public boolean addTask(Task task) {
	        int index = getIndex(task);

	        //validate id if doesn't exist, name & description
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
