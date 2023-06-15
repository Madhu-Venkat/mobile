package com.example.mobiledemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.mobiledemo.Repository.mobiledemoRepository;
import com.example.mobiledemo.model.mobiledemo;

import jakarta.transaction.Transactional;

@Service
public class mobiledemoService {
	@Autowired
mobiledemoRepository md;

public List<mobiledemo> getAllDetails(){
	return md.findAll();
}
public mobiledemo saveDetails(@RequestBody mobiledemo id) {
	return md.save(id);
}
public mobiledemo putDetails(@RequestBody mobiledemo id) {
	return md.save(id);
}
public mobiledemo getDetailsById(@PathVariable int id)
{
	return md.findById(id).orElse(null);
}
public void deleteById(@PathVariable int id) {
	md.deleteById(id);
}
public List<mobiledemo> sortDesc(String brand)
{
	return md.findAll(Sort.by(brand).descending());
}
public List<mobiledemo> paginationData(int pnu,int psize)
{
	Page<mobiledemo> p=md.findAll(PageRequest.of(pnu, psize));
			return p.getContent();
}
public List<mobiledemo>paginationAndSorting(int pnu,int psize,String brand)
{
	Page<mobiledemo> p=md.findAll(PageRequest.of(pnu, psize,Sort.by(brand).descending()));
	return p.getContent();
}



public List<mobiledemo> getAllUsers() {
	// TODO Auto-generated method stub
	return md.findAll();
}
public String deletebook(int id) {
	md.deleteById(id);
	return "mobile Deleted";
}

public mobiledemo registery(mobiledemo id) {
// TODO Auto-generated method stub

return md.save(id);
}
@Transactional
public int updatedbook(int price,String model)
{
return md.updatemobile(price,model);
}
}
