import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TaskTest 
{
	 @Test public void createValidTaskData() 
	 {
	      Task task = new Task("1", "Games", "Runescape");
	      System.out.println(task);
	 }
}
