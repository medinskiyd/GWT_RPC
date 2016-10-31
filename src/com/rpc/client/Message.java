package com.rpc.client;

import java.io.Serializable;

/**
 * @author dmme1016
 * @since 10/31/2016
 */
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
