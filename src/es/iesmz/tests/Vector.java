package es.iesmz.tests;

import java.util.Arrays;
import java.util.Collections;

public class Vector {

    public static int [] reverso(int [] v){
        Collections.reverse(Arrays.asList(v));
        return v;
    }
}
