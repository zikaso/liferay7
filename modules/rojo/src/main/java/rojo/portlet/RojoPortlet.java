package rojo.portlet;

import rojo.constants.RojoPortletKeys;

import com.az.dev.model.Cutomer;
import com.az.dev.service.CutomerLocalService;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

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
		"javax.portlet.display-name=Rojo",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + RojoPortletKeys.ROJO,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class RojoPortlet extends MVCPortlet {
	@Reference
    private CutomerLocalService cutomerLocalService ;
    
	@Override
		public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
				throws IOException, PortletException {
		Cutomer cutomer=cutomerLocalService.createCutomer(CounterLocalServiceUtil.increment() );
		cutomer.setAge("30");
		cutomer.setName("Azizi");
		cutomer.setEmail("azizi.zakaria@gmail.com");
		
		cutomerLocalService.addCutomer(cutomer);
		
		System.out.println( "*********************success added wawa cccccc   *********************	 ");
		
			// TODO Auto-generated method stub
			super.doView(renderRequest, renderResponse);
		}
}