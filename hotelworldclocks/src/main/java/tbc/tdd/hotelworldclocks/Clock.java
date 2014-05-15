package tbc.tdd.hotelworldclocks;

/**
 * Created by benwu on 14-5-14.
 */
public abstract class Clock {
    protected int utcOffset;
    public abstract int getTime();
}
