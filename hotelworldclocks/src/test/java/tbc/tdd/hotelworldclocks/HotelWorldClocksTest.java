package tbc.tdd.hotelworldclocks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by benwu on 14-5-13.
 */
public class HotelWorldClocksTest {
    private HotelWorldClockSystem hotelWorldClockSystem;

    @Before
    public void initialize() {
        this.hotelWorldClockSystem = new HotelWorldClockSystem();
    }

    @Test
    public void the_time_of_clock_London_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange
        CityClock londonClock = new CityClock(0);
        hotelWorldClockSystem.attach(londonClock);
        PhoneClock phoneClock = new PhoneClock(8);

        // Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        // Assert
        assertEquals(1, londonClock.getTime());
    }

    @Test
    public void the_time_of_clock_NewYork_should_be_20_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange
        CityClock newYorkClock = new CityClock(-5);
        hotelWorldClockSystem.attach(newYorkClock);
        PhoneClock phoneClock = new PhoneClock(8);

        // Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        // Assert
        assertEquals(20, newYorkClock.getTime());
    }

    @Test
    public void the_time_of_clock_London_and_NewYork_should_be_1_and_20_respectively_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange
        CityClock londonClock = new CityClock(0);
        CityClock newYorkClock = new CityClock(-5);
        hotelWorldClockSystem.attach(londonClock);
        hotelWorldClockSystem.attach(newYorkClock);
        PhoneClock phoneClock = new PhoneClock(8);

        // Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        // Assert
        assertEquals(1, londonClock.getTime());
        assertEquals(20, newYorkClock.getTime());
    }

    @Test
    public void the_time_of_the_phone_clock_should_be_set_correctly_after_its_setTime_method_is_invoked() {
        // Arrange
        PhoneClock phoneClock = new PhoneClock(8);

        // Act
        phoneClock.setTime(9);

        // Assert
        assertEquals(9, phoneClock.getTime());
    }

    @Test
    public void the_time_of_clock_Moscow_should_be_5_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange
        CityClock moscowClock = new CityClock(4);
        hotelWorldClockSystem.attach(moscowClock);
        PhoneClock phoneClock = new PhoneClock(8);

        // Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        // Assert
        assertEquals(5, moscowClock.getTime());
    }
}
