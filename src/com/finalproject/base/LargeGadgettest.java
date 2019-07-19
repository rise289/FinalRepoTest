package com.finalproject.base;

import com.finalproject.java.GadgetColor;

    public class LargeGadgettest extends AbstractGadgettest {

        public LargeGadgettest(WidgetsInterfacetest widget, GadgetColor color){
            super(widget,color);
        } //end method

        public LargeGadgettest(WidgetsInterfacetest widget){
            this(widget, GadgetColor.PLATED);
        } //end method

        @Override
        public float getPrice(){
            return 570.02f;
        }

        @Override
        public WidgetsInterfacetest getWidget() {
            return null;
        }

        @Override
        public void paint(GadgetColor color) {

        }
    }

}
