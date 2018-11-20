package com.kolesnikov.jd1.task2;

public class FibCycl {

    public void fibCycle(int numb) {

        if (!(numb>0)) {
            System.out.println("No nums");
            return;
        }
        System.out.println("0");
        if (numb==1) {
            return;
        }
        else {
            int cash1 = 1;
            int cash3 = 2;
            while (cash1 < numb) {
                int cash2 = 1;
                while (!((cash1+cash2)==cash3)) {
                    cash2+=1;
                }
                System.out.println(cash1);
                cash1=cash2;
                cash3+=cash1;
            }
        }
    }
    //* Вы писали "Вывод на консоль вообще нельзя по хорошему использовать, у тебя есть тесты для проверки, вот там
    //  можешь еще пока что баловаться с консолью, но потом надо уходить от этого"
    //  и я сначала подумал что нужно вывести в лист, но потом сообразил что вывести и отобразить
    // это всё-таки разное и тут требовалось именно это*/
}
