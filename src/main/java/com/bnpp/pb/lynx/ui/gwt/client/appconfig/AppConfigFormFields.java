package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.gxt3.base.BaseFormFieldConfig;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.form.field.CheckBoxField;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.form.field.TextField;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.form.field.NumberField;
import com.sencha.gxt.widget.core.client.form.TextArea;

public class AppConfigFormFields extends BaseFormFieldConfig {
    private TextField appKeyField;
    private TextField emailIdField;
    private TextArea toField;
    private TextArea ccField;
    private TextArea commentField;
    private CheckBoxField activeField;
    private NumberField versionField;
    private TextField partitionKeyField;

    public AppConfigFormFields() {
        super();
        createFields();
    }

    private void createFields() {
        appKeyField = new TextField(AppConfigFieldsDef.appKey, "App Key");
        appKeyField.setAllowBlank(false);
        appKeyField.setWidth(300);
        appKeyField.setMaxLength(255);

        emailIdField = new TextField(AppConfigFieldsDef.emailId, "Email ID");
        emailIdField.setAllowBlank(false);
        emailIdField.setWidth(300);
        emailIdField.setMaxLength(255);

        toField = new TextArea();
        toField.setName(AppConfigFieldsDef.toField);
        toField.setFieldLabel("To");
        toField.setAllowBlank(false);
        toField.setWidth(300);
        toField.setHeight(60);
        toField.setMaxLength(255);

        ccField = new TextArea();
        ccField.setName(AppConfigFieldsDef.ccField);
        ccField.setFieldLabel("CC");
        ccField.setWidth(300);
        ccField.setHeight(60);
        ccField.setMaxLength(255);

        commentField = new TextArea();
        commentField.setName(AppConfigFieldsDef.comment);
        commentField.setFieldLabel("Comment");
        commentField.setWidth(300);
        commentField.setHeight(60);
        commentField.setMaxLength(255);

        activeField = new CheckBoxField(AppConfigFieldsDef.active, "Active");
        activeField.setValue(true);

        versionField = new NumberField(AppConfigFieldsDef.version, "Version");
        versionField.setValue(0);
        versionField.setWidth(100);

        partitionKeyField = new TextField(AppConfigFieldsDef.partitionKey, "Partition Key");
        partitionKeyField.setWidth(200);
        partitionKeyField.setMaxLength(40);
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

    public CheckBoxField getActiveField() {
        return activeField;
    }

    public NumberField getVersionField() {
        return versionField;
    }

    public TextField getPartitionKeyField() {
        return partitionKeyField;
    }
} 