package com.hcl.ing.adodenhaag.model;

import java.util.Objects;

public class LoginResponse {

	private String role;
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public LoginResponse(String role, String userId) {
		this.role = role;
		this.userId = userId;
	}

	public LoginResponse() {
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		LoginResponse that = (LoginResponse) o;
		return role.equals(that.role) && userId.equals(that.userId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(role, userId);
	}

	@Override
	public String toString() {
		return "LoginResponse{" + "role='" + role + '\'' + ", userId='" + userId + '\'' + '}';
	}
}
