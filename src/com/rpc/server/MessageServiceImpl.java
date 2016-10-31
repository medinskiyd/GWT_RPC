package com.rpc.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.rpc.client.Message;
import com.rpc.client.MessageService;

/**
 * @author dmme1016
 * @since 10/31/2016
 */
public class MessageServiceImpl extends RemoteServiceServlet
        implements MessageService {

    private static final long serialVersionUID = 1L;

    public Message getMessage(String input) {

        String messageString = "Hello " + input + "!";
        Message message = new Message();
        message.setMessage(messageString);

        return message;
    }
}
