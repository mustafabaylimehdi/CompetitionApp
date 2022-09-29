package util;

import bean.Config;
import service.*;
import serviceinter.MainService;

public enum Menu {
    LOGIN(1, "LOGIN", new LoginService()),
    REGISTER(2, "REGISTER", new RegisterService()),
    BEGIN_COMPETITION(3, "BEGIN_COMPETITION", new BeginCompetitionService()),
    SHOW_ALL_COMPETITOR(4, "SHOW COMPETITORS", new ShowCompetitorsService()),
    LOGOUT(5, "LOGOUT", new LogOutService()),
    EXIT(6, "EXIT", new ExitService());

    private int number;
    private String label;
    private MainService service;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public MainService getService() {
        return service;
    }

    public void setService(MainService service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return number + ". " + label;
    }

    Menu(){

    }

    Menu(int number, String label, MainService service){
        this.number = number;
        this.label = label;
        this.service = service;
    }

    public static Menu find(int number){
        Menu[] menus = Menu.values();
        for(int i = 0; i < menus.length; i++){
            if(menus[i].getNumber() == number){
                return menus[i];
            }
        }
        return null;
    }

    public static void showAllMenu(){
        Menu[] menus = Menu.values();
        for(int i = 0; i < menus.length; i++){
            if(menus[i] == LOGIN){
                if(!Config.isLoggedIn()){
                    System.out.println(menus[i]);
                }
            }else if(Config.isLoggedIn()){
                System.out.println(menus[i]);
            }
        }
    }

    public void process(){
        service.process();
    }
}
