package util;

import java.util.Scanner;

public class MenuUtil {
    public static void showMenu(){
        System.out.println("Menu secin:");
        Menu.showAllMenu();

        Scanner sc = new Scanner(System.in);
        int selectedMenu = sc.nextInt();
        Menu menu = Menu.find(selectedMenu);
        menu.process();
    }
}
