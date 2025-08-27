package page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class pageService {

	pageDAO dao = new pageDAO();
	
	public Map getAll(EmpDTO dto) {
		int pagePerRows = dto.getPagePerRows();
		int page = dto.getPage();
		
		int start = 0
			, end = 0;
		
		// end는 한페이지에서 마지막 목록 번호
		// start는 한페이지에서 첫번째 목록 번호
		end = pagePerRows * page;	// 만약 10개씩 보여주고 현재 4페이지라면 마지막은 40
		start = end - (pagePerRows - 1);	// 시작은 40-(10-1)로 31
		
		dto.setStart(start);
		dto.setEnd(end);
		
		System.out.println(dto);
		
		List list = dao.selectAll(dto);
		int total = dao.selectTotal(dto);
		Map map = new HashMap();
		map.put("list", list);
		map.put("total", total);
		
		return map;
	}
	
}
