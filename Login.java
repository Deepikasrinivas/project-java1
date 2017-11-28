package org.login;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity(name="LOGIN_DETAILS")
public class Login {
		@Column(name="User_name")
		private String User_name;
		@Column(name="Password")
		private String Password;
		public String getUser_name() {
			return User_name;
		}
		public void setUser_name(String user_name) {
			User_name = user_name;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		

}
