package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {

    public static void main(String[] args) {
        List<String> cursos = NombresUtils.getList("Java", "Functional");

        cursos.forEach(System.out::println);

        BiFunction<Integer, Integer, Integer> s = (x, y) -> x * y;

        usarZero(() -> 2);

        usarPredicado(text -> text.isEmpty());

        usarBiFunction((x, y) -> x * y);

        usarBiFunction((x, y) -> {
            System.out.println("X: " + x + " Y: " + y);
            return x - y;
        });

        usarNada(() -> {
            System.out.println("Hola");
        });

        usarBiFunction((Integer x, Integer y) -> x * y);

    }

    static void usarZero(ZeroArguments zeroArguments){

    }

    static void usarPredicado(Predicate<String> predicado){

    }

    static void usarBiFunction(BiFunction<Integer, Integer, Integer> operacion){

    }

    static void usarNada(OperarNada operarNada){

    }

    @FunctionalInterface
    interface ZeroArguments {
        int get();
    }

    @FunctionalInterface
    interface OperarNada {
        void nada();
    }

}