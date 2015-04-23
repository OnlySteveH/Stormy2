package bigdogconsultants.co.uk.stormy2.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import bigdogconsultants.co.uk.stormy2.R;
import bigdogconsultants.co.uk.stormy2.weather.Day;

/**
 * Created by stevehunter on 28/02/15.
 */
public class DayAdapter extends BaseAdapter {

    private Context mContext;
    private Day[] mDays;

    public DayAdapter(Context context, Day[] days){
        mContext = context;
        mDays = days;
    }

    @Override
    public int getCount() {
        return mDays.length;
    }

    @Override
    public Object getItem(int position) {
        return mDays[position];
    }

    @Override
    public long getItemId(int position) {
        return 0; // not used

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null){
            // new
            convertView = LayoutInflater.from(mContext).inflate(R.layout.daily_list_item, null);
            holder = new ViewHolder();
            holder.iconImageView = (ImageView) convertView.findViewById(R.id.iconImageView);
            holder.temperatureLabel = (TextView) convertView.findViewById(R.id.temperatureLabel);
            //holder.dayLabel = (TextView) convertView.findViewById(R.id.dayNameLabel);
            if (position == 0) {
            /**    TextView textView = (TextView) convertView.findViewById(R.id.todayNameLabel);
                textView.setVisibility(View.VISIBLE);
                holder.dayLabel = textView; **/
                TextView textView = (TextView) convertView.findViewById(R.id.dayNameLabel);
                textView.setText("Today");
                holder.dayLabel = textView;

            } else {
                //TextView textView = (TextView) convertView.findViewById(R.id.todayNameLabel);
                //textView.setVisibility(View.INVISIBLE);
                holder.dayLabel = (TextView) convertView.findViewById(R.id.dayNameLabel);
            }

            Log.e("TAG", "Label: " + holder.dayLabel.getText() + " and position: " + position);

            convertView.setTag(holder);

        } else {
            // already set up
            holder = (ViewHolder) convertView.getTag();
        }

        Day day = mDays[position];
        holder.iconImageView.setImageResource(day.getIconId());
        holder.temperatureLabel.setText(day.getTemperatureMax() + "");
        holder.dayLabel.setText(day.getDayOfTheWeek());

        return convertView;
    }

    private static class ViewHolder {
        ImageView iconImageView;
        TextView temperatureLabel;
        TextView dayLabel;
    }
}
