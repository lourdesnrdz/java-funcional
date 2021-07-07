package com.platzi.functional._10_chaining;

public class ChainingDos {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Hola")
                .append(" alumno")
                .append(" de")
                .append(" platzi");

        Chainer chainer = new Chainer();
        chainer.sayHi()
                .sayBye();

        Chainer chainer2 = chainer.sayHi();
        Chainer chainer3 = chainer2.sayBye();

    }

    static class Chainer {
        public Chainer sayHi(){
            System.out.println("Hola");
            return this;
        }

        public Chainer sayBye(){
            System.out.println("Adios");
            return this;
        }
    }

}
