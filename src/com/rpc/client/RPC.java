package com.rpc.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.*;
import com.google.gwt.user.client.ui.*;

/**
 * @author dmme1016
 * @since 10/31/2016
 */
public class RPC implements EntryPoint {

    private MessageServiceAsync messageService =
            GWT.create(MessageService.class);

    public void onModuleLoad() {
      /*create UI */
        final TextBox txtName = new TextBox();
        txtName.setWidth("200");
//        txtName.addKeyUpHandler(new KeyUpHandler() {
//            @Override
//            public void onKeyUp(KeyUpEvent event) {
//                if(event.getNativeKeyCode() == KeyCodes.KEY_ENTER){
//               /* make remote call to server to get the message */
//                    messageService.getMessage(txtName.getValue(),
//                            new MessageCallBack());
//                }
//            }
//        });

        Label lblName = new Label("Enter your name: ");

        Button buttonMessage = new Button("Click Me!");

        buttonMessage.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
         /* make remote call to server to get the message */
                messageService.getMessage(txtName.getValue(),
                        new MessageCallBack());
            }});

        HorizontalPanel hPanel = new HorizontalPanel();
        hPanel.add(lblName);
        hPanel.add(txtName);
        hPanel.setCellWidth(lblName, "130");

        VerticalPanel vPanel = new VerticalPanel();
        vPanel.setSpacing(10);
        vPanel.add(hPanel);
        vPanel.add(buttonMessage);
        vPanel.setCellHorizontalAlignment(buttonMessage,
                HasHorizontalAlignment.ALIGN_RIGHT);

        DecoratorPanel panel = new DecoratorPanel();
        panel.add(vPanel);

        // Add widgets to the root panel.
        RootPanel.get("gwtContainer").add(panel);
    }
}
