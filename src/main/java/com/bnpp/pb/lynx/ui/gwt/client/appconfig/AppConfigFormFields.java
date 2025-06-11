package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.gxt3.base.BaseFormFieldConfig;
import com.sencha.gxt.widget.core.client.form.Field;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.form.TextArea;
import com.sencha.gxt.widget.core.client.form.IntegerField;
import com.sencha.gxt.widget.core.client.form.CheckBox;

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
        initFields();
    }

    @Override
    public void createFields() {
        initFields();
    }

    private void initFields() {
        appKeyField = new TextField();
        appKeyField.setName(AppConfigFieldsDef.appKey);
        setLabel(appKeyField, "App Key");
        appKeyField.setAllowBlank(false);
        appKeyField.setWidth(300);

        emailIdField = new TextField();
        emailIdField.setName(AppConfigFieldsDef.emailId);
        setLabel(emailIdField, "Email ID");
        emailIdField.setAllowBlank(false);
        emailIdField.setWidth(300);

        toField = new TextArea();
        toField.setName(AppConfigFieldsDef.toField);
        setLabel(toField, "To");
        toField.setAllowBlank(false);
        toField.setWidth(300);
        toField.setHeight(60);

        ccField = new TextArea();
        ccField.setName(AppConfigFieldsDef.ccField);
        setLabel(ccField, "CC");
        ccField.setWidth(300);
        ccField.setHeight(60);

        commentField = new TextArea();
        commentField.setName(AppConfigFieldsDef.comment);
        setLabel(commentField, "Comment");
        commentField.setWidth(300);
        commentField.setHeight(60);

        activeField = new CheckBox();
        activeField.setName(AppConfigFieldsDef.active);
        activeField.setBoxLabel("Active");
        activeField.setValue(true);

        versionField = new IntegerField();
        versionField.setName(AppConfigFieldsDef.version);
        setLabel(versionField, "Version");
        versionField.setValue(0);
        versionField.setWidth(100);

        partitionKeyField = new TextField();
        partitionKeyField.setName(AppConfigFieldsDef.partitionKey);
        setLabel(partitionKeyField, "Partition Key");
        partitionKeyField.setWidth(200);
    }

    private void setLabel(Field<?> field, String label) {
        field.setTitle(label);
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