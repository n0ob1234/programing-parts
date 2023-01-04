package partsPackage;

public class URL {

	private String url;
	private boolean isFixed = false;
	public int page;
	
	public URL(String url) {
		super();
		this.url = url;
		
	}
	
	
	
	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String fixUrl() {
		String[] split_url = url.split("_");
		String lastWord = split_url[split_url.length-1];
		if (lastWord.substring(0, lastWord.length()-1).equals("pgn=")) {
			isFixed = true;
			page = 0;
			String next = url.substring(0,url.length()-1)+Integer.toString(page);
			url = next;
			return next;
		}
		else {
			String finalUrl = url+"?_png=0";
			page = 0;
			url = finalUrl;
			return finalUrl;
		}
				
		
	}
	public String nextPage() {
		if(isFixed) {
			page++;
			System.out.println(page);
			System.out.println(url.substring(0,url.length()-1));
			String next = url.substring(0,url.length()-1)+page;
			url = next;
			return next;
		}
		else {
			System.out.println("You can't add a page until you fix the url.");
			return null;
		}
		
		
	}
}

//url
//https://www.ebay.com/b/Camera-Photo-Mixed-Lots/45089/bn_1865051?_pgn=2

