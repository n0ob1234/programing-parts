package partsPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		URL url = new URL("https://www.ebay.com/b/Camera-Photo-Mixed-Lots/45089/bn_1865051?_pgn=8");
		System.out.println(url.fixUrl());
		url.nextPage();
		
		System.out.println(url.getUrl());
		HashMap<Integer, Item> capitalCities = new HashMap<Integer, Item>();

		// Add keys and values (Country, City)
		capitalCities.put(0, new Item("somthing",(double)0));
		capitalCities.put(1, new Item("yoyo1idk",(double)1));
		capitalCities.put(2, new Item("yoyo2 idk ",(double)2));
		capitalCities.put(3, new Item("idk yoyo3",(double)3));

		
		String[] characters = "cat".split("");
		System.out.println(characters[1]);

		String html = "<h3 class=\"s-item__title s-item__title--has-tags\"><span class=\"BOLD\">Samsung ?Chromebook Laptop 11.6\" Laptop Intel Dual-Core 16GB SSD Wifi ?Webcam</span></h3>\n" + 
				"\n" + 
				"<h3 class=\"s-item__title s-item__title--has-tags\">Dell Latitude Laptop Computer Windows 10 Core i3 PC 8GB Ram 250GB HD WiFi DVD</h3>\n" + 
				"\n" + 
				"<h3 class=\"s-item__title s-item__title--has-tags\"><span class=\"BOLD\">Dell Latitude 3189 Windows 11 Laptop 2-in-1 tablet - 64GB SSD - 4GB 11.6 Touch</span></h3>\n" + 
				"\n" + 
				"<h3 class=\"s-item__title s-item__title--has-tags\"><span class=\"BOLD\">Dell Laptop Latitude Intel Core i5 16GB RAM 1TB HDD WIFI HDMI Windows 10 Pro PC</span></h3>\n" + 
				"\n" + 
				"<h3 class=\"s-item__title\">Dell Chromebook 11 3189 Touchscreen Laptop 2-in-1 11.6\" Celeron 4GB Ram 32GB SSD</h3>\n" + 
				"\n" + 
				"<h3 class=\"s-item__title\">HP 17-CN1053CL 17.3\" FHD IPS Laptop intel Core i5-1155G7 12GB 1TB Win11 4S324UA</h3>\n" + 
				"\n" + 
				"<h3 class=\"s-item__title\">Legion 5 Pro 16\" QHD Gaming Laptop 165Hz R7-6800H 16GB DDR5 1TB SSD RTX 3070Ti</h3>\n" + 
				"\n" + 
				"<h3 class=\"s-item__title\">Acer - Predator Helios 300 -&nbsp;15.6\" FHD 165Hz Gaming Laptop - Intel Core i7 - ...</h3>\n" + 
				"\n" + 
				"<h3 class=\"s-item__title\">ASUS - 2-in-1 14\" Touchscreen Chromebook - Intel Core M3-8100Y - 8GB Memory -...</h3>\n" + 
				"\n" + 
				"<h3 class=\"s-item__title\">Lenovo - Ideapad Gaming 3 15.6\" FHD Laptop - Ryzen 5 5600H - 8GB Memory - NVI...</h3>\n" + 
				"\n" + 
				"<h3 class=\"s-item__title\">Lenovo IdeaPad 3 14\" FHD Laptop Intel Core i5-1135G7 8GB RAM 512GB SSD</h3>\n" + 
				"\n" + 
				"<h3 class=\"s-item__title\">Lenovo IdeaPad 5 Laptop, 15.6\" FHD IPS Touch, Ryzen 5 5625U, 16GB, 512GB SSD</h3>\n" + 
				"\n" + 
				"<h3 class=\"s-item__title\">Lenovo IdeaPad 5 Laptop, 15.6\" FHD IPS Touch, Ryzen 7 5825U, 16GB, 1TB SSD</h3>\n" + 
				"\n" + 
				"<h3 class=\"s-item__title s-item__title--has-tags\">CHUWI 14.1'' Laptop Computer Windows 11 Home PC 2.8GHz 8GB 256GB SSD Intel N4020</h3>\n" + 
				"\n" + 
				"<h3 class=\"s-item__title s-item__title--has-tags\"><span class=\"BOLD\">Acer C738T Chromebook 2-in-1 Touch 360 Hinge 11.6\" Intel 1.6GHz 4GB 16GB SSD</span></h3>\n" + 
				"\n" + 
				"<h3 class=\"s-item__title s-item__title--has-tags\"><span class=\"BOLD\">HP ProBook 640 G1 14\" Laptop Intel Core i5-4300 CPU 8GB 500GB Windows 10</span></h3>\n" + 
				"\n" + 
				"<h3 class=\"s-item__title\">Lenovo IdeaPad 3 14 FHD Laptop Intel Core i7-1165G7 8GB RAM 512GB SSD</h3>\n" + 
				"\n" + 
				"<h3 class=\"s-item__title s-item__title--has-tags\"><span class=\"BOLD\">Samsung ?Chromebook Laptop 11.6\" Laptop Intel Dual-Core 16GB SSD Wifi ?Webcam</span></h3>";
		Text filter = new Text(html);
		;
		ArrayList<String> items = new ArrayList<String>();
		 
		System.out.println(filter.turnTextToTitle(50, 4, "idk").toString());
		System.out.println(filter.turnTextToTitle(50, 4, "idk").get(9));

	
	}



	
}

	
/**HashMap<Integer, Item> capitalCities = new HashMap<Integer, Item>();

// Add keys and values (Country, City)
capitalCities.put(0, new Item("somthing",(double)0));
capitalCities.put(1, new Item("yoyo1idk",(double)1));
capitalCities.put(2, new Item("yoyo2 idk ",(double)2));
capitalCities.put(3, new Item("idk yoyo3",(double)3));

System.out.println(sortItems(capitalCities, "idk").get(0).getName());
**/