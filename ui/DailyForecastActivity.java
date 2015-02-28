package bigdogconsultants.co.uk.stormy2.ui;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import bigdogconsultants.co.uk.stormy2.R;

public class DailyForecastActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);
        String[] daysOfTheWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, daysOfTheWeek);
        setListAdapter(adapter);
        //adding a change to push to Github

    }

}
