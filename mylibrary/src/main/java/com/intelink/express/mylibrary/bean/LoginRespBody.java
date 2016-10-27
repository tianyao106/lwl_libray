package com.intelink.express.mylibrary.bean;

public class LoginRespBody {
	private String UserId; // 登录用户代号
	private String UserName; // 登录用户名称
	private String SiteId; // 登录网点代码
	private String SiteName; // 登录网点代名称
	private String CompanyName; //所属公司名称
	private int UserType; // 用户类型
	private String Token; // 登录令牌
	private String DataInfo; // 待升级基本表记录数： 表名1:笔数1|表名2:笔数2

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getSiteId() {
		return SiteId;
	}

	public void setSiteId(String siteId) {
		SiteId = siteId;
	}

	public String getSiteName() {
		return SiteName;
	}

	public void setSiteName(String siteName) {
		SiteName = siteName;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public int getUserType() {
		return UserType;
	}

	public void setUserType(int userType) {
		UserType = userType;
	}

	public String getToken() {
		return Token;
	}

	public void setToken(String token) {
		Token = token;
	}

	public String getDataInfo() {
		return DataInfo;
	}

	public void setDataInfo(String dataInfo) {
		DataInfo = dataInfo;
	}
}
