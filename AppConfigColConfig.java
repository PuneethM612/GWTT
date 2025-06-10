package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.gxt3.base.BaseGridColumnConfig;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.grid.ModelData;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableView;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import java.util.List;

/**
 * Column configuration for the App Config window
 */
public class AppConfigColConfig extends BaseGridColumnConfig {
    
    public AppConfigColConfig(TableView tableView) {
        super(tableView);
    }

    @Override
    public List<ColumnConfig<ModelData<String>, ?>> createColumns() {
        final List<ColumnConfig<ModelData<String>, ?>> columnConfigs = createColumns(
            AppConfigDef.gridFieldNames,
            AppConfigDef.formFieldNames
        );

        setColumnProps(AppConfigDef.id, "ID", 80, true, true);
        setColumnProps(AppConfigDef.appId, "App ID", 120, true, true);
        setColumnProps(AppConfigDef.propType, "Property Type", 120, true, true);
        setColumnProps(AppConfigDef.propName, "Property Name", 150, true, true);
        setColumnProps(AppConfigDef.propValue, "Property Value", 200, true, true);
        setColumnProps(AppConfigDef.active, "Active", 60, true, true);
        setColumnProps(AppConfigDef.isActive, "Is Active", 60, true, true);
        setColumnProps(AppConfigDef.createDate, "Create Date", 120, true, true);
        setColumnProps(AppConfigDef.createdBy, "Created by", 100, true, true);
        setColumnProps(AppConfigDef.lastModified, "Last Modified", 120, true, true);
        setColumnProps(AppConfigDef.lastModifiedUserId, "Modified by", 100, true, true);
        setColumnProps(AppConfigDef.version, "Version", 60, true, true);
        setColumnProps(AppConfigDef.partitionKey, "Partition Key", 100, true, true);

        return columnConfigs;
    }
} 