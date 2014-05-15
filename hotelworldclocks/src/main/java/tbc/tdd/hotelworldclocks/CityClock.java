package tbc.tdd.hotelworldclocks;

/**
 * Created by benwu on 14-5-13.
 */
public class CityClock extends Clock{
    private int utcZeroTime;

    public CityClock(int utcOffset) {
        super.utcOffset = utcOffset;
    }

    @Override
    public int getTime() {
        return (super.utcOffset + this.utcZeroTime + 24) % 24;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }
}
