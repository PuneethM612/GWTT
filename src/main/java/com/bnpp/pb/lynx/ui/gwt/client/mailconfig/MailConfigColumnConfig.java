package com.bnpp.pb.lynx.ui.gwt.client.mailconfig;

import com.bnpp.pb.common.coreui.gwt.client.gxt3.base.BaseGridColumnConfig;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.grid.ModelData;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableView;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import java.util.List;

public class MailConfigColumnConfig extends BaseGridColumnConfig {
    
    public MailConfigColumnConfig(TableView tableView) {
        super(tableView);
    }

    @Override
    public List<ColumnConfig<ModelData<String>, ?>> createColumns() {
        final List<ColumnConfig<ModelData<String>, ?>> columnConfigs = 
            createColumns(MailConfigFieldsDef.gridFieldNames, MailConfigFieldsDef.formFieldNames);

        setColumnProps(MailConfigFieldsDef.id, "ID", 70, false, true);
        setColumnProps(MailConfigFieldsDef.appKey, "App Key", 120, false, true);
        setColumnProps(MailConfigFieldsDef.emailId, "Email ID", 120, false, true);
        setColumnProps(MailConfigFieldsDef.toField, "To", 200, false, true);
        setColumnProps(MailConfigFieldsDef.ccField, "CC", 200, false, true);
        setColumnProps(MailConfigFieldsDef.comment, "Comment", 200, false, true);
        setColumnProps(MailConfigFieldsDef.active, "Active", 60, false, true);
        setColumnProps(MailConfigFieldsDef.createDate, "Created Date", 120, true, true);
        setColumnProps(MailConfigFieldsDef.createdBy, "Created By", 100, true, true);
        setColumnProps(MailConfigFieldsDef.lastModified, "Last Modified", 120, true, true);
        setColumnProps(MailConfigFieldsDef.lastModifiedUser, "Modified By", 100, true, true);
        setColumnProps(MailConfigFieldsDef.version, "Version", 70, true, true);
        setColumnProps(MailConfigFieldsDef.partitionKey, "Partition Key", 100, true, true);

        setSortable(columnConfigs, true);
        return columnConfigs;
    }
} 