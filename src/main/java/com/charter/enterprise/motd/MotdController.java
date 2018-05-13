package com.charter.enterprise.motd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/message")
@RestController
public class MotdController {

	@Autowired
    MotdService motdService;
	
    @GetMapping
    public String getMotd() {
        return motdService.getMessage();
    }

    /**
     *  PUT request with the new message in request body .
     * @param  the new message 
     * @return
     */
    @PutMapping
    public HttpEntity<String> setMotd(@RequestBody String newMessage) {
        if (newMessage == null || newMessage.trim().isEmpty()) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        motdService.setMessage(newMessage.trim());
        return new ResponseEntity<>("New Message is set", HttpStatus.OK);
    }
}
