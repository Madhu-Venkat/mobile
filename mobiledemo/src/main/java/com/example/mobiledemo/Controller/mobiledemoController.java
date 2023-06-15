package com.example.mobiledemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mobiledemo.Repository.mobiledemoRepository;
import com.example.mobiledemo.Service.mobiledemoService;
import com.example.mobiledemo.model.mobiledemo;
@CrossOrigin
@RestController("http://localhost:3005")
@RequestMapping("/mobile")
public class mobiledemoController {
	@Autowired
mobiledemoService ms;
	@Autowired
	mobiledemoRepository rep;
	@GetMapping("/auto")
	public List<mobiledemo>allDetails(){
		return ms.getAllDetails();
	}
	
	@PostMapping("/post")
   public mobiledemo saveAll(@RequestBody mobiledemo id) 
   {
		return ms.saveDetails(id);
   
	}


@GetMapping("/auto/{id}")
public mobiledemo getId(@PathVariable int id) {
	return ms.getDetailsById(id);
}
@DeleteMapping("/delete/{id}")
public String delete(@PathVariable int id) {
	ms.deleteById(id);
	return "Details Deleted";
}
@GetMapping("/sortdes/{brand}")
public List<mobiledemo> sortMobile(@PathVariable String brand)
{
	return ms.sortDesc(brand);
}
@GetMapping("/pagination/{pnu}/{psize}")
public List<mobiledemo> paginationData(@PathVariable("pnu") int pnu,@PathVariable("psize")int psize)
{
	return ms.paginationData(pnu, psize);
}
@GetMapping("/paginationandsortdes/{pnu}/{psize}/{brand}")
public List<mobiledemo>paginationSorting(@PathVariable("psize") int psize,@PathVariable("brand") String brand)
{
	return ms.paginationAndSorting(psize, psize, brand);
}

@GetMapping("/getmobile")
public List<mobiledemo> getAllUsers() {
	return ms.getAllUsers();
}
@DeleteMapping("/dltmobile/{id}")
public String deletedbook(@PathVariable int id) {
	return ms.deletebook(id);
}
@PostMapping("/regg")
public mobiledemo regidd(@RequestBody mobiledemo id) {
	
	
	return ms.registery(id);
	
}
@PutMapping("/editbook")
public String updatedbooks(@RequestParam int price,@RequestParam String model)
{
	
int result=ms.updatedbook(price, model);
if(result>0)
{
	return "mobile edited";
}
else
{
	return "not edited";
}
	
}
}
