package service;

import bean.Config;
import serviceinter.LogOutServiceInterface;
import util.Menu;
import util.MenuUtil;

public class LogOutService implements LogOutServiceInterface {

    @Override
    public void process() {
        Config.setLoggedIn(false);
        MenuUtil.showMenu();
    }
}
