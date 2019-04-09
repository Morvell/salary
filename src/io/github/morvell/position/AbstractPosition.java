package io.github.morvell.position;

import io.github.morvell.position.Position;

import javax.xml.bind.ValidationException;

public class AbstractPosition implements Position {

    private float baseOklad;

    private float basePremia;

    @Override
    public float getBaseOklad() {
        return baseOklad;
    }

    @Override
    public float getBasePremia() {
        return basePremia;
    }

    public void setBaseOklad(float baseOklad) {
        if (baseOklad < 0) try {
            throw new ValidationException("Нельзя  так");
        } catch (ValidationException e) {
            e.printStackTrace();
        }
        this.baseOklad = baseOklad;
    }

    public void setBasePremia(float basePremia) {
        if (basePremia < 0) try {
            throw new ValidationException("Нельзя  так");
        } catch (ValidationException e) {
            e.printStackTrace();
        }
        this.basePremia = basePremia;
    }

    public AbstractPosition() {
    }

    public AbstractPosition(float baseOklad, float basePremia) {
        this.baseOklad = baseOklad;
        this.basePremia = basePremia;
    }
}
