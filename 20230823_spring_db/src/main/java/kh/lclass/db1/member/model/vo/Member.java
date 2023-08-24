package kh.lclass.db1.member.model.vo;

import org.springframework.stereotype.Component;

@Component
public class Member {
	private String mid;
	private String mpwd;
	private String mnmae;
	private String meamil;
	@Override
	public String toString() {
		return "Member [mid=" + mid + ", mpwd=" + mpwd + ", mname=" + mnmae + ", memail=" + meamil + "]";
	}
	public Member(String mid, String mpwd, String mnmae, String meamil) {
		super();
		this.mid = mid;
		this.mpwd = mpwd;
		this.mnmae = mnmae;
		this.meamil = meamil;
	}
	public Member() {
		super();
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpwd() {
		return mpwd;
	}
	public void setMpwd(String mpwd) {
		this.mpwd = mpwd;
	}
	public String getMnmae() {
		return mnmae;
	}
	public void setMname(String mnmae) {
		this.mnmae = mnmae;
	}
	public String getMeamil() {
		return meamil;
	}
	public void setMeamil(String meamil) {
		this.meamil = meamil;
	}
	
}
