package com.edu.DesignPattern.Structural.Bridge;

import com.edu.DesignPattern.Structural.Composite.Foo;

/**
 * Created by gustavokm90 on 11/27/14.
 */
public class Boo extends Foo {

    protected int foo;

    public static void main(String[] args){
        Boo boo = new Boo();
        boo.booCarla();
    }

    public void booCarla(){
        System.out.println("public method of Boo"+ a);
        fooCarla();

        Foo foo = new Foo();
        foo.fooCarla();
        System.out.println(foo.a);
    }
}
