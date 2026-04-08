import java.util.Scanner; //스캐너가져오기

public class week1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        //멤버 수 입력
        while (true) {
            System.out.println("저장할 멤버 수를 5 이상 입력 : ");
            count = scanner.nextInt();
            scanner.nextLine();

            if (count >= 5) {
                break;
            } else {
                System.out.println("[오류] 5 이상 입력해주세요.");
            }
        }

        //멤버이름 입력
        String[] babyLions = new String[count];
        System.out.println("멤버 이름을 입력 : ");
        
        for (int i = 0; i < count; i++) {
            babyLions[i] = scanner.nextLine();
        }

        //print
        System.out.println("\n 명단을 출력.");
        for (int i = 0; i < babyLions.length; i++) {
            System.out.println((i + 1) + ". " + babyLions[i]);
        }
        scanner.close();
    }
}