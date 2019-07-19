package com.finalproject.singleton;

/*A Singleton Pattern ensures that a class only have one object
be created to provide a single point of access.
 */
public class SerialNumberGeneratorSm {
    private static SerialNumberGeneratorSm instance;
    private int count = 1245;

    public synchronized static SerialNumberGeneratorSm getInstance() {
        if(instance == null) {
            instance = new SerialNumberGeneratorSm();
        } // end if statement
        return instance;
    } //end method


    public class SerialNumberGeneratorMed {
        private static SerialNumberGeneratorSm instance;
        private int count = 2356;

        public synchronized static SerialNumberGeneratorSm getInstance() {
            if (instance == null) {
                instance = new SerialNumberGeneratorSm();
            } // end if statement
            return instance;
        } //end method

    }
        public class SerialNumberGeneratorLg {
            private static SerialNumberGeneratorLg instance;
            private int count = 1245;

            public synchronized static SerialNumberGeneratorLg getInstance() {
                if(instance == null) {
                    instance = new SerialNumberGeneratorLg();
                } // end if statement
                return instance;
            } //end method


            private SerialNumberGeneratorSm() {}
            public synchronized int getNextSerial() {return ++ count;}

            private SerialNumberGeneratorMed() {}
            public synchronized int getNextSerial() {
                return ++count;}

            private SerialNumberGeneratorLg() {}
            public synchronized int getNextSerial() {return ++ count;}


} //end class

