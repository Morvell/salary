package io.github.morvell.grade;

public class Junior implements Grade {

    @Override
    public int getSlaves() {
        return 0;
    }

    @Override
    public double getAdditionalSalaryProfit() {
        return 1.10;
    }
}
