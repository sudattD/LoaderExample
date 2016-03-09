package sudatt.flyrobe.loaderexample.base;

import android.app.LoaderManager;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import sudatt.flyrobe.loaderexample.R;

/**
 * Created by davesuda on 3/9/2016.
 */
public abstract class BaseActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor>{

    protected ViewGroup mContentContainer;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_base);


        Log.d(BaseActivity.class.getSimpleName(), "BaseActivity on Create()");
        System.out.println("WARDROBE");

    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);


        try
        {
            mContentContainer = (ViewGroup) findViewById(R.id.content_frame_layoutg);
            if (getLayoutId() != 0 && getLayoutId() != -1) {
                View layoutView = LayoutInflater.from(this).inflate(getLayoutId(), null);
                Log.d("SUDATT",mContentContainer+"");
                mContentContainer.addView(layoutView);
            } else {
                if (getLayoutId() == -1) {
                    mContentContainer.setVisibility(View.GONE);
                }
            }
        }
        catch (NullPointerException ne )
        {
            ne.printStackTrace();
        }



     /*   if (getLayoutId() != 0 && getLayoutId() != -1) {
            View layoutView = LayoutInflater.from(this).inflate(getLayoutId(), null);
            Log.d("SUDATT",layoutView+"");
            mContentContainer.addView(layoutView);
        } else {
            if (getLayoutId() == -1) {
                mContentContainer.setVisibility(View.GONE);
            }
        }
*/
        initViews();
    }






    protected abstract void initViews();

    protected abstract void initData();

    protected abstract int getLayoutId();


    @Override
    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }
}
