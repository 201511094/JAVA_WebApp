package kr.spring.ch09.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class MemberCommand {
	@NotEmpty
	private String id;
	@Size(min=4,max=10)
	private String password;
	@NotEmpty
	private String name;
	@NotEmpty
	private String birth;
	@Range(min=1,max=200)
	private int age;
	@Email
	@NotEmpty
	private String email;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MemberCommand [id=" + id + ", password=" + password + ", name=" + name + ", birth=" + birth + ", age="
				+ age + ", email=" + email + "]";
	}
	
}