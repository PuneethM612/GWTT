package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.base.BaseFieldsDef;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.base.BaseGridColumnConfig;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.form.DataEntryForm;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableView;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableWindow;
import com.bnpp.pb.common.coreui.gwt.client.to.QueryArgsTO;
import com.bnpp.pb.lynx.enums.app.AppIdsConstants;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;

/**
 * Table view for the App Config window
 */
public class AppConfigTableView extends TableView {
    private static final String BIZ_OBJECT = "appConfigBO";

    public AppConfigTableView(final TableWindow parentWindow) {
        super(true, parentWindow);
    }

    @Override
    public String getBizObjectName() {
        return BIZ_OBJECT;
    }

    @Override
    public ColumnModel createColModel() {
        return new ColumnModel(getColumnsConfig().createColumns());
    }

    @Override
    public BaseGridColumnConfig createColumnsConfig() {
        return new AppConfigColConfig(this);
    }

    @Override
    public BaseFieldsDef createFieldsDef() {
        return new AppConfigDef();
    }

    @Override
    public DataEntryForm getDataEntryForm() {
        return new AppConfigForm(this);
    }

    @Override
    public QueryArgsTO createDefaultQuery() {
        QueryArgsTO queryArgsTO = super.createDefaultQuery();
        queryArgsTO.fieldNames = AppConfigDef.gridFieldNames;
        return queryArgsTO;
    }

    @Override
    public String getAppId() {
        return AppIdsConstants.APP_CONFIRMS_STATUS.getCode();
    }
} 