import org.junit.Test;

import java.util.Calendar;

public class AppointmentTest 
{

    @Test
    public void correctAppointment() 
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 01, 01);
        Appointment appointment =
                new Appointment("12",calendar.getTime(),"Meeting");
    }

    @Test(expected = IllegalArgumentException.class)
    public void idNull() 
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 01, 01);
        Appointment appointment =
                new Appointment(null,calendar.getTime(),"Meeting");
    }

    @Test(expected = IllegalArgumentException.class)
    public void idAbove10Chars() 
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 01, 01);
        Appointment appointment =
                new Appointment("More than 10 character",calendar.getTime(),"Meeting");
    }

    @Test(expected = IllegalArgumentException.class)
    public void dateIsPast() 
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1994, 01, 01);
        Appointment appointment =
                new Appointment("12",calendar.getTime(),"Meeting");
    }

    @Test(expected = IllegalArgumentException.class)
    public void descriptionAbove50Chars() 
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 01, 01);
        Appointment appointment =
                new Appointment("12",calendar.getTime(),"aaaaaaaaaaaaaaaaaaaaaaaaaaa" + "asdf adsf adsf");
    }
}