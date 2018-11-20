package com.kolesnikov.jd1.task3;

public class StatWeath {

    private int quanDays;
    private int quanAllPrec;
    private double avgPrec;
    private int maxPrec;

    public int getQuanDays() {
        return quanDays;
    }

    public void setQuanDays(int quanDays) {
        this.quanDays = quanDays;
    }

    public int getQuanAllPrec() {
        return quanAllPrec;
    }

    public void setQuanAllPrec(int quanAllPrec) {
        this.quanAllPrec = quanAllPrec;
    }

    public double getAvgPrec() {
        return avgPrec;
    }

    public void setAvgPrec(double avgPrec) {
        this.avgPrec = avgPrec;
    }

    public int getMaxPrec() {
        return maxPrec;
    }

    public void setMaxPrec(int maxPrec) {
        this.maxPrec = maxPrec;
    }

    public StatWeath() {

    }

    public StatWeath(int quanDays, int quanAllPrec, double avgPrec, int maxPrec) {
        this.quanDays=quanDays;
        this.quanAllPrec=quanAllPrec;
        this.avgPrec=avgPrec;
        this.maxPrec=maxPrec;
    }
}
