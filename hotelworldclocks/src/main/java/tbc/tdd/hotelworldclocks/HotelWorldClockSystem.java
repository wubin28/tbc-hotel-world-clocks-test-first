package tbc.tdd.hotelworldclocks;

import java.util.ArrayList;

/**
 * Created by benwu on 14-5-13.
 */
public class HotelWorldClockSystem {
    private ArrayList<CityClock> cityClocks = new ArrayList<CityClock>();

    public void attach(CityClock cityClock) {
        this.cityClocks.add(cityClock);
    }

    public ArrayList<CityClock> getClocks() {
        return this.cityClocks;
    }
}
