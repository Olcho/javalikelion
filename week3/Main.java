package week3;

import week3.role.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.next();
        String major1 = sc.next();
        int gen1 = sc.nextInt();
        String part1 = sc.next();
        String studentId = sc.next();
        
        Role lion = new Lion(name1, major1, gen1, part1, studentId);

        String name2 = sc.next();
        String major2 = sc.next();
        int gen2 = sc.nextInt();
        String part2 = sc.next();
        String position = sc.next();

        Role staff = new Staff(name2, major2, gen2, part2, position);

        printResult(lion);
        printResult(staff);
    }
    static void printResult(Role role) {
        System.out.println(role.getInfo());
        
        boolean result = role.getPolicy().canSubmit();

        System.out.println("Assignment: "+ (result ? "Possible": "Impossible"));
        System.out.println();
    }
}
