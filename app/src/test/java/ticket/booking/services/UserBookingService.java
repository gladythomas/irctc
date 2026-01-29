package ticket.booking.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

import ticket.booking.entities.User;

public class UserBookingService {
    
    private User user;
    private static final String USERS_PATH="../localDb/users.json";

    private static  OBJECT_MAPPER= new ObjectMapper();

    public UserBookingService(User user){
            this.user=user;
            File users= new File(USERS_PATH);
    }
}
