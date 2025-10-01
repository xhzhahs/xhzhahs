package kr.or.human4.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import kr.or.human4.dto.EmpDTO;

// mapper.xml과 연결하기 위한 어노테이션
@Mapper
public interface EmpMapperDAO {

	// 메소드명을 mapper의 id값과 동일하게 사용
	List<EmpDTO> selectEmp();
	
	// @Select @Insert @Update @Delete 도 사용 가능.
	// 기본값은 이렇게 적힌다.
	@Select("select * from emp where empno = #{empno}")
	EmpDTO detail(@Param("empno") int empno);
	
	@Select("select * from emp where empno = #{a}")
	// #{} 안에 이름과 Param()안에 이름은 같아야함.
	EmpDTO detail1(@Param("a") int empno);

	@Select("select * from emp where empno = #{empno}")
//	EmpDTO detail2(@Param("empno") int empno);
	// 만약 #{} 안에 내용과 변수명이 같다면 Param 생략가능
	EmpDTO detail2(int empno);
}
