package tbc.tdd.hotelworldclocks;

/**
 * Created by benwu on 14-5-13.
 */
public class CityClock extends Clock{
    private int utcZeroTime;

    // TODO-working-on: The constructors of CityClock and PhoneClock are duplicated
    public CityClock(int utcOffset) {
        super.utcOffset = utcOffset;
    }

    public int getTime() {
        return (super.utcOffset + this.utcZeroTime + 24) % 24;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }
}
