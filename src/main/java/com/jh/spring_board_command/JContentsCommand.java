package com.jh.spring_board_command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

/*�Խ��� ���� ���� Ŀ�ǵ� */
public class JContentsCommand implements Jcommand {

	@Override
	public void execute(Model model) {
	
		Map<String, Object> map = model.asMap(); // �𵨿��� �ʱ��Ѵ�.
		HttpServletRequest request = (HttpServletRequest) map.get("request"); 
		// map���� requestŰ ��� �����ͼ� ĳ����
		String bid = request.getParameter("bid");
		//Ŭ���� ���� ������ bid ��ü�� ��ƿ´�.

	}

}
