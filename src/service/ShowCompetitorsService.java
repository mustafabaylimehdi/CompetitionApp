package service;

import bean.Competitor;
import bean.Config;
import serviceinter.ShowCompetitorsServiceInterface;

public class ShowCompetitorsService implements ShowCompetitorsServiceInterface {
    @Override
    public void process() {
        Competitor[] competitors = Config.instance().getCompetitors();
        for(int i = 0; i < competitors.length; i++){
            System.out.println(competitors[i]);
        }
    }
}
