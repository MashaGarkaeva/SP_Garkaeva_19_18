package com.company.EggAndChiken;

import com.company.EggAndChiken.runEggOrChiken.*;

public class EggOrChiken {
    public static void main(String [] args) throws InterruptedException {
        whyWin egg = new whyWin("Яйцо");
        whyWin chiken = new whyWin("Курица");

        egg.start();
        chiken.start();

        String win;

        while(true){
            if (egg.isAlive() && chiken.isAlive()){
                win = "Яйцо";
                break;
            }
            else{
                win = "Курица";
                break;
            }
        }
        egg.join();//приостанавливает работу потока
        chiken.join();
        System.out.println(win);
    }
}
