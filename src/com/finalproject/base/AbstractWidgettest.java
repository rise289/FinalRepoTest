package com.finalproject.base;


public abstract class AbstractWidgettest implements WidgetsInterfacetest {

    private int totalitems;
    private boolean large;
    private Gears gears;
    private Springs springs;
    private Levers levers;


    public AbstractWidgettest(int totalitems, boolean large) {
        this.totalitems = totalitems;
        this.large = large;
        gears = new Gears();
        springs = new Springs();
        levers = new Levers();
    }

    @Override
    public int getTotalItems() {
        return totalitems;
    }

    @Override
    public boolean isTotalItems() {
        return totalitems;
    }

    @Override
    public void acceptVisitor(WidgetsInterfacetest visitor) {
        gears.acceptVisitor(visitor);
        springs.acceptVisitor(visitor);
        levers.acceptVisitor(visitor);
        visitor.visit(this);

    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + " at " +totalitems+" inches";
    }
}


