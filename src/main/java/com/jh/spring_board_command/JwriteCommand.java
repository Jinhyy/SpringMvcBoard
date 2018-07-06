package com.jh.spring_board_command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.jh.spring_board_dao.JDao;

public class JwriteCommand implements Jcommand {

	// Jwrite ¡÷ºÆ
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String jName=request.getParameter("jName");
		String jTitle=request.getParameter("jTitle");
		String jContent=request.getParameter("jContent");
		
		JDao dao = new JDao();
		dao.write(jName,jTitle,jContent);
	}

}
