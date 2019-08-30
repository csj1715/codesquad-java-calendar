package honux.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;

		while (true) {
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			month = sc.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue; // 루프의 처음으로 돌아가라
			}
			cal.printCalendar(2017, month);
		}
		System.out.println("Bye~~");

		sc.close();
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
