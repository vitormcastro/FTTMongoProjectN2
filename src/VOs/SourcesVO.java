package VOs;

public class SourcesVO {

	private String category;
	private String country;
	private String language;
	
	
	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public SourcesVO() {
		// TODO Auto-generated constructor stub
		
	}


	public SourcesVO(String category, String country, String language) {
		super();
		this.category = category;
		this.country = country;
		this.language = language;
	}
	
	

}
