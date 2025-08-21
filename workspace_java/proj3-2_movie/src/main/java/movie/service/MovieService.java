package movie.service;

import java.util.List;

import movie.dao.MovieDAO;
import movie.dto.MovieDTO;

public class MovieService {

	MovieDAO dao = new MovieDAO();
	
	public List<MovieDTO> getAll(){
		MovieDAO dao = new MovieDAO();
		List list = dao.selectAllMovie();
		return list;
	}
	
	public MovieDTO getOne(MovieDTO dto) {
		return dao.selectOne(dto);
	}
	
}
