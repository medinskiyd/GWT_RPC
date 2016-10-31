package com.rpc.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * @author dmme1016
 * @since 10/31/2016
 */
public interface MessageServiceAsync {
    void getMessage(String input, AsyncCallback<Message> callback);
}
