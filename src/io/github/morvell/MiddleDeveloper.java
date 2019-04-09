package io.github.morvell;

import io.github.morvell.grade.Grade;
import io.github.morvell.grade.Middle;
import io.github.morvell.position.DeveloperPosition;
import io.github.morvell.position.Position;

public class MiddleDeveloper implements Employee {

    private Position position;
    private Grade grade;

    public MiddleDeveloper() {
        position = new DeveloperPosition();
        grade = new Middle();
    }

    public MiddleDeveloper(int oklad, int premia) {
        position = new DeveloperPosition(oklad, premia);
        grade = new Middle();
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
        return position.getBaseOklad() + position.getBasePremia() * grade.getAdditionalSalaryProfit();
    }
}
