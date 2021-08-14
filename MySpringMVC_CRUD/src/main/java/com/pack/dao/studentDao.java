package com.pack.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pack.model.Student;

@Repository
@Transactional
public class studentDao extends JdbcDaoSupport {

	@Autowired
	public studentDao(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	public boolean addStudent(Student stud) {
		System.out.println("info: inside addStudent method in studentDao");
		String sql1 = "INSERT INTO student(stud_id,stud_name,stud_class,email,address) VALUES(?,?,?,?,?)";
		Object[] params = new Object[] { stud.getStudId(), stud.getStudName(), stud.getStudClass(),stud.getEmail(),stud.getAddress()};
		this.getJdbcTemplate().update(sql1, params);
		return true;
	}

	public List<Student> showStud() {
		System.out.println("info: inside showStud method in studentDao");
		String sql = "select * from student ";
		//String sql = "select stud_id, stud_name,stud_class, stud_address from student ";

		List<Student> studlist = this.getJdbcTemplate().query(sql, BeanPropertyRowMapper.newInstance(Student.class));
		System.out.println(studlist);
		return studlist;
	}

	public boolean deleteStudent(Integer studId) {
		System.out.println("info: inside deleteStudent method in studentDao");
		String sql = "delete from student where stud_id=?";
		Object[] params = new Object[] { studId };
		this.getJdbcTemplate().update(sql, params);
		return true;
	}

	public Student editStud(Integer studId) {
		System.out.println("info: inside editStud method in studentDao");
		String sql = "select * from student where stud_id=?";
		Object[] param = new Object[] { studId };
		Student stud = this.getJdbcTemplate().queryForObject(sql, param,
				new BeanPropertyRowMapper<Student>(Student.class));
		return stud;
	}

	public boolean updateStud(Student stud) {
		System.out.println("info: inside updateStud method in studentDao");
		String sql1 = "update student s set s.stud_name=?,s.stud_class=?,s.email=?,s.address=? where s.stud_id=?";
		Object[] params = new Object[] { stud.getStudName(), stud.getStudClass(),stud.getEmail(),stud.getAddress(),stud.getStudId()};
		this.getJdbcTemplate().update(sql1, params);
		return true;
	}

}
