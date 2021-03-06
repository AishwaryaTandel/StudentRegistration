package com.bean;

public class Student {

		private String studentId;
		private String firstName;
		private String lastName;
		private int age;
		private String gender;
		public Student() {
			super();
		}

		public Student(String studentId, String firstName, String lastName, int age, String gender) {
			super();
			this.studentId = studentId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.gender = gender;
		}
		
		public String getStudentId() {
			return studentId;
		}
		public void setStudentId(String studentId) {
			this.studentId = studentId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}
		
		
}
