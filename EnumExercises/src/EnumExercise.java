import java.util.Scanner;

public class EnumExercise {
    enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}

class DayOfWeekTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;

        EnumExercise.DayOfWeek aDay = EnumExercise.DayOfWeek.FRIDAY;

        System.out.println("Your horse day is Friday, write that - ");
        userInput = sc.nextLine();

        System.out.println("And your horse day is - " + aDay);
    }
}
