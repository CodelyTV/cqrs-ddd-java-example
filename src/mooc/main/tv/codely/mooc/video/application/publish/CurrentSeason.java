package tv.codely.mooc.video.application.publish;

	

import tv.codely.mooc.video.domain.Clock;

public final class CurrentSeason {
	private Clock clock;
	
	private static String seasons[] = {
			  "Winter", "Winter", "Spring", "Spring", "Summer", "Summer",  // not precise but :)
			  "Summer", "Summer", "Fall", "Fall", "Winter", "Winter"
			};
	
	CurrentSeason(Clock clock) {
		this.clock = clock;
	}
	
	public String check() {
		return seasons[ clock.now().getMonthValue() ];
	}
	
	

}
