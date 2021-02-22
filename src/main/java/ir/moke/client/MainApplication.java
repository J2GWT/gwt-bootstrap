package ir.moke.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.RootPanel;
import ir.moke.client.layout.ApplicationLayout;

public class MainApplication implements EntryPoint {

    private static final ApplicationLayout layout = GWT.create(ApplicationLayout.class);

    @Override
    public void onModuleLoad() {
        ApplicationResource.INSTANCE.getMainCss().ensureInjected();
        RootPanel.get().add(layout);
    }
}
