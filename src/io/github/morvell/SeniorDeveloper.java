package io.github.morvell;

import io.github.morvell.grade.Grade;
import io.github.morvell.grade.Senior;
import io.github.morvell.position.DeveloperPosition;
import io.github.morvell.position.Position;

public class SeniorDeveloper implements Employee {

    private Position position;
    private Grade grade;

    public SeniorDeveloper() {
        position = new DeveloperPosition();
        grade = new Senior();
    }

    public SeniorDeveloper(int oklad, int premia) {
        position = new DeveloperPosition(oklad, premia);
        grade = new Senior();
    }

    public SeniorDeveloper(int slaves) {
        position = new DeveloperPosition();
        grade = new Senior(slaves);
    }

    public SeniorDeveloper(int oklad, int premia, int slaves) {
        position = new DeveloperPosition(oklad, premia);
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
