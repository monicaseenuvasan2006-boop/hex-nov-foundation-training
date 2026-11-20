package Day2_Assignment;

import java.util.*;

public class BatchWaitlist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] seats=new String[3];
        Queue<String> waitlist=new LinkedList<>();
        String[] learners ={"Asha","Ravi","Meena","Kiran","Pooja"};
        for (String learner:learners) {
            boolean assigned = false;
            for (int i=0; i<seats.length;i++) {
                if (seats[i] == null) {
                    seats[i] = learner;
                    assigned = true;
                    break;
                }
            }
            if (!assigned) {
                waitlist.offer(learner);
            }
            System.out.println("\nAfter joining " + learner);
            System.out.println("Seats: " + Arrays.toString(seats));
            System.out.println("Waiting: " + waitlist);
        }
        System.out.print("\nEnter learner name to drop out: ");
        String dropName = sc.nextLine();
        boolean found = false;
        for (int i=0; i<seats.length;i++) {
            if (seats[i]!=null && seats[i].equals(dropName)) {
                found = true;
                seats[i] = null;
                System.out.println(dropName + " dropped out");
                if (!waitlist.isEmpty()) {
                    String nextlearner = waitlist.poll();
                    seats[i] = nextlearner;
                    System.out.println(nextlearner + " got the seat");
                }

                break;
            }
        }
        if (!found) {
            System.out.println("Learner not found in batch");
        }

        System.out.println("\nFinal Seats: " + Arrays.toString(seats));
        System.out.println("Final Waiting List: " + waitlist);
        sc.close();
    }
}