package accp.com.spring4.shiro.realm;

import static org.junit.Assert.*;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

public class CustomRealmTest {

	@Test
	public void testDoGetAuthenticationInfoAuthenticationToken() {
		CustomRealm customRealm=new CustomRealm();
		
		DefaultSecurityManager defaultSecurityManager=new DefaultSecurityManager();
		defaultSecurityManager.setRealm(customRealm);
		
		SecurityUtils.setSecurityManager(defaultSecurityManager);
		Subject subject=SecurityUtils.getSubject();
		
		UsernamePasswordToken token=new UsernamePasswordToken("Make","123");
		subject.login(token);
		System.err.println("isAuthenticated:"+subject.isAuthenticated());
		
		subject.checkRole("admin");
		
		subject.checkPermissions("user:add","user:delete");
	}

}
