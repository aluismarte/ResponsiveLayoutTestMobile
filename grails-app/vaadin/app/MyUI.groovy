package app

import com.vaadin.addon.responsive.Responsive
import com.vaadin.annotations.Theme
import com.vaadin.server.Sizeable
import com.vaadin.server.VaadinRequest
import com.vaadin.shared.ui.label.ContentMode
import com.vaadin.ui.*

/**
 * @author Aluis 2014-05-08
 */
@Theme("demo")
class MyUI extends UI {

    private VerticalLayout mainLayout, vlInfo
    private HorizontalLayout hlInfoUser, hlInfoSystem
    private Label lUser, lSystem, lData
    private Responsive r1, r2
    private Table tablaDemo

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        mainLayout = new VerticalLayout()
        mainLayout.setSizeFull()

        mainLayout.addComponent(builtLayout())
		setContent(mainLayout)

        r1 = new Responsive(lUser)
        r2 = new Responsive(lSystem)
    }

    private Component builtLayout() {
        vlInfo = new VerticalLayout()

        hlInfoSystem = new HorizontalLayout()
        hlInfoSystem.setSizeFull()
        hlInfoUser = new HorizontalLayout()
        hlInfoUser.setSizeFull()

        lUser = new Label("<center>Hola, Desconocido</center>", ContentMode.HTML)
        lUser.addStyleName("prueba")

        lSystem = new Label("<center>Sistema de Prueba para Móvil</center>", ContentMode.HTML)
        lSystem.addStyleName("prueba")

        lData = new Label("Texto de prueba")

        // VerticalLayout no Aling and use HorizontalLayout
        hlInfoSystem.addComponent(lSystem)
        hlInfoUser.addComponent(lUser)

        vlInfo.addComponent(hlInfoSystem)
        vlInfo.addComponent(hlInfoUser)

        return vlInfo
    }
}
