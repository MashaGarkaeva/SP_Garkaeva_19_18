package com.company.animals;

public class AnimalThread {
    static class rabbit extends Thread{
        public rabbit(String name){ //метод построения родительского класса
            super (name);   //задаём имя
        }
        @Override
        public void run(){
            int rastoyanie = 45;
            for (int i = 1; i <= rastoyanie;i++){   //i - метры
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                if (i == rastoyanie/2){
                    System.out.println("Кролик устал и присел отдохнуть");
                    try{
                        Thread.sleep(300);//отдыхает 0,3с
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " пробежал: " + i + " метров");
                if (i == 45){
                    System.out.println("Кролик проиграл");
                }
            }
        }
    }
    static class turtle extends Thread{
        public turtle(String name){
            super(name);
        }
        @Override
        public void run(){
            int rastoyanie = 45;
            for (int i = 1; i <= rastoyanie; i++){
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e){
                    System.out.println("Черепаха устала и встала на дороге");
                }
                System.out.println(Thread.currentThread().getName() + " пробежал " + i + " метров");
                if (i == 45){
                    System.out.println("Черепаха выиграла");
                    System.out.println("Кролик ещё далеко");
                }
            }
        }
    }
}
