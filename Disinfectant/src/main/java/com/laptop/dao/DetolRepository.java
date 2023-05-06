package com.laptop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.laptop.model.Detol;

@Repository
public interface DetolRepository extends JpaRepository<Detol,Integer> {
	List<Detol> findByManareaStartingWith(String prefix);
	List<Detol> findByManareaEndingWith(String suffix);
	List<Detol> findByClr(String clr);
	//positional parameter,order should match

			@Query("select s from Detol s where s.manarea=?1 and s.quantity=?2")

		     public List<Detol> getDetolByManarea(String manarea,String quantity);

	        //named parameter

	        @Query("select s from Detol s where s.manarea=:manarea")

		    public List<Detol> getDetolByManarea(String manarea);

			//DML

			@Modifying

			@Query("delete from Detol s where s.quantity=?1")

			public int deleteDetolByQuantity(String quantity);

	        @Modifying

	        @Query("update Detol s set s.manarea=?1 where s.quantity=?2")

	        public int updateDetolByQuantity(String manarea,String quantity);
	        @Query(value="select * from Detol m where m.quantity=?",nativeQuery=true)

	        public List<Detol> fetchDetolByQuantity(String Quantity);

}
