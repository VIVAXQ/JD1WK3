package com.kolesnikov.jd1.task2;

public class FibRec {

    public int fibRecur(int numb) {

        int cash;
        if (numb<2) {
            cash = numb;
        }
        else {
            cash = fibRecur(numb-1)+fibRecur(numb-2);
        }
        return cash;
    }
}
