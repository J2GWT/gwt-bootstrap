package ir.moke.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface ApplicationResource extends ClientBundle {

    ApplicationResource INSTANCE = GWT.create(ApplicationResource.class);

    @Source("main.css")
    CssResource getMainCss();
}
