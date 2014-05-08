package app

import com.vaadin.addon.responsive.Responsive
import com.vaadin.annotations.Theme
import com.vaadin.server.Sizeable
import com.vaadin.server.VaadinRequest
import com.vaadin.shared.ui.label.ContentMode
import com.vaadin.ui.CssLayout
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout

/**
 * @author Aluis 2014-05-08
 */
@Theme("demo")
class MyUI extends UI {

    private VerticalLayout mainLayout
    private Label lDinamico, lDinamico2
    private HorizontalSplitPanel split
    private Responsive r1, r2

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        mainLayout = new VerticalLayout()
        mainLayout.setSizeFull()
        mainLayout.addStyleName("fondo")

        split = new HorizontalSplitPanel();
        split.setSplitPosition(50, Sizeable.Unit.PERCENTAGE);
        split.setMinSplitPosition(100, Sizeable.Unit.PIXELS);
        split.setMaxSplitPosition(1200, Sizeable.Unit.PIXELS);

        lDinamico = new Label("<h3>Aquí tengo un texto que cambia de color la letra.<h3>", ContentMode.HTML)
        lDinamico.addStyleName("prueba-color")

        lDinamico2 = new Label("Este es otro texto")
        lDinamico2.addStyleName("prueba-size")

        r1 = new Responsive(lDinamico)
        r2 = new Responsive(lDinamico2)

        split.addComponent(lDinamico)
        split.addComponent(lDinamico2)

        mainLayout.addComponent(split)

		setContent(mainLayout)
    }
}
