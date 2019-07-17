package com.finalproject.base;

import com.finalproject.java.GadgetColor;

public abstract class AbstractGadgettest implements GadgetInterfacetest {

    private WidgetsInterfacetest widget;
    private GadgetColor color;

    protected AbstractGadgettest(WidgetsInterfacetest GadgetColor color){
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

    @Override
    public GadgetColor getColor() {
        return color;
    }

    @Override
    public void paint(GadgetColor color) {
        this.color = color;
    }

    @Override
    public float getPrice(){
        return 900.00f;
    }

    @Override
    public void cleanFrame() {
        System.out.println("Cleaning Frame......");
    }

    @Override
    public void airTires() {
        System.out.println("Airing up Tires......");
    }

    @Override
    public void testRide() {
        System.out.println("Taking bike out for a test ride......");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " ("+totalitems+", "+color+", price = $"+getPrice()+")";
    }
} // end class


