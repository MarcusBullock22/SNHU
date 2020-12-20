import java.util.Date;

public class Appointment {
    private String id;
    private Date date;
    private String description;

    public Appointment(String id, Date date, String description) 
    {
        if (id == null || date == null || description == null) 
        {
            throw new IllegalArgumentException("Enter appointment information.");
        }
        if (id.length() > 10) 
        {
            throw new IllegalArgumentException("ID cannot be longer than 10 characters.");
        }
        if (date.before(new Date())) 
        {
            throw new IllegalArgumentException("The date cannot be in the past.");
        }
        if (description.length() > 50) 
        {
            throw new IllegalArgumentException("Description cannot be longer than 10 characters.");
        }
        this.id = id;
        this.date = date;
        this.description = description;
    }

    public String getId() 
    {
        return id;
    }

    public Date getDate() 
    {
        return date;
    }

    public String getDescription()
    {
        return description;
    }
}