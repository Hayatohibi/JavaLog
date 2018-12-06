package jp.techacademy.hayato.hibi.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable {

    static String hobby;

    public Human(String name, int age,String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。");
    }
    @Override
    public void think(){
        Log.d("javatest", "私は" + this.hobby + "について考える");
    }
}
