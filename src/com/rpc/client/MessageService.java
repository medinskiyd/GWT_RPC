package com.rpc.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * @author dmme1016
 * @since 10/31/2016
 */
@RemoteServiceRelativePath("message")
public interface MessageService extends RemoteService {
    Message getMessage(String input);
}
