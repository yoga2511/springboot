package com.laptop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.laptop.dao.DetolRepository;
import com.laptop.model.Detol;

import jakarta.transaction.Transactional;

@Service
public class DetolService {
	@Autowired
	DetolRepository c;
	public List<Detol> getAllValues()
	{
		List<Detol> d=c.findAll();
		return d;
	}
	public Detol saveFile(Detol s)
	{
		Detol f=c.save(s);
		return f;
	}
	public Detol updateFile(Detol s)
	{
		Detol f=c.save(s);
		return f;
	}
	public void del(int batno)
	{
		c.deleteById(batno);
	}
	public List<Detol> sort(String manarea)
	{
		return c.findAll(Sort.by(manarea).descending());
	}
	
	public List<Detol> paginate(int offset,int pageSize )
	{
		Page<Detol> f=c.findAll(PageRequest.of(offset,pageSize));
		return f.getContent();
	}
	public List<Detol> paginateAndSorting(int offset,int pageSize,String manarea)
	{
		Page<Detol> f=c.findAll(PageRequest.of(offset,pageSize,Sort.by(manarea).descending()));
		return f.getContent();
	}
	public List<Detol> fetchDetolByManareaPrefix(String prefix) 
	{
       return c.findByManareaStartingWith(prefix);
	}
    public List<Detol> fetchDetolByManareaSuffix(String suffix) 
	{
		return c.findByManareaEndingWith(suffix);
	}
    public List<Detol> getDetolByManarea(String manarea,String quantity)

	  {

		  return c.getDetolByManarea(manarea,quantity);

	  }

	@Transactional 

	public int deleteDetolByQuantity(String quantity)

	{

   	return c.deleteDetolByQuantity(quantity);

	}

	@Transactional

	public int updateDetolByQuantity(String manarea,String quantity)

	{

		return c.updateDetolByQuantity(manarea,quantity);

	}
	public List<Detol> fetchDetolByQuantity(String quantity) 
	{

		return c.fetchDetolByQuantity(quantity);
		
	}
	

}
