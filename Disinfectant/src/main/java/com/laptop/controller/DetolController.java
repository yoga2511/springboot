package com.laptop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.laptop.model.Detol;
import com.laptop.service.DetolService;


@RestController
public class DetolController {
	@Autowired
	DetolService f;
	@GetMapping(value="/fetch")
	public List<Detol> getAllValues()
	{
		List<Detol> d=f.getAllValues();
		return d;
	}
	@PostMapping(value="/post")
	public Detol saveFile(@RequestBody Detol s)
	{
		return f.saveFile(s);
	}
	@PutMapping(value="/put") 
	public Detol updateFile(@RequestBody Detol s)
	{
		return f.updateFile(s);
	}
	@DeleteMapping(value="/delete/{b}")
	public void del(@PathVariable("b") Integer batno)
	{
		f.del(batno);
	}
	@GetMapping(value="/sort/{manarea}")
	public List<Detol> sort(@PathVariable("manarea") String manarea)
	{
		return f.sort(manarea);
	}
	@GetMapping(value="/paginate/{offset}/{pageSize}")
	public List<Detol> paginate(@PathVariable("offset") int offset,@PathVariable("pageSize") int pageSize)
	{
		return f.paginate(offset, pageSize);
	}
	@GetMapping(value="/paginAndSortingDetol/{offset}/{pageSize}/{manarea}")
	public List<Detol> paginateAndSorting(@PathVariable("offset") int offset,@PathVariable("pageSize")int pageSize,@PathVariable("manarea") String manarea)
	{
		return f.paginateAndSorting(offset,pageSize,manarea);
	}
	@GetMapping("/fetchPrefix")
	public List<Detol> fetchDetolByManareaPrefix(@RequestParam String prefix)
	{
		return f.fetchDetolByManareaPrefix(prefix);
	}
	@GetMapping("/fetchSuffix")
	public List<Detol> fetchDetolByManareaSuffix(@RequestParam String suffix)
	{
		return f.fetchDetolByManareaSuffix(suffix);
	}
	@DeleteMapping("/deleteDetolByQuantity/{quantity}")

    public String deleteDetolByQuantity(@PathVariable String quantity)

    {

 	   int result = f.deleteDetolByQuantity(quantity);

 	   if(result>0)

 		     return "Quantity record deleted";

 	   else

 		     return "Problem occured while deleting";

    }

    @PutMapping("/updateDetolByQuantity/{manarea}/{quantity}")

    public String updateDetolByQuantity(@PathVariable String manarea,String quantity)

    {

 	   int res = f.updateDetolByQuantity(manarea, quantity);

 	   if(res>0)

 		      return "Quantity record updated";

 	   else

 		    return "Problem occured";

    }
    @GetMapping("/fetchDetolByQuantity/{quantity}")

    public List<Detol> fetchDetolByQuantity(@PathVariable String quantity)

    {

    	return f.fetchDetolByQuantity(quantity);

    }

}
