package ir.moke.client.layout;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ApplicationLayout extends Composite {
    interface ApplicationLayoutBinder extends UiBinder<Widget, ApplicationLayout> {
    }

    private static final ApplicationLayoutBinder layoutBinder = GWT.create(ApplicationLayoutBinder.class);

    public ApplicationLayout() {
        initWidget(layoutBinder.createAndBindUi(this));
    }
}
