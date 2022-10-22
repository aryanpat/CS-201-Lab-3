package time;
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.time.LocalTime;

public class ClockConversion {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Time in 24-Hour Format (Hour:Minute:Second): ");
		String time = input.next();
		
		SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
		
		LocalTime hour = LocalTime.parse(time);
		
		Calendar conversion = Calendar.getInstance();
		conversion.set(Calendar.HOUR_OF_DAY, hour.getHour());
		conversion.set(Calendar.MINUTE, hour.getMinute());
		conversion.set(Calendar.SECOND, hour.getSecond());
		
		System.out.println("The time in 12-hour clock is: "+ format.format(conversion.getTime()));
		
		input.close();

	}

}
