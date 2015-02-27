package bigdogconsultants.co.uk.stormy2.weather;

/**
 * Created by stevehunter on 27/02/15.
 */
public class Day {
    private String mSummary;
    private String mIcon;
    private long mTime;
    private double mTemperatureMax;
    private String mTimezone;


    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public double getTemperatureMax() {
        return mTemperatureMax;
    }

    public void setTemperatureMax(double temperatureMax) {
        mTemperatureMax = temperatureMax;
    }

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }
}
