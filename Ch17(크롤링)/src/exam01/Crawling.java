package exam01;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling {

	public static void main(String[] args) {
		
		String url = "https://www.melon.com/chart/index.htm"; //农费傅且 林家
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		Elements element = doc.select("table");
		
		Iterator<Element> iterator = element.select("tr").iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next().text());
		}
		
		
		
	}
	
}
