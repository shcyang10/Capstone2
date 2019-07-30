package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		String description;
		String dueDate;
		String completed;
		
		boolean check = true;
		
		ArrayList<Task> taskList = new ArrayList<>();
		
//		ArrayList<String> name = new ArrayList<>();
//		ArrayList<String> task = new ArrayList<>();
//		ArrayList<String> date = new ArrayList<>();
//		ArrayList<Boolean> finish = new ArrayList<>();
//		taskList.add(new Task("Sean", "testing", LocalDate.parse("2019-08-12")));
//		taskList.add(new Task("Sean", "testing2", LocalDate.parse("2019-08-13")));
////		System.out.println(taskList);
//		for(int i = 0; i < taskList.size(); i++) {
//			System.out.println(taskList.get(i));
//		}
		
	
		
		System.out.println("Welcome to the Task Manager!");
		
			while (check) {
				System.out.println("1. List tasks");
				System.out.println("2. Add task");
				System.out.println("3. Delete task");
				System.out.println("4. Mark task complete");
				System.out.println("5. Quit");
				System.out.println("What would you like to do? ");
				int userInputNum = scan.nextInt();
				scan.nextLine();
				switch (userInputNum) {
				case 1:
					System.out.println("LIST TASKS");
					for(int i = 0; i < taskList.size(); i++) {
						System.out.println(taskList.get(i));
					}

					check = true;
					System.out.println("");
					break;
				case 2:
					System.out.println("ADD TASK");
					System.out.println("Team member: ");
					name = scan.nextLine();
					System.out.println("Task Description:");
					description = scan.nextLine();
					System.out.println("Due Date: ");
					dueDate = scan.next();

					taskList.add(new Task(name, description, dueDate));
					System.out.println("Task entered!");
					check = true;
					System.out.println("");
					break;
				case 3:
					System.out.println("Enter the number of the task your like to delete:");
					int userChoice = scan.nextInt();
					taskList.remove(userChoice -1);
					System.out.println(taskList);
					break;
				case 4:
					System.out.println("Which task would you like to mark Complete: ");
					int userNum = scan.nextInt();
					taskList.get(userNum -1);
					System.out.println(taskList.get(userInputNum));
					
				case 5:
					System.out.println("Thank you for using Task Manager!");
					break;

			
	}
				scan.close();
}
	}		
}
