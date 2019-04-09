package io.github.morvell;

import io.github.morvell.grade.Grade;
import io.github.morvell.position.InternPosition;
import io.github.morvell.position.Position;

public class Intern implements Employee {

    private Position position;
    private final Grade grade = null;

    Intern() {
        position = new InternPosition();
    }

    Intern(int oklad, int premia) {
        position = new InternPosition(oklad, premia);
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public double getSalary() {
        return position.getBaseOklad() + position.getBasePremia();
    }

    @Override
    public Grade getGrade() {
        return null;
    }
}
