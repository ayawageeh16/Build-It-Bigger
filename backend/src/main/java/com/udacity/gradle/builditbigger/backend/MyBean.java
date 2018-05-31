package com.udacity.gradle.builditbigger.backend;

import com.app.baking.wageeh.jokejavalib.JokeClass;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private JokeClass jokeClass;
    public MyBean(){
        jokeClass = new JokeClass();
    }
    public String getData() {
        return jokeClass.getJoke();
    }
}