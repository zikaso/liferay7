package persona.portlet;

import persona.constants.PersonaPortletKeys;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;


import PersonaService.model.Persona;
import PersonaService.service.PersonaLocalService;
import PersonaService.service.PersonaLocalServiceUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author zakaria
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Persona",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PersonaPortletKeys.PERSONA,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PersonaPortlet extends MVCPortlet {
	
	@Reference
    private PersonaLocalService personaLocalService ;
	
	public void addPersona(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		   String frsitname=ParamUtil.get(actionRequest, "firstName", "");
		   String lastname=ParamUtil.get(actionRequest, "lastName", "");
		   String age=ParamUtil.get(actionRequest, "age", "");
		
		   Persona persona=personaLocalService.createPersona(CounterLocalServiceUtil.increment());
		   persona.setFristName(frsitname); persona.setLastName(lastname);
		   persona.setAge(Integer.valueOf(age));
		   personaLocalService.addPersona(persona);
		 
		
		
	}
}