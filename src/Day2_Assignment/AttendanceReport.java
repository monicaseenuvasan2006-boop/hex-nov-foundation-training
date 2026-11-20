package Day2_Assignment;
import java.util.*;
public class AttendanceReport {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] attendance = {20, 25, 30, 15, 40, 35, 50, 45, 20, 30};
        int[] Total =new int[attendance.length]; 
        System.out.println("ENter the starting and ending day : ");
        int startDay=sc.nextInt();
        int endDay=sc.nextInt();
        Total[0] = attendance[0];
        for(int i=1;i<attendance.length;i++) 
            Total[i] = Total[i-1] + attendance[i];
        
        if(startDay>=1&&endDay<=attendance.length && startDay<=endDay) {
            int total;
            if(startDay==1) {
                total=Total[endDay-1];
            } 
            else{
                total=Total[endDay-1]-Total[startDay-2];
            }
            System.out.println("Total Attendance from Day "+startDay+ " to Day " +endDay+ " : "+total);
        } 
        else{
            System.out.println("Invalid Range");
        }
        int max = attendance[0];
        int maxDay = 1;
        for (int i=1;i<attendance.length;i++) {
            if (attendance[i]>max) {
                max=attendance[i];
                maxDay=i + 1;
            }
        }
        System.out.println("Highest Attendance: " + max);
        System.out.println("Highest Attendance Day: " + maxDay);
    }
}