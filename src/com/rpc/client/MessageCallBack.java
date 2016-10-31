package com.rpc.client;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * @author dmme1016
 * @since 10/31/2016
 */
public class MessageCallBack implements AsyncCallback<Message> {

    @Override
    public void onFailure(Throwable caught) {
        Window.alert("Unable to obtain server response: "
                + caught.getMessage());
    }

    @Override
    public void onSuccess(Message result) {
        Window.alert(result.getMessage());
    }
}