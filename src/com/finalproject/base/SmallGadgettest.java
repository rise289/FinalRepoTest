package com.finalproject.base;

import com.finalproject.java.GadgetColor;

public class SmallGadgettest extends AbstractGadgettest {

    public SmallGadgettest(WidgetsInterfacetest widget, GadgetColor color){
        super(widget,color);
    } //end method

    public SmallGadgettest(WidgetsInterfacetest widget){
        this(widget, GadgetColor.PLAIN);
    } //end method

    @Override
    public float getPrice(){
        return 570.00f;
    }

    @Override
    public WidgetsInterfacetest getWidget() {
        return null;
    }

    @Override
    public void paint(GadgetColor color) {

    }
}


