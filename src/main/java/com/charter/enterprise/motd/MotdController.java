package com.charter.enterprise.motd;

import com.charter.enterprise.motd.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/motd")
@RestController
public class MotdController {

    @Autowired
    private Message messageOfTheDay;

    private final String putSuccessMessage = "Message updated successfully.";
    /**
     * @return The current message of the day.
     */
    @GetMapping
    public String getMotd() {
        return messageOfTheDay.getValue();
    }

    /**
     * PUT /motd - updates message of the day
     *
     *  @param newMessage: JSON body of the message
     *     format: {
     *          value (String): the value of the new message
     *     }
     */
    @PutMapping(consumes = "application/json")
    public String setMotd(@RequestBody Message newMessage) {
        final String updatedMessageOfTheDay = newMessage.getValue();
        messageOfTheDay.setValue(updatedMessageOfTheDay);
        return(putSuccessMessage);
    }

}