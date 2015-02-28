package bigdogconsultants.co.uk.stormy2.weather;

/**
 * Created by stevehunter on 27/02/15.
 */
public class Hour {

    private String mSummary;
    private String mIcon;
    private long mTime;
    private double mTemperature;

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

    public int getTemperature() {
        return (int) Math.round((mTemperature - 32) * (5 / 9));
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }
}
