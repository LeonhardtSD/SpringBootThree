package com.gaozhaoxi.springbootthree;

import com.gaozhaoxi.springbootthree.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@SpringBootApplication
public class SpringBootThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThreeApplication.class, args);
	}

	@RequestMapping(value = "/hello")
	public String index(Model model){
		Person single=new Person("aa",11);
		List<Person> people=new ArrayList<Person>();

		Person p1=new Person("zhangsan",21);
		Person p2=new Person("lisi",23);
		Person p3=new Person("wangwu",32);
		people.add(p1);
		people.add(p2);
		people.add(p3);
		model.addAttribute("singlePerson",single);
		model.addAttribute("people",people);
		return "index";

	}
}

