package vn.edu.poly.bookmanagerr.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import vn.edu.poly.bookmanagerr.R;
import vn.edu.poly.bookmanagerr.base.BaseActivity;

public class ListActivity extends BaseActivity implements View.OnClickListener {


    private TextView tvUser;
    private TextView tvType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tvUser = findViewById(R.id.tvUser);
        tvType = findViewById(R.id.tvType);
        tvUser.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.tvUser) {

        }else if (id == R.id.tvType){

        }

    }
}
