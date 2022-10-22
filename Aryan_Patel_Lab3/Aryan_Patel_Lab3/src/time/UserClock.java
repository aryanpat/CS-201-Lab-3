package time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class UserClock {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the hour: ");
		int hour = input.nextInt();
		
		System.out.println("Enter the min(s): ");
		int min = input.nextInt();
		
		System.out.println("Enter the second(s): ");
		int sec = input.nextInt();
		
		SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
		
		Calendar user = Calendar.getInstance();
		user.set(Calendar.HOUR_OF_DAY, hour);
		user.set(Calendar.MINUTE, min);
		user.set(Calendar.SECOND, sec);
		
		System.out.println("The users 12 hour clock is: " + format.format(user.getTime()));
		
		input.close();
		
	}

}
