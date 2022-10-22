package time;
import java.time.*;



public class DueDate {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime deadLine = LocalDateTime.of(2022, 9, 28, 23, 59, 0);
		Duration dueDate = Duration.between(now, deadLine);
		String due = String.format("%d:%02d:%02d", dueDate.toHours(), dueDate.toMinutesPart(), dueDate.toSecondsPart());
	
		System.out.println("Time before deadline is: " + due);
		
	}

}
