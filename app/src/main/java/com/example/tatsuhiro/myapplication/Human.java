package com.example.tatsuhiro.myapplication;

import android.util.Log;

/**
 * Created by Tatsuhiro on 2017/09/23.
 */

class Human extends Animal implements Thinkable {

    static String hobby = "夢";

    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    Human(String hobby){
        this.name = hobby;
    }

    @Override
    public void say() {
        Log.d("javatest" + "私の名前は", name + "です。");
        Log.d("javatest" + "年は", age + "歳です。");

    }

    @Override
    public void think(){
        Log.d("javatest" + "私は", hobby + "について考える。");
    }
}
