package sudatt.flyrobe.loaderexample.ui;

import android.content.Loader;
import android.database.Cursor;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import sudatt.flyrobe.loaderexample.R;
import sudatt.flyrobe.loaderexample.base.BaseActivity;

public class Wardrobe extends BaseActivity {


    LinearLayout ll;

    @Override
    protected void initViews() {

        ll = (LinearLayout)findViewById(R.id.ll);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_wardrobe;
    }

  /*  @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_wardrobe);

        Log.d(Wardrobe.class.getSimpleName(),"WArdrobe on Create()");
        System.out.println("WARDROBE");
    }*/
}
