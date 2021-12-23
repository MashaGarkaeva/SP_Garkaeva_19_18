package com.company.EggAndChiken;

public class runEggOrChiken {
    static class whyWin extends Thread{
        public whyWin(String name){ //метод построения родительского класса
            super (name);   //задаём имя
        }
        @Override
        public void run(){
            int rastoyanie = 6;
            for (int i = 1; i <= rastoyanie;i++){   //i - метры
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
