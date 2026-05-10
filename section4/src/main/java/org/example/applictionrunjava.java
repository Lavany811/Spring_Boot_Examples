package org.example;

import beans.vehical;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class applictionrunjava {
    static void main() {

        Supplier<vehical> bmwSupplier = new Supplier<vehical>() {
            @Override
            public vehical get() {
                vehical vehicals = new vehical();
                vehicals.setName("BMW M-5");
                return vehicals;
            }
        };
    }
}
