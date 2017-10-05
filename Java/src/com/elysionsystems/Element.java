package com.elysionsystems;

public class Element {

    private int value;
    private Element next;

    public Element(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public Element getNext(){
        return next;
    }
    public void setNext(Element next){
        this.next = next;
    }

    @Override
    public String toString(){
        String s = String.valueOf(this.value);
        if(next != null){
            s += ", " + next.toString();
        }
        return s;
    }
}
