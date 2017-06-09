package whatsmyrole;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Champion {
	private String name;

	public Champion() {}
	
	public Champion(String name) {
		setName(name);
	}
	
	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name.toLowerCase().replace("'", "").replace(".", "");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Champion)) return false;
		return name.equals(((Champion) obj).name);
	}
	@Override
	public String toString() {
		return name;
	}
}
