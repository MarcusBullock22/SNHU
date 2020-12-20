import java.util.HashMap;
import java.util.Map;

public class AppointmentService
{
    private Map<String, Appointment> appointmentMap = new HashMap<String, Appointment>();

    public void addAppointment(String id, Appointment appointment)
    {
        appointmentMap.put(id, appointment);
    }
    
    public void deleteAppointment(String id)
    {
        appointmentMap.remove(id);
    }
}
