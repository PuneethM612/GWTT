package com.bnpp.pb.lynx.ui.gwt.client.mailconfig;

import com.bnpp.pb.common.coreui.gwt.client.gxt3.base.BaseFieldsDef;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.base.BaseGridColumnConfig;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.form.DataEntryForm;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableView;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableWindow;
import com.bnpp.pb.lynx.enums.app.AppIdsConstants;

public class MailConfigTableView extends TableView {
    public static final String BIZ_OBJECT = "mailConfigBO";
    private TableWindow window;
    private MailConfigFieldsDef fieldsDef;
    
    public MailConfigTableView(boolean isEditable, TableWindow window) {
        super(isEditable, window);
        this.window = window;
        this.fieldsDef = new MailConfigFieldsDef();
    }

    @Override
    public BaseGridColumnConfig createColumnsConfig() {
        return new MailConfigColumnConfig(this);
    }

    @Override
    public BaseFieldsDef createFieldsDef() {
        return new MailConfigFieldsDef();
    }

    @Override
    public BaseFieldsDef getFieldsDef() {
        return fieldsDef;
    }

    @Override
    public DataEntryForm getDataEntryForm() {
        return null; // We'll implement this later with the form
    }

    @Override
    public String getBizObjectName() {
        return BIZ_OBJECT;
    }

    @Override
    public String getAppId() {
        return AppIdsConstants.APP_CONFIRMS_STATUS.getCode();
    }
} 