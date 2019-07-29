package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Task input = new Task();
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> task = new ArrayList<>();
		ArrayList<String> date = new ArrayList<>();
		ArrayList<Boolean> finish = new ArrayList<>();
		boolean cont = false;
//		taskList.add(new Task("Sean", "testing", LocalDate.parse("2019-08-12")));
//		taskList.add(new Task("Sean", "testing2", LocalDate.parse("2019-08-13")));
////		System.out.println(taskList);
//		for(int i = 0; i < taskList.size(); i++) {
//			System.out.println(taskList.get(i));
//		}
		
	
		
		System.out.println("Welcome to the Task Manager!");
		do {
			System.out.println("1. List tasks");
			System.out.println("2. Add task");
			System.out.println("3. Delete task");
			System.out.println("4. Mark task complete");
			System.out.println("5. Quit");
			
			System.out.println("What would you like to do? ");
			int userInputNum = scan.nextInt();
			scan.nextLine();
			
			if(userInputNum == 1) {
				System.out.println("LIST TASKS");
				System.out.printf("Team member: " + "\t\t\t" + "Description", "\t\t\t" + "Due Date", "\t\t\t" + "Done?");
				for(int i = 0; i < name.size(); i++) {
					int n = i + 1;
					System.out.println(n + "." + name.get(i) + "\t\t\t" + task.get(i) + "\t\t\t" + date.get(i) + "\t\t\t" + finish.get(i));
				}
			}else if(userInputNum == 2) {
				System.out.println("ADD TASK");
				System.out.println("Team Member Name: ");
				String names = scan.nextLine();
				input.setName(name);
				input.getName(name);
				
			}
		}while(cont == false);

	}
//	public static void displayMenu(Set<String> promptList) {
//		Set<String> promptLists = new TreeSet<>();
//		promptList.add("1. List task");
//		promptList.add("2. Add task");
//		promptList.add("3. Delete task");
//		promptList.add("4. Mark task complete");
//		promptList.add("5. Quit");
//		
//	}

}
