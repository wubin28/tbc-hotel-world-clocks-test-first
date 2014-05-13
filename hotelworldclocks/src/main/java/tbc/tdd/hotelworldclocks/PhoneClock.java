package tbc.tdd.hotelworldclocks;

/**
 * Created by benwu on 14-5-13.
 */
public class PhoneClock {
    public PhoneClock(int utcOffset) {

    }

    public void setCityClock(CityClock cityClock) {

    }

    public void setTime(int time) {
        this.cityClock.setUtcZeroTime(time - this.utcOffset);
    }
}
