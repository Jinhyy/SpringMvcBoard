package com.jh.spring_board_command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.jh.spring_board_dao.JDao;
import com.jh.spring_board_dto.JDto;

public class JlistCommand implements Jcommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		JDao dao = new JDao();
		ArrayList<JDto> dtos = dao.list();
		
		model.addAttribute("list",dtos);
		
		
	}

}
