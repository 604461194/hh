package accp.com.spring4.pojo;

public class Power {
//'powerId', 'powerName', 'roleId'
	//权限实体
	private int powerId;
	private String powerName;
	private int roleId;
	public int getPowerId() {
		return powerId;
	}
	public void setPowerId(int powerId) {
		this.powerId = powerId;
	}
	public String getPowerName() {
		return powerName;
	}
	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
}
