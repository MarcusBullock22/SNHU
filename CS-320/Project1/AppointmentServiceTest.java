import org.junit.Test;

import java.util.Calendar;

public class AppointmentServiceTest {

    @Test
    public void addAppointment() 
    {
        AppointmentService appointmentService = new AppointmentService();
        String id = "12";
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 01, 01);
        appointmentService.addAppointment(id, new
                Appointment(id, calendar.getTime(), "Advising meeting"));
    }

    @Test
    public void deleteAppointment() 
    {
        AppointmentService appointmentService = new AppointmentService();
        String id = "12";
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 01, 01);
        appointmentService.addAppointment(id, new
                Appointment(id, calendar.getTime(), "Advisory Meeting"));
        appointmentService.deleteAppointment(id);
    }

}