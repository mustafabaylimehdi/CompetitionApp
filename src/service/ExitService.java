package service;

import serviceinter.ExitServiceInterface;

public class ExitService implements ExitServiceInterface {
    @Override
    public void process() {
        System.exit(0);
    }
}
