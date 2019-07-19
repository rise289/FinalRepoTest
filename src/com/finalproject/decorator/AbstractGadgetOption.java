package com.finalproject.decorator;

import com.finalproject.base.AbstractGadgettest;
import com.finalproject.base.GadgetInterfacetest;
import com.finalproject.base.WidgetsInterfacetest;
import com.finalproject.java.GadgetColor;

public class AbstractGadgetOption extends AbstractGadgettest {
    protected GadgetInterfacetest decoratedGadget; //Constructor

    public AbstractGadgetOption(GadgetInterfacetest gadget){
        super(gadget.getWidget());
        this.decoratedGadget = gadget;
    } //end method

    @Override
    public WidgetsInterfacetest getWidget() {
        return null;
    }

    @Override
    public GadgetColor getColor() {
        return null;
    }

    @Override
    public void paint(GadgetColor color) {

    }
} //end class
