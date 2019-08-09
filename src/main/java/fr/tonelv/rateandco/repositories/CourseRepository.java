package fr.tonelv.rateandco.repositories;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.tonelv.rateandco.dbconn.DbConn;
import fr.tonelv.rateandco.models.Course;
import javassist.bytecode.stackmap.BasicBlock;

public class CourseRepository implements ICourseRepository {
	private Connection conn;
	public CourseRepository()
	{
		conn = DbConn.getInstance().getConnection();
	}

	@Override
	public Course Create(Course course) {
		String sql = "INSERT INTO course(name,description,isActive) VALUES(?, ?, ?)";
		try
		{

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, course.getName());
			pstmt.setString(2, course.getDescription());
			pstmt.setBoolean(3,course.isActive() );
			pstmt.executeUpdate();
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return course;
	}

	@Override
	public Course Get(Integer id) {
		Course course = null;
		String sql = "SELECT * FROM courses WHERE id="+id;
		try
		{
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Course Update(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Delete(Integer id) {
		//delete from student where name='ravi'
		String sql = "DELETE FROM course WHERE id="+id;
		try
		{
			Statement statement = conn.createStatement();
			statement.executeUpdate(sql);
			return true;
		}catch (SQLException e)
		{
			System.out.println(e.getMessage());
			return false;
		}

	}

	@Override
	public ArrayList<Course> GetAll() {
		ArrayList<Course> courses = new ArrayList<>();

		String sql = "SELECT * FROM course";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next())
			{
				//public Course(Integer id, String name, String description, boolean isActive
				//System.out.println(rs.getInt("id") +" - " + rs.getString("name") + " - " + rs.getString("description") + " - " + rs.getString("isActive"));
				Course c = new Course(rs.getInt("Id"),rs.getString("name"),rs.getString("description"), rs.getBoolean("isActive"));
				courses.add(c);
			}
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}


		return courses;
	}

}
