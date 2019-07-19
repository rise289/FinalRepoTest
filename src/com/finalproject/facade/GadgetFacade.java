package com.finalproject.facade;

import com.finalproject.base.GadgetInterfacetest;

public class GadgetFacade {

    public void prepareForSale(GadgetInterfacetest gadget) {
        Registration reg = new Registration(gadget);
        reg.allocatingGadgetNumber();
        Documentation.printBrochure();
        gadget.gears();
        gadget.springs();
        gadget.levers();
    }
}