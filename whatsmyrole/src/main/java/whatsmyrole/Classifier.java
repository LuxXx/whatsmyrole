package whatsmyrole;

public class Classifier {
		
	public static Role classify(Champion[] champions) {
		double[] w = {0, 0, 0, 0, 0};
		
		for (Champion champion : champions) {
			for (Role r : Role.values()) {
				w[r.ordinal()] = LaneData.getPercentage(champion, r);
			}
		}
		
		return Role.values()[maxIndex(w)];
	}
	
	private static int maxIndex(double... doubles) {
		int maxId = 0;
		
		for (int i = 0; i < doubles.length; i++) {
			if (doubles[i] > doubles[maxId]) {
				maxId = i;
			}
		}
		
		return maxId;
	}
}
