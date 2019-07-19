package com.finalproject.decorator;

import com.finalproject.base.GadgetInterfacetest;

public class GoldEditionOption extends AbstractGadgetOption {

    public GoldEditionOption(GadgetInterfacetest gadget){ super(gadget);} //Constructor

    @Override
    public float getPrice() {
        return decoratedGadget.getPrice() + 300.00F;
    } //end method

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " ("+ getWidget()+ ", Gold Price = $" + getPrice()+ ")";
    } //end method
} //end class