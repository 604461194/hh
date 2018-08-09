package accp.com.spring4.shiro.realm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import accp.com.spring4.pojo.Power;
import accp.com.spring4.pojo.Role;
import accp.com.spring4.pojo.User;
import accp.com.spring4.service.PowerService;
import accp.com.spring4.service.RoleService;
import accp.com.spring4.service.UserService;

public class CustomRealm extends AuthorizingRealm{
	//登录
	@Autowired
	UserService userService;
	//角色
	@Autowired
	RoleService roleService;
	//权限
	@Autowired
	PowerService powerService;
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
	System.err.println("AuthorizationInfo");
		// TODO Auto-generated method stub
		String userName=(String) principalCollection.getPrimaryPrincipal();
		//获取数据库用户Id
		int userId=getPasswordByUserName(userName).getUserId();
		//从数据库或缓存中获得角色
		Set<String> roles=getRolesByUserName(userId);
		//获得权限
		Set<String> permissions=getPermissionsByUserName(userId);
		
		SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
		simpleAuthorizationInfo.setStringPermissions(permissions);
		simpleAuthorizationInfo.setRoles(roles);
		return simpleAuthorizationInfo;
	}

	private Set<String> getPermissionsByUserName(int userId) {
		List<Role> list=this.roleService.findRole(userId);
		List<Power> power=this.powerService.findPower(list.get(0).getRoleId());
		Set<String> sets=new HashSet<String>();
		for (Power power2 : power) {
			sets.add(power2.getPowerName());
		}
		return sets;
	}

	//获得角色集合
	private Set<String> getRolesByUserName(int userId) {
		List<Role> list=this.roleService.findRole(userId);
		System.err.println(list.get(0).getRoleName());
		Set<String> sets=new HashSet<String>();
			sets.add(list.get(0).getRoleName());
		return sets;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		//从主体传过来的认证信息中，获得用户名
		String userName=(String) authenticationToken.getPrincipal();
		//通过密码获得用户名
		String password=getPasswordByUserName(userName).getUserPwd();
		
		if(password==null) {
			return null;
		}
		SimpleAuthenticationInfo simpleAuthenticationInfo=new  SimpleAuthenticationInfo(userName, password,"customRealm");//SimpleAuthenticationInfo(principal:"make",password,realmName:"customRealm");
		return simpleAuthenticationInfo;
	}
	
	//模拟数据库
	private User getPasswordByUserName(String userName) {
		List<User> user= this.userService.findUser(userName);
		return user.get(0);
	}

}
