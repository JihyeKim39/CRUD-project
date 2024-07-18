package com.global.yp.board;

import java.util.Scanner;

public class Menu {
	public void show() {

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("BOARD MENU");
			System.out.println("1.LIST");
			System.out.println("2.WRITE");
			System.out.println("Q.EXIT");
			System.out.println(":choose menu");
			String menu = scan.next();
			if ("Q".equals(menu)) {
				break;
			}
			if ("1".equals(menu)) {
				System.out.println();
				System.out.println("[BOARD LIST]");
				try {
					new BoardList().list();
					while (true) {
						System.out.println();
						System.out.println("[LIST MENU]");
						System.out.println("1.READ");
						System.out.println("Q.EXIT");
						System.out.println(":choose menu");
						menu = scan.next();
						if ("Q".equals(menu)) {
							break;
						}
						if ("1".equals(menu)) {
							System.out.println();
							System.out.println(":input sequence");
							String seq = scan.next();
							new BoardList().read(seq);
							while (true) {
								System.out.println();
								System.out.println("[READ MENU]");
								System.out.println("1.UPDATE");
								System.out.println("2.DELETE");
								System.out.println("Q.EXIT");
								System.out.println(":choose menu");
								menu = scan.next();
								if ("Q".equals(menu)) {
									new BoardUpdate().update(seq);
									System.out.println();
									new BoardList().read(seq);
								}
								if("2".equals(menu)) {
									System.out.println();
									System.out.println("delete y/n");
									String yn=scan.next();
									if("y".equals(yn)) {
										new BoardDelete().delete(seq);
										System.out.println();
										new BoardList().list();
										break;
									}
								}
							}
						}

					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Program is error.");
				}

			}
			if ("2".equals(menu)) {
				try {
					new BoardWrite().write();
				} catch (Exception e) {
					System.out.println();
					System.out.println("Programming is error.");
				}
			}
		}
		System.out.println();
		System.out.println("program is shut down");
	}
}
