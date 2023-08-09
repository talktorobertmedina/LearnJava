package main;

public class Session {
	private final String SESSION_TOKEN;
	private final String CREATE_DATE;
	private final String EXPIRE_DATE;
	
	public Session(String sessionToken, String createDate, String expireDate) {
		this.SESSION_TOKEN = sessionToken;
		this.CREATE_DATE = createDate;
		this.EXPIRE_DATE = expireDate;
	}

	public String getSESSION_TOKEN() {
		return SESSION_TOKEN;
	}

	public String getCREATE_DATE() {
		return CREATE_DATE;
	}

	public String getEXPIRE_DATE() {
		return EXPIRE_DATE;
	}
}
