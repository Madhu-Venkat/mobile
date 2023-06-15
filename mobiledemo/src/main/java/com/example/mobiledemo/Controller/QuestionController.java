package com.example.mobiledemo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mobiledemo.Repository.OneToManyRepo;
import com.example.mobiledemo.model.Question;

import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	OneToManyRepo qrepo;
	@PostMapping("/postmap")
	public String saveDetail(@RequestBody Question q)
	{
		qrepo.save(q);
		return "Data is saved";
	}
	@Tag(name="Get", description="updating data")
	@GetMapping("")
	public java.util.List<Question> getDetails()
	{
		return qrepo.findAll();
	}
	@Tag(name="Put",description="updating data")
	@PutMapping("")
	public String updateDetails(@RequestBody Question qu)
	{
		qrepo.saveAndFlush(qu);
		return "data updated";
	}
	@Tag(name="delete",description="Deleted details")
	@DeleteMapping("/{qno}")
	public String deleteDetails(@PathVariable int qno)
	{
		qrepo.deleteById(qno);
		return "qno "+qno+"is deleted";
	}
}