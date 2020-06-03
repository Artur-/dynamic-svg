package com.example.app;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@NpmPackage(value = "lit-element", version = "2.3.0")
@JsModule("./fill-indicator.js")
@Tag("fill-indicator")
public class FillIndicator extends Component implements HasStyle {

    PropertyDescriptor<Integer, Integer> valueProperty = PropertyDescriptors.propertyWithDefault("value", 0);
    PropertyDescriptor<String, String> fillProperty = PropertyDescriptors.propertyWithDefault("fill", "#0f0");

    public FillIndicator() {

    }

    public void setValue(int value) {
        valueProperty.set(this, value);
        if (value >= 90) {
            fillProperty.set(this, "#de1f1f");
        } else if (value >= 75) {
            fillProperty.set(this, "#dede1f");
        } else {
            fillProperty.set(this, "#1fde1f");
        }
    }

    public int getValue() {
        return valueProperty.get(this);
    }
}