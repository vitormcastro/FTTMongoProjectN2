package NewsAPI;

import java.io.IOException;

import VOs.SourcesVO;

public class SourcesNewsAPI {

	private String uniqueKey;
	
	public SourcesNewsAPI() {
		// TODO Auto-generated constructor stub
		uniqueKey = "sources?";
	}
	
	public String GetNews(SourcesVO search) throws IOException {
		String params = uniqueKey +"category="+search.getCategory()+"&language="+search.getLanguage()+"&country="+search.getCountry();
		RequestNewsAPI request = new RequestNewsAPI();
		return request.GetNews(params);
		
		
	}

}
