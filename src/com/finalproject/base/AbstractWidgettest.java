package com.finalproject.base;


public abstract class AbstractWidgettest implements WidgetsInterfacetest {

    private int totalitems;
    private boolean large;
    private Spokes spokes;
    private Bearings bearings;


    public AbstractWheel(int size, boolean wide) {
        this.totalitems = totalitems;
        this.large = large;
        spokes = new Spokes();
        bearings = new Bearings();
    }

    @Override
    public int getTotalitems() {
        return totalitems;
    }

    @Override
    public boolean isTotalItems() {
        return totalitems;
    }

    @Override
    public void acceptVisitor(WheelVisitorInterface visitor) {
        spokes.acceptVisitor(visitor);
        bearings.acceptVisitor(visitor);
        visitor.visit(this);

    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + " at " +totalitems+" inches";
    }
}


