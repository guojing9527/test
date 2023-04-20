package com.hainiu.oop3;

public class Test {
    public static void main(String[] args) {
        PingPongCoach ppc = new PingPongCoach("李白",18) ;
        System.out.println(ppc.getName());
        System.out.println(ppc.getAge());
        ppc.sayEnglish();
        ppc.train();
        System.out.println("--------");
        PingPongPlayer ppp = new PingPongPlayer("韩信",17,1);
        System.out.println(ppp.getName());
        System.out.println(ppp.getAge());
        System.out.println(ppp.getLevel());
        ppp.sayEnglish();
        ppp.train();
        useCoach(new BasketballCoach());
    }
    public static void useCoach (Coach coach){
         coach.train();
    }
}
