package accp.com.spring4.pojo;

public class Role {
	//角色实体
	//'roleId', 'roleName', 'userId'
	private int roleId;
	private String roleName;
	private int userId;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}