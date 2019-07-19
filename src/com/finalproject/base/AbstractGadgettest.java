package com.finalproject.base;

import com.finalproject.java.GadgetColor;

public abstract class AbstractGadgettest implements GadgetInterfacetest {

    private WidgetsInterfacetest widget;
    private GadgetColor color;

    protected AbstractGadgettest(WidgetsInterfacetest widget, GadgetColor color){
        this.widget = widget;
        this.color = color;
    }

    protected AbstractGadgettest (WidgetsInterfacetest widget){
        this(widget,GadgetColor.PLAIN);
    }

    @Override
    public WidgetsInterfacetest getTotalItems() {
        return widget;
    }

    /*@Override
    public GadgetColor getColor() {
        return color;
    }*/

    @Override
    public void paint(GadgetColor color) {
        this.color = color;
    }

    @Override
    public float getPrice(){
        return 900.00f;
    }

    @Override
    public void widgetGears() {
        System.out.println("Widget Gears......");
    }

    @Override
    public void widgetSprings() {
        System.out.println("Widget Springs......");
    }

    @Override
    public void widgetLevers() {
        System.out.println("Widget Levers......");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " ("+getTotalItems()+", "+color+", price = $"+getPrice()+")";
    }
} // end class


