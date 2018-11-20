package com.kolesnikov.jd1.task1;

public class SumOfNum {

    public int sumFunc(int sumNum) {

        int sum = 0;
        for (int i = 0; i < Integer.toString(sumNum).length(); i++) {
            sum +=  Character.getNumericValue(Integer.toString(sumNum).charAt(i));
            /** Не знал пихать тустриг в переменную и потом её использовать или это перегружает код, поэтому
             *  сделал так */
        }
        return sum;
    }
}
