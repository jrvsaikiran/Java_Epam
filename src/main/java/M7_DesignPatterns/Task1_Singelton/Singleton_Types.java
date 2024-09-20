package M7_DesignPatterns.Task1_Singelton;/*


1. Eager initialization

    public class EagerInitializedSingleton {

        private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

        // private constructor to avoid client applications using the constructor
        private EagerInitializedSingleton(){}

        public static EagerInitializedSingleton getInstance() {
            return instance;
        }
    }


2. Static block initialization
package com.journaldev.singleton;

    public class StaticBlockSingleton {

        private static StaticBlockSingleton instance;

        private StaticBlockSingleton(){}

        // static block initialization for exception handling
        static {
            try {
                instance = new StaticBlockSingleton();
            } catch (Exception e) {
                throw new RuntimeException("Exception occurred in creating singleton instance");
            }
        }

        public static StaticBlockSingleton getInstance() {
            return instance;
        }
    }


3. Lazy Initialization
package com.journaldev.singleton;

    public class LazyInitializedSingleton {

        private static LazyInitializedSingleton instance;

        private LazyInitializedSingleton(){}

        public static LazyInitializedSingleton getInstance() {
            if (instance == null) {
                instance = new LazyInitializedSingleton();
            }
            return instance;
        }
    }



4. Thread Safe Singleton
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }


5. Bill Pugh Singleton Implementationpackage com.journaldev.singleton;

    public class BillPughSingleton {

        private BillPughSingleton(){}

        private static class SingletonHelper {
            private static final BillPughSingleton INSTANCE = new BillPughSingleton();
        }

        public static BillPughSingleton getInstance() {
            return SingletonHelper.INSTANCE;
        }
    }
}
*/
