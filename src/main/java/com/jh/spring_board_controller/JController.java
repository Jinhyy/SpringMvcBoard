package com.jh.spring_board_controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jh.spring_board_command.JContentsCommand;
import com.jh.spring_board_command.JDeleteCommand;
import com.jh.spring_board_command.Jcommand;
import com.jh.spring_board_command.JlistCommand;
import com.jh.spring_board_command.JmodifyCommand;
import com.jh.spring_board_command.JreplyCommand;
import com.jh.spring_board_command.JreplyViewCommand;
import com.jh.spring_board_command.JwriteCommand;

// 주석추가
@Controller
public class JController {
	
	Jcommand command; 
	@RequestMapping("/list")
	public String list(Model model) {
		command = new JlistCommand();
		command.execute(model);
		return "list";
	}
	
	@RequestMapping("/write_view")
	public String write_view(Model model) {
		System.out.println("write_view()");
		return "write_view";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model)
	{
		System.out.println("write()");
		model.addAttribute("request",request);
		
		command = new JwriteCommand();
		command.execute(model);
		return "redirect:list";
	}
	
	@RequestMapping("content_view")
	public String content_view(HttpServletRequest request, Model model)
	{
		System.out.println("content_view");
		
		model.addAttribute("request", request);
		command = new JContentsCommand();
		command.execute(model);
		
		return "content_view";
	}
	
	@RequestMapping(value = "/modify", method=RequestMethod.POST)
	//post 방식으로 받는 예시
	public String modify(HttpServletRequest request, Model model)
	{
		System.out.println("modify()");
		
		model.addAttribute("request", request);
		command = new JmodifyCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/reply_view")
	public String reply_view(HttpServletRequest request, Model model)
	{
		System.out.println("reply_view()");
		
		model.addAttribute("request", request);
		command = new JreplyViewCommand();
		command.execute(model);
		
		return "reply_view";
	}
	
	@RequestMapping("/reply")
	public String reply(HttpServletRequest request, Model model)
	{
		System.out.println("reply()");
		
		model.addAttribute("request", request);
		command = new JreplyCommand();
		command.execute(model);
		
		return "reply";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model)
	{
		System.out.println("reply_view()");
		
		model.addAttribute("request", request);
		command = new JDeleteCommand();
		command.execute(model);
		
		return "delete";
	}
}

