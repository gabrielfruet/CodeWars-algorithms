package Main;

import Katas.Josephus;

import java.util.ArrayList;

public class MainJosephus {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i = 0; i < 20; i++){
            lista.add(i);
        }
        System.out.println(Josephus.josephusPermutation(lista, 7));
    }

}
