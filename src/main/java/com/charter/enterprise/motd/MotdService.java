package com.charter.enterprise.motd;

import org.springframework.stereotype.Service;

/**
 * 
 * @author priyankaa18
 *
 */

@Service
public class MotdService {

	 
    private String message = "Welcome to Charter.  All systems are nominal.";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        
        this.message = message;
    }
}
