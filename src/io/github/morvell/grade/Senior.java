package io.github.morvell.grade;

import javax.xml.bind.ValidationException;

public class Senior implements Grade {

    private int slaves = 1;

    public Senior() {
    }

    public Senior(int slaves) {
        if (slaves < 1) try {
            throw new ValidationException("Атата");
        } catch (ValidationException e) {
            e.printStackTrace();
        }
        this.slaves = slaves;
    }

    public void incrementSlaves() {
        slaves += 1;
    }

    public void decrementSlaves() {
        if (slaves == 1) try {
            throw new ValidationException("Атата");
        } catch (ValidationException e) {
            e.printStackTrace();
        }

        slaves -= 1;
    }

    @Override
    public int getSlaves() {
        return slaves;
    }

    @Override
    public double getAdditionalSalaryProfit() {
        return 1.3;
    }


}
