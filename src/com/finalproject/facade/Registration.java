package com.finalproject.facade;

import com.finalproject.base.GadgetInterfacetest;
import com.finalproject.singleton.SerialNumberGenerator;

public class Registration {
    private GadgetInterfacetest gadget;

    Registration(GadgetInterfacetest gadget, GadgetInterfacetest gadget) {
        this.gadget = gadget;
    }

    public void allocatingGadgetNumber(){
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
        System.out.println("Allocating Gadget Number "+generator.getNextSerial());
    }

}
