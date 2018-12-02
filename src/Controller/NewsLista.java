package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import NewsAPI.SourcesNewsAPI;
import VOs.SourcesVO;

/**
 * Servlet implementation class NewsLista
 */
@WebServlet(description = "Pega as noticias de acordo com o filtro", urlPatterns = { "/news/lista" })
public class NewsLista extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsLista() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String resp = "";
		try {
			SourcesVO svo = new SourcesVO(request.getParameter("category"),request.getParameter("country"),request.getParameter("language"));
			SourcesNewsAPI sapi = new SourcesNewsAPI();
			resp = sapi.GetNews(svo);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			resp = e.getMessage();
		}
		response.getWriter().print(resp);
        response.flushBuffer();
		
	}

}
