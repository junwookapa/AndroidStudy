package com.example.jun.test1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    public void addition_isCorrect() {
        System.out.println("hello world");
    }

    @Test
    public void text() {
        //MyModule module = new MyModule();


        System.out.println(MyModule.getString("hello"));
    }
}