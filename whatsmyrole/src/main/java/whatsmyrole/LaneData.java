package whatsmyrole;

public class LaneData {
		
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
	
	
	
	public static String[] doesNotExist(Champion[] champion) {
		// Fill this with love
		return null;
	}

	public static double getPercentage(Champion champion, Role r) {
		// TODO: pass the information
		return Math.random();
	}
	
	public static void init() {
		// Download information and store them
	}
}