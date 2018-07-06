package com.jh.spring_board_command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

/*게시판 안을 보는 커맨드 */
public class JContentsCommand implements Jcommand {

	@Override
	public void execute(Model model) {
	
		Map<String, Object> map = model.asMap(); // 모델에서 맵구한다.
		HttpServletRequest request = (HttpServletRequest) map.get("request"); 
		// map에서 request키 밸류 가져와서 캐스팅
		String bid = request.getParameter("bid");
		//클릭한 글의 내용을 bid 객체에 담아온다.

	}

}
