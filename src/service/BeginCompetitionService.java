package service;

import serviceinter.BeginCompetitionInterface;

import java.util.Scanner;

public class BeginCompetitionService implements BeginCompetitionInterface {
    @Override
    public void process() {
        int result = (int)(Math.random() * 10);
        int finalResult = 0;
        if(result < 1 || result > 5){
            process();
        }else{
            finalResult = result;
            System.out.println(finalResult);
        }

        System.out.println("Sizce reqem nechedir?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(finalResult == num){
            System.out.println("Congratulations you won!");
        }else{
            System.out.println("You failed");
        }
    }
}
