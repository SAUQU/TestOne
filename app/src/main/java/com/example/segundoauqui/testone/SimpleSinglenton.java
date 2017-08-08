package com.example.segundoauqui.testone;

/**
 * Created by segundoauqui on 8/8/17.
 */

public class SimpleSinglenton {


        private static SimpleSinglenton instance = null;
        protected SimpleSinglenton() {
        }
        public static  SimpleSinglenton getInstance() {
            if(instance == null) {
                instance = new SimpleSinglenton();
            }
            return instance;
        }
    }
