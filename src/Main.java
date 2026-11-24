import java.util.*;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        double percentage = sc.nextDouble();
        int backlogs = sc.nextInt();
        int graduationYear = sc.nextInt();

        System.out.println("Canditate: " + name);
        System.out.println("Percentage: " + percentage);
        System.out.println("Backlog: " + backlogs);
        System.out.println("Graduation Year: " + graduationYear);

        sc.close();
    }
}
