package com.company;

public class Main {
    public static void main(String args[]){
        RT rabbit = new RT ("Кролик", 1);
        RT turtle = new RT ("Черепаха", 10);
        rabbit.start();
        turtle.start();
    }
}

  class RT extends Thread {

    int priority;
    String name;

    public RT(String name,int priority) {
        this.name = name;
        this.priority = priority;
    }

    public void run() {
        for(int i = 0; i <= 1000; i+=100){
            RT.currentThread().setPriority(priority);
            System.out.println(name + " " + i + " метров");
        }
    }
  }


