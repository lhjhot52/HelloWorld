package co.edu;

import java.util.Scanner;

public class Game2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] problem = new int[5];
		for (int i = 0; i < 5; i++) {
			problem[i] = (int) (Math.random() * 5) + 1;

			for (int j = 0; j < i; j++) {
				if (problem[i] == problem[j]) {
					i--;
					break;
				}
			}
		}

		System.out.println("자리에 맞는 숫자를 찾아보세요");
		System.out.println("[*][*][*][*][*]");
		for (int i = 0; i < 5; i++) {

			int select = scn.nextInt();
			if (i == 0) {

				if (select == 1)
					System.out.println("[" + problem[i] + "][*][*][*][*]");
				if (problem[i] > 1 || problem[i] < 1) {
					System.out.println("아닙니다.");
					if (problem[i] == 1) {
						System.out.println("정답입니다.");
					}
				} else if (i == 1) {

					if (select == 2)
						System.out.println("[*][" + problem[i] + "][*][*][*]");
					if (problem[i] > 2 || problem[i] < 2) {
						System.out.println("아닙니다.");
						if (problem[i] == 2) {
							System.out.println("정답입니다.");
						} else if (i == 2) {

							if (select == 3)
								System.out.println("[*][*][" + problem[i] + "][*][*]");
							if (problem[i] > 3 || problem[i] < 3) {
								System.out.println("아닙니다.");
								if (problem[i] == 3) {
									System.out.println("정답입니다.");
								}

							}
						}
					}
				}
			}
		}
	}
}
