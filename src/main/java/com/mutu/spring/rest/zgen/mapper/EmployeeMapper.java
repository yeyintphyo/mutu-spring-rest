package com.mutu.spring.rest.zgen.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.mutu.spring.rest.zgen.entity.Employee;
import com.mutu.spring.rest.zgen.entity.EmployeeExample;

public interface EmployeeMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbggenerated
	 */
	int countByExample(EmployeeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbggenerated
	 */
	int deleteByExample(EmployeeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Long employeeId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbggenerated
	 */
	int insert(Employee record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbggenerated
	 */
	int insertSelective(Employee record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbggenerated
	 */
	List<Employee> selectByExampleWithRowbounds(EmployeeExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbggenerated
	 */
	List<Employee> selectByExample(EmployeeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbggenerated
	 */
	Employee selectByPrimaryKey(Long employeeId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Employee record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Employee record);
}