package com.bnpp.pb.lynx.ui.gwt;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer.BorderLayoutData;
import com.sencha.gxt.widget.core.client.container.Viewport;
import com.sencha.gxt.core.client.util.Margins;

public class AppLynxTestUI implements EntryPoint {

    private static final String[] MENU_ITEMS = {
        "Settlement Manager",
        "Trade Manager",
        "Collateral Manager",
        "Asset Servicing",
        "Financing",
        "Wires",
        "TFLM",
        "Global Markets"
    };

    @Override
    public void onModuleLoad() {
        // Create the main viewport
        Viewport viewport = new Viewport();
        
        // Create the main border layout
        BorderLayoutContainer mainContainer = new BorderLayoutContainer();
        
        // Create header
        VerticalPanel header = createHeader();
        BorderLayoutData headerData = new BorderLayoutData(100);
        headerData.setMargins(new Margins(0));
        mainContainer.setNorthWidget(header, headerData);
        
        // Create navigation
        HorizontalPanel navigation = createNavigation();
        BorderLayoutData navData = new BorderLayoutData(40);
        navData.setMargins(new Margins(0));
        mainContainer.setNorthWidget(navigation, navData);
        
        // Create content area
        SimplePanel content = new SimplePanel();
        content.addStyleName("content-area");
        mainContainer.setCenterWidget(content);
        
        viewport.add(mainContainer);
        RootPanel.get().add(viewport);
    }
    
    private VerticalPanel createHeader() {
        VerticalPanel header = new VerticalPanel();
        header.addStyleName("header");
        
        // Add BNP Paribas logo
        Image logo = new Image("path/to/bnp-logo.png");
        logo.addStyleName("bnp-logo");
        
        // Add tagline
        Label tagline = new Label("The bank for a changing world");
        tagline.addStyleName("tagline");
        
        header.add(logo);
        header.add(tagline);
        return header;
    }
    
    private HorizontalPanel createNavigation() {
        HorizontalPanel nav = new HorizontalPanel();
        nav.addStyleName("navigation");
        
        for (String menuItem : MENU_ITEMS) {
            Label item = new Label(menuItem);
            item.addStyleName("nav-item");
            nav.add(item);
        }
        
        return nav;
    }
} 