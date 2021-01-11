package com.yogie.po;

/**
 * @program: spring
 * @Description: 学生
 * @Author: Chenyogie
 * @Date: 2021/1/11 14:29
 */
public class Student {
	private Integer id;
	private String name;
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
