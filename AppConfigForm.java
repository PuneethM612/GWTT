package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.form.DataEntryForm;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableView;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.grid.ModelData;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.form.ComboBox;
import com.sencha.gxt.widget.core.client.form.DateField;
import java.util.ArrayList;
import java.util.List;

/**
 * Form for App Config CRUD operations
 */
public class AppConfigForm extends DataEntryForm<ModelData<String>> {
    private static final String BIZ_OBJECT = "appConfigBO";
    private TextField appIdField;
    private TextField propTypeField;
    private TextField propNameField;
    private TextField propValueField;
    private ComboBox<String> activeField;
    private ComboBox<String> isActiveField;

    public AppConfigForm(TableView tableView) {
        super(tableView);
    }

    @Override
    protected void createFields() {
        appIdField = new TextField();
        appIdField.setFieldLabel("App ID");
        appIdField.setAllowBlank(false);
        addField(AppConfigDef.appId, appIdField);

        propTypeField = new TextField();
        propTypeField.setFieldLabel("Property Type");
        propTypeField.setAllowBlank(false);
        addField(AppConfigDef.propType, propTypeField);

        propNameField = new TextField();
        propNameField.setFieldLabel("Property Name");
        propNameField.setAllowBlank(false);
        addField(AppConfigDef.propName, propNameField);

        propValueField = new TextField();
        propValueField.setFieldLabel("Property Value");
        propValueField.setAllowBlank(false);
        addField(AppConfigDef.propValue, propValueField);

        activeField = new ComboBox<String>();
        activeField.setFieldLabel("Active");
        activeField.setTriggerAction(ComboBox.TriggerAction.ALL);
        activeField.add("Y");
        activeField.add("N");
        addField(AppConfigDef.active, activeField);

        isActiveField = new ComboBox<String>();
        isActiveField.setFieldLabel("Is Active");
        isActiveField.setTriggerAction(ComboBox.TriggerAction.ALL);
        isActiveField.add("Y");
        isActiveField.add("N");
        addField(AppConfigDef.isActive, isActiveField);
    }

    @Override
    protected void initializeFields() {
        activeField.setValue("Y");
        isActiveField.setValue("Y");
    }

    @Override
    public String getBizObjectName() {
        return BIZ_OBJECT;
    }

    @Override
    public List<String> createFormFields() {
        List<String> formFields = new ArrayList<>();
        formFields.add(AppConfigDef.appId);
        formFields.add(AppConfigDef.propType);
        formFields.add(AppConfigDef.propName);
        formFields.add(AppConfigDef.propValue);
        formFields.add(AppConfigDef.active);
        formFields.add(AppConfigDef.isActive);
        return formFields;
    }
} 