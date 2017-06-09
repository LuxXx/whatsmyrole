package whatsmyrole;

import java.io.IOException;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class LaneData {
	
	private static int count = 0;
	
	private static String URL = "http://champion.gg/champion/";
	private static String[] champions = {
			"Aatrox","Ahri","Akali","Alistar","Amumu","Anivia","Annie","Ashe","Aurelion Sol","Azir",
			"Bard","Blitzcrank","Brand","Braum", "Caitlyn","Camille","Cassiopeia","Cho'Gath","Corki",
			"Darius","Diana","Dr Mundo","Draven","Ekko","Elise","Evelynn","Ezreal","Fiddlesticks","Fiora",
			"Fizz","Galio","Gangplank","Garen","Gnar","Gragas","Graves","Hecarim","Heimerdinger","Illaoi",
			"Irelia","Ivern","Janna","Jarvan IV","Jax","Jayce","Jhin","Jinx","Kalista","Karma","Karthus",
			"Kassadin","Katarina","Kayle","Kennen","Kha'Zix","Kindred","Kled","Kog'Maw","LeBlanc","Lee Sin",
			"Leona","Lissandra","Lucian","Lulu","Lux","Malphite","Malzahar","Maokai","Master Yi",
			"Miss Fortune","Mordekaiser","Morgana","Nami","Nasus","Nautilus","Nidalee","Nocturne",
			"Nunu","Olaf","Orianna","Pantheon","Poppy","Quinn","Rakan","Rammus","Rek'Sai","Renekton",
			"Rengar","Riven","Rumble","Ryze","Sejuani","Shaco","Shen","Shyvana","Singed","Sion","Sivir",
			"Skarner","Sona","Soraka","Swain","Syndra","Tahm Kench","Taliyah","Talon","Taric","Teemo",
			"Thresh","Tristana","Trundle","Tryndamere","Twisted Fate","Twitch","Udyr","Urgot","Varus",
			"Vayne","Veigar","Vel'Koz","Vi","Viktor","Vladimir","Volibear","Warwick","Wukong","Xayah",
			"Xerath","Xin Zhao","Yasuo","Yorick","Zac","Zed","Ziggs","Zilean","Zyra"
	};
	
	private static HashMap<String, ChampionData> map = new HashMap<>();

	public static double getPercentage(Champion champion, Role r) {
		ChampionData cd = map.get(champion.getName());
				
		for (ChampionData.Role role : cd.roles) {
			String r1 = r.toString();
			String r2 = role.title.substring(0, 3).toUpperCase();
			if (r2.equals("JUN"))
				r2 = "JGL";
			
			if (r1.equals(r2))
				return role.percentPlayed;
		}
		return 0;
	}
	
	public static void init() {
		System.out.println("Trying to download ChampionData");
		Gson gson = new GsonBuilder().create();
		
		for (String champ : champions) {
			String json = downloadJSON(champ);
			ChampionData cd = gson.fromJson(json, ChampionData.class);
			String key = cd.name.replace("'", "").replace(".", "").toLowerCase();
			map.put(key, cd);
			System.out.println(cd);
		}
		System.out.println("Downloaded " + count + " Champions of " + champions.length);
	}
	public static String downloadJSON(String name) {
		try {
			Document d = Jsoup.connect(URL + name).get();
			count++;
			for (Element e : d.getAllElements()) {
				if (e.tagName().equals("script") && e.data().contains("matchupData.champion")) {
					return e.data().split("\n")[1].substring(25);
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "{}";
	}
}
