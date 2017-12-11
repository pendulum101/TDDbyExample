package main.java;

import java.util.Hashtable;

public class Bank {

    private Hashtable rates = new Hashtable();

    public Money reduce(Expression source, String to){
        return source.reduce(this, to);
    }

    public int rate(String from , String to){
        if (from.equals(to)){
            return 1;
        }
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate;
    }

    public void addRate(String from , String to ,Integer rate){
        rates.put(new Pair(from, to), new Integer(rate));
    }


}
