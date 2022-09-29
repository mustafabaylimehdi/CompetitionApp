package service;

import bean.Competitor;
import bean.Config;
import serviceinter.RegisterServiceInterface;
import util.MenuUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class RegisterService implements RegisterServiceInterface {
    @Override
    public void process() {
        System.out.println("Yarışmada neçə şəxs iştirak edəcək?");
        Scanner sc0 = new Scanner(System.in);
        int count = sc0.nextInt();
        int numberComp = 1;

        while(count > 0){
            System.out.println(numberComp + ". Yarismacinin adini daxil edin:");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();

            System.out.println(numberComp + ". Yarismacinin soyadini daxil edin:");
            Scanner sc2 = new Scanner(System.in);
            String surname = sc.nextLine();

            System.out.println(numberComp + ". Yarismacinin yashini daxil edin:");
            Scanner sc3 = new Scanner(System.in);
            int age = sc.nextInt();

            Competitor competitor = new Competitor();
            competitor.setName(name);
            competitor.setSurname(surname);
            competitor.setAge(age);

            Config.instance().appendCompetitor(competitor);
            count--;
            numberComp++;
        }
        System.out.println("Yarışmada iştirak edən şəxslər uğurla qeydiyyatdan keçdi");
        MenuUtil.showMenu();
    }
}
