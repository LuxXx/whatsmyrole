package whatsmyrole;

import java.util.ArrayList;
import java.util.List;

public class ChampionData {
	public String key;
	public String role;
	public String roleTitle;
	public String name;
	public int id;
	public List<Role> roles = new ArrayList<Role>();
	
	public class Role {
		public String role;
		public String title;
		public double percentPlayed;
		public int games;
		@Override
		public String toString() {
			return "{" + role + " " + title + " " + percentPlayed + " " + games + "}";
		}
	}
	@Override
	public String toString() {
		return name + " " + key + " " + role + " " + roleTitle + " " + id + roles;
	}
}
