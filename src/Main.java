import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String[] args) {
        Season season;
                Scanner scan = new Scanner(System.in);
        switch (scan.nextLine().toLowerCase()) {
            case "december", "january", "february" -> {
                season = Season.WINTER;
                System.out.println(season);
            }
            case "march", "april", "may" -> {
                season = Season.SPRING;
                System.out.println(season);
            }
            case "june", "july", "august" -> {
                season = Season.SUMMER;
                System.out.println(season);
            }
            case "september", "october", "november" -> {
                season = Season.AUTUMN;
                System.out.println(season);
            }
            default -> System.out.println("No this month");
        }
    }
}