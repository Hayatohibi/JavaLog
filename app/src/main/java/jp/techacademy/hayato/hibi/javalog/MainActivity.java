package jp.techacademy.hayato.hibi.javalog;

import android.support.v7.app.AppCompatActivity; //andropid.support.v7.appパッケージのAppCompatActivityクラスを使用
import android.os.Bundle; //android.osパッケージのBudleクラスを使用
import android.util.Log; //android.utilパッケージのLogクラスを使用

public class MainActivity extends AppCompatActivity { //extendsであるクラスを元に新しいクラスをて定義

    @Override //親クラスの関数を上書きして置き換えること！！重要！！！
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //親クラスのその関数を呼び出す方法
        setContentView(R.layout.activity_main); //setContentviewで画面がどのような画面構成になるか指定している

        Human human = new Human("勇斗", 19, "バスケットボール");

        human.say();
        human.think();


    }
}
