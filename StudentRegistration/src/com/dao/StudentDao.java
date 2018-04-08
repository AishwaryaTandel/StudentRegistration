package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.Student;

public class StudentDao {
	
	public static final String url="jdbc:oracle:thin:@localhost:1521:xe";
	public static final String username="system";
	public static final String password="manager";
	public Connection con=null;
	public ResultSet rs=null;
	
	
	public boolean registerStudent(com.bean.Student student) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,username,password);
			String insertQuery="insert into student values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(insertQuery);
			
			ps.setString(1,student.getStudentId());
			ps.setString(2,student.getFirstName());
			ps.setString(3,student.getLastName());
			ps.setInt(4,student.getAge());
			ps.setString(5, student.getGender());
			int count;
			count=ps.executeUpdate();
			if(count>0) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(ClassNotFoundException | SQLException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			if(con!=null) {
				try {
					con.close();
				}
				catch(SQLException ex) {
					System.out.println(ex.getMessage());
				}
			}
		}
		return false;
	}
	
	public boolean deleteStudent(String studentId) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,username,password);
			String insertQuery="delete from student where studentID=?";
			PreparedStatement ps=con.prepareStatement(insertQuery);
			
			ps.setString(1,studentId);
	
			int count;
			count=ps.executeUpdate();
			if(count>0) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(ClassNotFoundException | SQLException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			if(con!=null) {
				try {
					con.close();
				}
				catch(SQLException ex) {
					System.out.println(ex.getMessage());
				}
			}
		}
		return false;
	}
	
	public boolean updateStudent(com.bean.Student student) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,username,password);
			String insertQuery="update student set firstName=?,lastName=?,age=?,gender=? where studentID=?";
			PreparedStatement ps=con.prepareStatement(insertQuery);

			ps.setString(1,student.getFirstName());
			ps.setString(2,student.getLastName());
			ps.setInt(3,student.getAge());
			ps.setString(4, student.getGender());
			ps.setString(5, student.getStudentId());
			int count;
			count=ps.executeUpdate();
			if(count>0) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(ClassNotFoundException | SQLException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			if(con!=null) {
				try {
					con.close();
				}
				catch(SQLException ex) {
					System.out.println(ex.getMessage());
				}
			}
		}
		return false;
	}

	public List<Student> viewStudent(String lastName) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,username,password);
			String selectQuery="select * from student where lastName=?";
			PreparedStatement ps=con.prepareStatement(selectQuery);
			
			ps.setString(1,lastName);
			
			ResultSet rs= ps.executeQuery();
			List<Student> studentList = new ArrayList<Student>();
			
			while(rs.next()) {
				Student student=new Student();
				
				student.setStudentId(rs.getString("studentId"));
				student.setFirstName(rs.getString("firstName"));
				student.setLastName(rs.getString("lastName"));
				student.setAge(rs.getInt("age"));
				student.setGender(rs.getString("gender"));
				studentList.add(student);
			}
			return studentList;
			
		}
		catch(ClassNotFoundException | SQLException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			if(con!=null) {
				try {
					con.close();
				}
				catch(SQLException ex) {
					System.out.println(ex.getMessage());
				}
			}
		}
		
		return null;
	}
}
	
