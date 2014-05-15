package tbc.tdd.hotelworldclocks;

/**
 * Created by benwu on 14-5-13.
 */
public class PhoneClock extends Clock {
    private HotelWorldClockSystem hotelWorldClockSystem;

    public PhoneClock(int utcOffset) {
            super.utcOffset = utcOffset;
    }

    public void setTime(int time) {
        if (this.hotelWorldClockSystem == null) return;
        for (CityClock cityClock : this.hotelWorldClockSystem.getClocks()) {
            cityClock.setUtcZeroTime(time - super.utcOffset);
        }
    }

    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem) {
        this.hotelWorldClockSystem = hotelWorldClockSystem;
    }

    // TODO: PhoneClock.getTime() and CityClock.getTime() are duplicated
    public int getTime() {
        return this.time;
    }
}
