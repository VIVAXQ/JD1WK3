package com.kolesnikov.jd1.task3;

public class WeathService {

    public StatWeath doTask(int days, int[] daysPre) {

        StatWeath statWeath = new StatWeath();

        statWeath.setMaxPrec(0);
        statWeath.setQuanAllPrec(0);
        for (int i=0;i<days;i++) {
            int temp = daysPre[i];
            if (temp>statWeath.getMaxPrec()) statWeath.setMaxPrec(temp);
            statWeath.setQuanAllPrec(statWeath.getQuanAllPrec()+temp);
        }
        statWeath.setQuanDays(days);
        statWeath.setAvgPrec(statWeath.getQuanAllPrec()/statWeath.getQuanDays());

        return statWeath;
    }
}
