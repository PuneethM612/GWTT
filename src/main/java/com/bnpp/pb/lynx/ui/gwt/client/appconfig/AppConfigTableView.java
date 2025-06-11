package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.gxt3.base.BaseGridColumnConfig;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.form.DataEntryForm;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableView;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableWindow;

public class AppConfigTableView extends TableView {
    private TableWindow window;
    private AppConfigFieldsDef fieldsDef;
    
    public AppConfigTableView(boolean isEditable, TableWindow window) {
        super(isEditable, window);
        this.window = window;
        this.fieldsDef = new AppConfigFieldsDef();
    }

    @Override
    public BaseGridColumnConfig createColumnsConfig() {
        return new AppConfigColumnConfig(this);
    }

    @Override
    public AppConfigFieldsDef createFieldsDef() {
        return new AppConfigFieldsDef();
    }

    @Override
    public AppConfigFieldsDef getFieldsDef() {
        return fieldsDef;
    }

    @Override
    public DataEntryForm getDataEntryForm() {
        return new AppConfigForm(window);
    }

    @Override
    public String getBizObjectName() {
        return AppConfigWindow.BIZ_OBJECT;
    }
} 