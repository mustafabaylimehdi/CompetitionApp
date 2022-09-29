package service;

import bean.Config;
import serviceinter.LoginServiceInterface;
import util.Menu;
import util.MenuUtil;

import java.util.Scanner;

public class LoginService implements LoginServiceInterface {
    int counter = 0;
    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Username:");
        String username = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Password:");
        String password = sc.nextLine();

        if(username.equals("Sarkhan") && password.equals("12345")){
            Config.setLoggedIn(true);
            System.out.println("Successfully login");
            MenuUtil.showMenu();
        }else{
            counter++;
            if(counter == 3){
                System.out.println("You banned");
                System.exit(0);
            }
            System.out.println("username or password is invalid. Try again");
            process();
        }
    }
}
