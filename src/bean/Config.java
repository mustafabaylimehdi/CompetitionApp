package bean;

import java.util.ArrayList;

public class Config {
    private static Config config = null;

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    private Competitor[] competitors = new Competitor[0];
    private static boolean loggedIn;

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void setCompetitors(Competitor[] competitors) {
        this.competitors = competitors;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }

    public static Config instance(){
        if(config == null){
            return new Config();
        }
        return config;
    }

    public void appendCompetitor(Competitor c){
        Competitor[] newStudents = new Competitor[competitors.length + 1];

        for (int i = 0; i < competitors.length; i++) {
            newStudents[i] = competitors[i];
        }

        newStudents[newStudents.length - 1] = c;
        competitors = newStudents;
    }
}
