package com.company;

public class Appartment <T, I extends Number> implements Printable<T,I> {
    I number1;
    I number2;

    public Appartment(I number1, I number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public I getNumber1() {
        return number1;
    }

    public I getNumber2() {
        return number2;
    }

    @Override
    public T print() {
        System.out.println(number1 +","+ number2);
        return (T) number1;
    }


    @Override
    public I print2() {
        System.out.println(number1+","+number2);
        return number2;
    }
}


