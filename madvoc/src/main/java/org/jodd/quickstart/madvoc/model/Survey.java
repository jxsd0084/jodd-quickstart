package org.jodd.quickstart.madvoc.model;

public class Survey {

	private String name;
	private int age;

	private int projectsCount;
	private String projectName;

	private boolean likeJodd;
	private String comment;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getProjectsCount() {
		return projectsCount;
	}

	public void setProjectsCount(int projectsCount) {
		this.projectsCount = projectsCount;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public boolean isLikeJodd() {
		return likeJodd;
	}

	public void setLikeJodd(boolean likeJodd) {
		this.likeJodd = likeJodd;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}