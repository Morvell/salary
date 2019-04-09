package io.github.morvell;

import io.github.morvell.grade.Grade;
import io.github.morvell.grade.Senior;
import io.github.morvell.position.ManagerPosition;
import io.github.morvell.position.Position;

public class SeniorManager implements Employee {
    private Position position;
    private Grade grade;

    public SeniorManager() {
        position = new ManagerPosition();
        grade = new Senior();
    }

    public SeniorManager(int oklad, int premia) {
        position = new ManagerPosition(oklad, premia);
        grade = new Senior();
    }

    public SeniorManager(int slaves) {
        position = new ManagerPosition();
        grade = new Senior(slaves);
    }

    public SeniorManager(int oklad, int premia, int slaves) {
        position = new ManagerPosition(oklad, premia);
        grade = new Senior(slaves);
    }

    @Override
    public Grade getGrade() {
        return grade;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public double getSalary() {
        double slavesAdd = 1.05;
        for (int i = 1; i < grade.getSlaves(); i++) {
            slavesAdd += 0.05;
        }

        return (position.getBaseOklad() + position.getBasePremia()*grade.getAdditionalSalaryProfit())*slavesAdd;
    }
}
