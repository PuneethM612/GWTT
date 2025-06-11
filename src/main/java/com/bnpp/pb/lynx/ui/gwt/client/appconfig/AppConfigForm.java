package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.gxt3.base.BaseFormFieldConfig;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.binding.FormBinding;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.form.DataEntryForm;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableWindow;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.Window;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.HorizontalLayoutData;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;

@SuppressWarnings("unchecked")
public class AppConfigForm extends DataEntryForm {
    public static final String BIZ_OBJECT = AppConfigWindow.BIZ_OBJECT;
    private TableWindow parentWindow;
    private AppConfigFormFields formFields;
    private FormBinding formBinding;
    private int windowWidth = 600;
    private int formPanelHeight = 500;

    @Override
    public BaseFormFieldConfig createFormFields() {
        formFields = new AppConfigFormFields();
        return formFields;
    }

    public AppConfigForm(TableWindow parentWin) {
        super();
        parentWindow = parentWin;
        this.init();
    }

    @Override
    public void init() {
        super.init();
        getWindow().setResizable(true);
        
        if (super.getWindow() != null) {
            final Window encloseWin = super.getWindow();
            encloseWin.setWidth(this.windowWidth);
            encloseWin.setHeight(this.formPanelHeight);

            VerticalLayoutContainer vlc = new VerticalLayoutContainer();
            vlc.add(formFields.getAppKeyField());
            vlc.add(formFields.getEmailIdField());
            vlc.add(formFields.getToField());
            vlc.add(formFields.getCcField());
            vlc.add(formFields.getCommentField());
            
            HorizontalLayoutContainer hc1 = new HorizontalLayoutContainer();
            hc1.add(formFields.getActiveField(), new HorizontalLayoutData(-1, -1));
            vlc.add(hc1);
            
            HorizontalLayoutContainer hc2 = new HorizontalLayoutContainer();
            hc2.add(formFields.getVersionField(), new HorizontalLayoutData(0.3, -1));
            hc2.add(formFields.getPartitionKeyField(), new HorizontalLayoutData(0.7, -1));
            vlc.add(hc2);

            HorizontalLayoutContainer hc = new HorizontalLayoutContainer();
            hc.add(vlc, new HorizontalLayoutData(1, -1));

            ContentPanel mainPanel = new ContentPanel();
            mainPanel.setBorders(false);
            mainPanel.setHeaderVisible(false);
            mainPanel.add(hc);

            encloseWin.add(mainPanel);
        }
    }

    @Override
    public String getBizObjectName() {
        return BIZ_OBJECT;
    }
} 