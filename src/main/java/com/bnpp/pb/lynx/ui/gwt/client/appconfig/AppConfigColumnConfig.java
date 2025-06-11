package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.base.GridColumns;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.base.BaseGridColumnConfig;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.grid.ModelData;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableView;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;

import java.util.List;

public class AppConfigColumnConfig extends BaseGridColumnConfig {
    
    public AppConfigColumnConfig(TableView tableView) {
        super(tableView);
    }

    @Override
    public List<ColumnConfig<ModelData<String>, ?>> createColumns() {
        final List<ColumnConfig<ModelData<String>, ?>> columnConfigs = 
            createColumns(AppConfigFieldsDef.gridDefaultFieldNames, AppConfigFieldsDef.formFieldNames);

        setColumnProps(AppConfigFieldsDef.id, "ID", 70, false, true);
        setColumnProps(AppConfigFieldsDef.appKey, "App Key", 120, false, true);
        setColumnProps(AppConfigFieldsDef.emailId, "Email ID", 120, false, true);
        setColumnProps(AppConfigFieldsDef.toField, "To", 200, false, true);
        setColumnProps(AppConfigFieldsDef.ccField, "CC", 200, false, true);
        setColumnProps(AppConfigFieldsDef.comment, "Comment", 200, false, true);
        setColumnProps(AppConfigFieldsDef.active, "Active", 60, false, true);
        setColumnProps(AppConfigFieldsDef.createDate, "Created Date", 120, true, true);
        setColumnProps(AppConfigFieldsDef.createdBy, "Created By", 100, true, true);
        setColumnProps(AppConfigFieldsDef.lastModified, "Last Modified", 120, true, true);
        setColumnProps(AppConfigFieldsDef.lastModifiedUser, "Modified By", 100, true, true);
        setColumnProps(AppConfigFieldsDef.version, "Version", 70, true, true);
        setColumnProps(AppConfigFieldsDef.partitionKey, "Partition Key", 100, true, true);

        setSortable(columnConfigs, true);
        return columnConfigs;
    }
} 