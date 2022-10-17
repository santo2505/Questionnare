package com.nttdata.model;

import java.util.Objects;

public class Login {

	private String uemail;
	private String password;
	
	
	public Login() {
		
	}

	public Login(String uemail, String password) {
		super();
		this.uemail = uemail;
		this.password = password;
		
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        Login user = (Login) o;
        return Objects.equals(uemail, user.uemail) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uemail, password);
                       
    }
}
