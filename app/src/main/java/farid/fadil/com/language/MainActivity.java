package farid.fadil.com.language;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_morning)
    TextView tvMorning;
    @BindView(R.id.tv_hello)
    TextView tvHello;
    @BindView(R.id.tv_plural)
    TextView tvPlural;
    @BindView(R.id.tv_xliff)
    TextView tvXliff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        int pokeCount =3;
        String hello = getResources().getString(R.string.hello_world);
        tvHello.setText(hello);

        int songCount =5;
        String pluralText = getResources().getQuantityString(R.plurals.numberOfSongsAvailable,songCount,songCount);
        tvPlural.setText(pluralText);
        tvXliff.setText(getResources().getString(R.string.app_homeurl));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_change_settings){
            Intent mIntent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(mIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}
