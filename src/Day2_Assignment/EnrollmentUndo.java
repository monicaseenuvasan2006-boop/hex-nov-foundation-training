package Day2_Assignment;
import java.util.*;
public class EnrollmentUndo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<String> learners=new Stack<String>();
		System.out.println("****Enrollment Menu****");
        System.out.println("1.Enroll learner");
        System.out.println("2.Undo last enrollment");
        System.out.println("3.Show last enrollment");
        System.out.println("4.Exit");
		int choice;  
		do{ 
		
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        sc.nextLine();  
        	switch(choice){      
		case 1:
			System.out.print("Enter learner name: ");
            String name = sc.nextLine();
            learners.push(name);
            System.out.print("Enrolled succesfully");
			break;
		case 2:
			if (learners.empty())
				System.out.println("Nothing to undo");
			else {
                 String learner=learners.pop();
                 System.out.println("Undone : " +learner);
			}
			break;
		case 3:
			if (learners.empty())
				System.out.println("Nothing to undo");
			else 
				System.out.println("Last enrolled : "+learners.peek());
			break;
		case 4:
            System.out.println("Exiting program...");
            break;

		default:
			System.out.println("Invalid choice");
			break;
		}
	}while(choice!=4);
	}

}
