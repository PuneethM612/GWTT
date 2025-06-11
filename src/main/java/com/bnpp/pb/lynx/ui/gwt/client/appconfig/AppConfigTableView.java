package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.gxt3.base.BaseGridColumnConfig;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.form.DataEntryForm;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableView;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableWindow;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;

public class AppConfigTableView extends TableView {
    private TableWindow window;
    private AppConfigColumnConfig columnConfig;
    private AppConfigFieldsDef fieldsDef;
    
    public AppConfigTableView(boolean isEditable, TableWindow window) {
        super(isEditable, window);
        this.window = window;
        this.columnConfig = new AppConfigColumnConfig(this);
        this.fieldsDef = new AppConfigFieldsDef();
    }

    @Override
    public BaseGridColumnConfig getColumnsConfig() {
        return columnConfig;
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

    @Override
    public Grid<ModelData> createGrid() {
        Grid<ModelData> grid = new Grid<>(getStore(), new ColumnModel<>(columnConfig.createColumns()));
        grid.setLoadMask(true);
        grid.getView().setStripeRows(true);
        return grid;
    }
} 