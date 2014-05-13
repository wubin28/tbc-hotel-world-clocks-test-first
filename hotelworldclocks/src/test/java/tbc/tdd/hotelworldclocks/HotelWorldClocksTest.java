package tbc.tdd.hotelworldclocks;

import org.junit.Test;

/**
 * Created by benwu on 14-5-13.
 */
public class HotelWorldClocksTest {
    @Test
    public void the_time_of_clock_London_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange

        // Act

        // Assert
        assertEquals(1, londonClock.getTime());
    }
}
