package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.gxt3.base.BaseFormFieldConfig;
import com.sencha.gxt.widget.core.client.form.Field;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.form.TextArea;
import com.sencha.gxt.widget.core.client.form.IntegerField;
import com.sencha.gxt.widget.core.client.form.CheckBox;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.google.gwt.user.client.ui.Widget;

public class AppConfigFormFields extends BaseFormFieldConfig {
    private TextField appKeyField;
    private TextField emailIdField;
    private TextArea toField;
    private TextArea ccField;
    private TextArea commentField;
    private CheckBox activeField;
    private IntegerField versionField;
    private TextField partitionKeyField;

    public AppConfigFormFields() {
        super();
        createFields();
    }

    @Override
    public Widget[] createFields() {
        initFields();
        Widget[] fields = new Widget[] {
            new FieldLabel(appKeyField, "App Key"),
            new FieldLabel(emailIdField, "Email ID"),
            new FieldLabel(toField, "To"),
            new FieldLabel(ccField, "CC"),
            new FieldLabel(commentField, "Comment"),
            activeField,
            new FieldLabel(versionField, "Version"),
            new FieldLabel(partitionKeyField, "Partition Key")
        };
        updateFieldMap(fields);
        return fields;
    }

    private void initFields() {
        appKeyField = new TextField();
        appKeyField.setName(AppConfigFieldsDef.appKey);
        appKeyField.setAllowBlank(false);
        appKeyField.setWidth(300);

        emailIdField = new TextField();
        emailIdField.setName(AppConfigFieldsDef.emailId);
        emailIdField.setAllowBlank(false);
        emailIdField.setWidth(300);

        toField = new TextArea();
        toField.setName(AppConfigFieldsDef.toField);
        toField.setAllowBlank(false);
        toField.setWidth(300);
        toField.setHeight(60);

        ccField = new TextArea();
        ccField.setName(AppConfigFieldsDef.ccField);
        ccField.setWidth(300);
        ccField.setHeight(60);

        commentField = new TextArea();
        commentField.setName(AppConfigFieldsDef.comment);
        commentField.setWidth(300);
        commentField.setHeight(60);

        activeField = new CheckBox();
        activeField.setName(AppConfigFieldsDef.active);
        activeField.setBoxLabel("Active");
        activeField.setValue(true);

        versionField = new IntegerField();
        versionField.setName(AppConfigFieldsDef.version);
        versionField.setValue(0);
        versionField.setWidth(100);

        partitionKeyField = new TextField();
        partitionKeyField.setName(AppConfigFieldsDef.partitionKey);
        partitionKeyField.setWidth(200);
    }

    public TextField getAppKeyField() {
        return appKeyField;
    }

    public TextField getEmailIdField() {
        return emailIdField;
    }

    public TextArea getToField() {
        return toField;
    }

    public TextArea getCcField() {
        return ccField;
    }

    public TextArea getCommentField() {
        return commentField;
    }

    public CheckBox getActiveField() {
        return activeField;
    }

    public IntegerField getVersionField() {
        return versionField;
    }

    public TextField getPartitionKeyField() {
        return partitionKeyField;
    }
} 