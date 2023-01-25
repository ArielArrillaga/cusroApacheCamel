package com.camel.curso_camel;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java8 DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

        // here is a sample which set a raondom body then performs content
        // based routing on the message using method references
        from("timer:simple?period=1000")
        .log("msj").end();

    }

}
