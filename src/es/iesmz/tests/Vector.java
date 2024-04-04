package es.iesmz.tests;

public class Vector {

    public static int [] reverso(int [] v){
        int[] reversedArray = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            reversedArray[i] = v[v.length - i - 1];
        }
        return reversedArray;
    }
}
