package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.gxt3.base.BaseFieldsDef;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.base.BaseGridColumnConfig;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.form.DataEntryForm;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableView;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableWindow;
import com.bnpp.pb.common.coreui.gwt.client.to.QueryArgsTO;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;

public class AppConfigTableView extends TableView {
    private TableWindow window;
    private AppConfigColumnConfig columnConfig;
    
    public AppConfigTableView(boolean isEditable, TableWindow window) {
        super(isEditable, window);
        this.window = window;
        this.columnConfig = new AppConfigColumnConfig(this);
    }

    @Override
    public BaseGridColumnConfig createColumnsConfig() {
        return columnConfig;
    }

    @Override
    public BaseFieldsDef createFieldsDef() {
        return new AppConfigFieldsDef();
    }

    @Override
    public DataEntryForm createDataEntryForm() {
        return new AppConfigForm(window);
    }

    @Override
    public String getBizObjectName() {
        return AppConfigWindow.BIZ_OBJECT;
    }

    @Override
    protected ColumnModel<ModelData> createColumnModel() {
        return new ColumnModel<>(columnConfig.createColumns());
    }

    @Override
    public QueryArgsTO createDefaultQuery() {
        QueryArgsTO queryArgsTO = super.createDefaultQuery();
        queryArgsTO.fieldNames = AppConfigDef.gridFieldNames;
        return queryArgsTO;
    }
} 