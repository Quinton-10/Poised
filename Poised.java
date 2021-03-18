import java.util.Scanner;

public class Poised {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prints Welcome and asks user input for different questions and saving each answer as a variable 
		System.out.println("Welcome to Poised!");
		System.out.print("Enter Project Number: ");
		int projectNum = input.nextInt();
		System.out.print("\nEnter the Total fee for the project: ");
		Double totalFee = input.nextDouble();
		System.out.print("\nEnter amount paid to date: ");
		Double amountPaid = input.nextDouble();
		input.nextLine();
		System.out.print("\nEnter the Deadline for the project(dd-mm-yyyy): ");
		String dueDate = input.nextLine();
		System.out.print("\nEnter ERF number: ");
		int erf = input.nextInt();
		input.nextLine();
		System.out.print("\nEnter Clients Surname: " );
		String clientSurname = input.nextLine();
		System.out.print("\nEnter Project name: ");
		String projectName = input.nextLine();
		System.out.print("\nEnter the building type(house, appartment, office etc.): ");
		String buildingType =  input.nextLine();
		System.out.print("\nEnter Physical Address: ");
		String address = input.nextLine();
		
		
		//If there is no project name the project name will be the surname of the client and the building type	
		if (projectName == "") {
			projectName = buildingType + " " + clientSurname;
			project project = new project(projectNum, projectName, buildingType, address, erf, totalFee, amountPaid, dueDate);
			System.out.println(""+ "Project");
			System.out.println(project + "\n");
		}
		else {
			//else it will print the new project that they created
			project project = new project(projectNum, projectName, buildingType, address, erf, totalFee, amountPaid, dueDate);
			System.out.println(""+ "Project");
			System.out.println(project + "\n");
		}
		//Ask user to create a person and asking for the persons details and saving it as a variable
		System.out.print("Enter If person is a Customer/Architect/Contractor: ");
		String relation = input.nextLine();
		System.out.print("Enter name: ");
		String name = input.nextLine();
		System.out.print("Enter surname: ");
		String surname = input.nextLine();
		System.out.print("Enter Telephone number: ");
		String tellNum = input.nextLine();
		System.out.print("Enter email: ");
		String email = input.nextLine();
		System.out.print("Enter Physical Address: ");
		String physicalAddress = input.nextLine();
		//prints out the persons details in format from createPerson	
		createPerson person = new createPerson(relation, name, surname, tellNum, email, physicalAddress);
		System.out.println(person + "\n");
		
		//pops up a menu and the user must select an option
		System.out.print("Enter an option:\n a - edit due date of project?:\n b - edit amount fees paid to date\n c - update contractor details\n d - Finalise Project");
		String option = input.next();
		if (option.equals("a")) {
			//if user selects "a" they can edit the due date of the project and prints out all the details with new due date
			System.out.print("Enter new Due Date: ");
			String newDueDate = input.next();
			project project = new project(projectNum, projectName, buildingType, address, erf, totalFee, amountPaid, newDueDate);
			System.out.println(""+ "Project");
			System.out.println(project + "\n");
			
		}else if (option.equals("b")) {
			//If user selects "b" they can enter the new full amount paid to date and prints out all the updated details
			System.out.print("Enter full amount paid to date: ");
			Double newAmountPaid = input.nextDouble();
			project project = new project(projectNum, projectName, buildingType, address, erf, totalFee, newAmountPaid, dueDate);
			System.out.println(""+ "Project");
			System.out.println(project + "\n");
			
		}else if (option.equals("c")) {
			if (relation.equals("Contractor")) {
				//if user selects "c" and if the person they created is a contractor they can edit his contact details
				System.out.print("Enter which contact details you would like to update Telephone number or email just type telephone or email: ");
				String update = input.next();
				if (update.equals("telephone")) {
					System.out.print("Enter new telephone number: ");
					String newTele = input.next();
					createPerson updatedPerson = new createPerson(relation, name, surname, newTele, email, physicalAddress);
					System.out.println(""+ relation);
					System.out.println(updatedPerson + "\n");
				}else {
					System.out.print("Enter new email: ");
					String newEmail = input.next();
					createPerson updatedPerson = new createPerson(relation, name, surname, tellNum, newEmail, physicalAddress);
					System.out.println(""+ relation);
					System.out.println(updatedPerson + "\n");
				}
				
				
			}else {
				System.out.println("No Contractor available");
			}
		}else if (option.equals("d")) {
			//if user enters "d" they can finalize the the project
			System.out.print("Do you want to finalise this project? Yes/No");
			String finalise = input.next();
			if (finalise.equals("Yes")) {
				System.out.println("Project " + projectName + " is Finalised");
			}else {
				System.out.println("Project " + projectName + " is Not finalised");
			}
		}		
	}
}
