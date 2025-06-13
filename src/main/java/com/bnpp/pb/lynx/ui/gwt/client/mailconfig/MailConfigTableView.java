package com.bnpp.pb.lynx.ui.gwt.client.mailconfig;

import com.bnpp.pb.common.coreui.gwt.client.base.BaseFieldsDef;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.base.BaseGridColumnConfig;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.grid.ModelData;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.form.DataEntryForm;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableView;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableWindow;
import com.bnpp.pb.common.coreui.gwt.client.op.IFilterType;
import com.bnpp.pb.common.coreui.gwt.client.to.QueryArgsTO;
import com.bnpp.pb.lynx.enums.app.AppIdsConstants;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MailConfigTableView extends TableView {
    public static final int DEFAULT_PAGE_SIZE = 50;
    public static final String BIZ_OBJECT = "lynx_app_mail_config";
    
    private MailConfigColumnConfig columnConfig;
    private QueryArgsTO queryArgs = new QueryArgsTO();

    public MailConfigTableView(final boolean autoLoad, final TableWindow parentWindow) {
        super(autoLoad, parentWindow);
    }

    @Override
    public String getBizObjectName() {
        return BIZ_OBJECT;
    }

    @Override
    public DataEntryForm getDataEntryForm() {
        return null;
    }

    @Override
    public BaseGridColumnConfig createColumnsConfig() {
        columnConfig = new MailConfigColumnConfig(this);
        return columnConfig;
    }

    @Override
    public ColumnModel<ModelData<String>> createColModel() {
        return new ColumnModel<>(getColumnsConfig().createColumns());
    }

    @Override
    public QueryArgsTO getQueryArgsFromFilter(QueryArgsTO queryArgsTO) {
        QueryArgsTO result = super.getQueryArgsFromFilter(queryArgsTO);
        
        String[] selectedFieldNames = result.filterFieldNames;
        String[] selectedFieldValues = result.filterFieldValues;
        String[] selectedFieldTypes = result.filterTypes;
        
        final List<String> filterFieldNames = new ArrayList<String>();
        List<String> filterFieldValues = new ArrayList<String>();
        final List<String> filterTypes = new ArrayList<String>();
        
        // Add default filters if needed
        filterFieldNames.add("active");
        filterTypes.add(IFilterType.GT);
        filterTypes.add(IFilterType.EQ);
        filterFieldValues.add("0");
        filterFieldValues.add("y");
        
        if (selectedFieldNames != null && selectedFieldNames.length > 0) {
            Collections.addAll(filterFieldNames, selectedFieldNames);
        }
        if (selectedFieldValues != null && selectedFieldValues.length > 0) {
            Collections.addAll(filterFieldValues, selectedFieldValues);
        }
        if (selectedFieldTypes != null && selectedFieldTypes.length > 0) {
            Collections.addAll(filterTypes, selectedFieldTypes);
        }
        
        result.filterFieldNames = filterFieldNames.toArray(new String[0]);
        result.filterTypes = filterTypes.toArray(new String[0]);
        result.filterFieldValues = filterFieldValues.toArray(new String[0]);
        
        // Set default sorting
        result.orderBy = new String[]{"id"};
        result.orderByDir = new String[]{"asc"};
        
        return result;
    }

    @Override
    public BaseFieldsDef createFieldsDef() {
        return new MailConfigFieldsDef();
    }

    @Override
    public String getAppId() {
        return AppIdsConstants.APP_CONFIRMS_STATUS.getCode();
    }
} 