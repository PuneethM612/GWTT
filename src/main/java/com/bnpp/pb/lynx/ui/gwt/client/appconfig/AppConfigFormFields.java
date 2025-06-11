package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.gxt3.base.BaseFormFieldConfig;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.form.TextArea;
import com.sencha.gxt.widget.core.client.form.NumberField;
import com.sencha.gxt.widget.core.client.form.CheckBox;

public class AppConfigFormFields extends BaseFormFieldConfig {
    private TextField appKeyField;
    private TextField emailIdField;
    private TextArea toField;
    private TextArea ccField;
    private TextArea commentField;
    private CheckBox activeField;
    private NumberField<Integer> versionField;
    private TextField partitionKeyField;

    public AppConfigFormFields() {
        super();
        createFields();
    }

    private void createFields() {
        appKeyField = new TextField();
        appKeyField.setName(AppConfigFieldsDef.appKey);
        appKeyField.setFieldLabel("App Key");
        appKeyField.setAllowBlank(false);
        appKeyField.setWidth(300);

        emailIdField = new TextField();
        emailIdField.setName(AppConfigFieldsDef.emailId);
        emailIdField.setFieldLabel("Email ID");
        emailIdField.setAllowBlank(false);
        emailIdField.setWidth(300);

        toField = new TextArea();
        toField.setName(AppConfigFieldsDef.toField);
        toField.setFieldLabel("To");
        toField.setAllowBlank(false);
        toField.setWidth(300);
        toField.setHeight(60);

        ccField = new TextArea();
        ccField.setName(AppConfigFieldsDef.ccField);
        ccField.setFieldLabel("CC");
        ccField.setWidth(300);
        ccField.setHeight(60);

        commentField = new TextArea();
        commentField.setName(AppConfigFieldsDef.comment);
        commentField.setFieldLabel("Comment");
        commentField.setWidth(300);
        commentField.setHeight(60);

        activeField = new CheckBox();
        activeField.setName(AppConfigFieldsDef.active);
        activeField.setBoxLabel("Active");
        activeField.setValue(true);

        versionField = new NumberField<Integer>();
        versionField.setName(AppConfigFieldsDef.version);
        versionField.setFieldLabel("Version");
        versionField.setValue(0);
        versionField.setWidth(100);

        partitionKeyField = new TextField();
        partitionKeyField.setName(AppConfigFieldsDef.partitionKey);
        partitionKeyField.setFieldLabel("Partition Key");
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

    public NumberField<Integer> getVersionField() {
        return versionField;
    }

    public TextField getPartitionKeyField() {
        return partitionKeyField;
    }
} 