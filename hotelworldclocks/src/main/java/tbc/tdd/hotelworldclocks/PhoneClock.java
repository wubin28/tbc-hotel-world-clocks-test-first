package tbc.tdd.hotelworldclocks;

/**
 * Created by benwu on 14-5-13.
 */
public class PhoneClock {
    private CityClock cityClock;
    private int utcOffset;
    private HotelWorldClockSystem hotelWorldClockSystem;

    public PhoneClock(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public void setCityClock(CityClock cityClock) {
        this.cityClock = cityClock;
    }

    public void setTime(int time) {
        for (CityClock cityClock : this.hotelWorldClockSystem.getClocks()) {
            cityClock.setUtcZeroTime(time - this.utcOffset);
        }
    }

    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem) {
        this.hotelWorldClockSystem = hotelWorldClockSystem;
    }
}
