package ejemplo.com.guia14;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private DataBaseOpenHelper mDBOpenHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDBOpenHelper = new DataBaseOpenHelper(this);
        mDBOpenHelper.addUser("Roberto");
        mDBOpenHelper.addUser("Carlos");

        System.out.println("Listando datos de la base de datos");
        for (String name : mDBOpenHelper.getUsers()) {
            System.out.println(name);
        }
    }

    @Override
    protected void onDestroy() {
        mDBOpenHelper.close();
        super.onDestroy();
    }

}
