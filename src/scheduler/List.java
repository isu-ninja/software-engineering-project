package scheduler;

import java.util.LinkedList;
import java.util.Scanner;


public class List {
	
	LinkedList <Task> listedTasks;
	
	public List()
	{
		this.listedTasks = new LinkedList <Task>();
	}
	
	public void addTask(Task newTask)
	{
		this.listedTasks.add(newTask);
	}
	
	public void removeTask(Task completedTask)
	{
		this.listedTasks.remove(completedTask);
	}

	public void editTask()
	{
		//TO-DO add input validation
		int targetTask;
		Scanner input = new Scanner(System.in);
		
		display();
		System.out.println("Please input task number to edit: ");
		targetTask = input.nextInt();
		
		System.out.println("Please input new task name: ");
		this.listedTasks.get(targetTask).setName(input.nextLine());
		
		
		
		System.out.println("Please input new task details: ");
		this.listedTasks.get(targetTask).setDetails(input.nextLine());
		
		System.out.println("Task has been updated to: Name: " + this.listedTasks.get(targetTask).getName() + " Details: " + this.listedTasks.get(targetTask).getDetails());
		input.close();

	}
	
	public void display() {
		
		for(int x = 0; x < listedTasks.size(); x ++)
			System.out.println( x + ": " + listedTasks.get(x).getName() + ": " + listedTasks.get(x).getDetails());
		
	}
}
