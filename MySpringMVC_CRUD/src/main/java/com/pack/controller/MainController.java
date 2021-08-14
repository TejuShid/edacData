package com.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pack.dao.studentDao;
import com.pack.model.Student;

@Controller
public class MainController {

	@Autowired
	private studentDao studDao;

	@RequestMapping("/")
	public ModelAndView home(ModelAndView model, @ModelAttribute Student stud) {
		System.out.println("info: inside home method");
		model.addObject("stud", stud);
		List<Student> studlist = studDao.showStud();
		System.out.println(studlist);

		model.addObject("studlist", studlist);
		model.setViewName("index");
		return model;
	}

	@RequestMapping("/addStud")
	public ModelAndView addStud(@ModelAttribute Student stud, Model model, ModelAndView model1) {
		System.out.println("info: inside addStud method");
		model1.addObject("stud", new Student());
		boolean isaddStude = studDao.addStudent(stud);
		if (isaddStude == true) {
			model.addAttribute("sMsg", "Successfully Store");
		} else {
			model.addAttribute("eMsg", "Not Store");
		}
		List<Student> studlist = studDao.showStud();
		model1.addObject("studlist", studlist);
		model1.setViewName("index");
		return model1/* "redirect:/" */;
	}

	@RequestMapping("/deleteStud")
	public ModelAndView deleteStud(@RequestParam Integer studId, ModelAndView model) {
		System.out.println("info: inside deleteStud method");
		Student stud = new Student();
		model.addObject("stud", stud);
		boolean isDelete = studDao.deleteStudent(studId);
		if (isDelete == true) {
			model.addObject("sMsg", "Successfully Delete");
		} else {
			model.addObject("sMsg", "Unable to Delete");
		}
		List<Student> studlist = studDao.showStud();
		model.addObject("studlist", studlist);
		model.setViewName("index");
		return model;
	}

	@RequestMapping("/editStud")
	public ModelAndView editStud(@RequestParam Integer studId, ModelAndView model) {
		System.out.println("info: inside editStud method");
		Student stud = studDao.editStud(studId);
		model.addObject("stud", stud);
		model.setViewName("editForm");
		return model;
	}

	@RequestMapping("/updateStud")
	public ModelAndView updateStud(@ModelAttribute Student stud, ModelAndView model) {
		model.addObject("stud", new Student());
		System.out.println("info: inside updateStud method");
		boolean isUpdate = studDao.updateStud(stud);
		if (isUpdate == true) {
			model.addObject("sMsg", "Updated Successfully");
		} else {
			model.addObject("sMsg", "Unable to update");
		}
		List<Student> studlist = studDao.showStud();
		model.addObject("studlist", studlist);
		model.setViewName("index");
		return model;
	}
}
