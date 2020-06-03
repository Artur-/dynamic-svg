package com.example.app;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    public MainView() {
        FillIndicator indicator = new FillIndicator();
        Button button = new Button("Fill", e -> {
            int newValue = (indicator.getValue() + 5);
            if (newValue > 100) {
                newValue = 0;
                Notification.show("Oh no!", 1000, Position.MIDDLE);
            }
            indicator.setValue(newValue);
        });

        add(indicator, button);
    }

}
