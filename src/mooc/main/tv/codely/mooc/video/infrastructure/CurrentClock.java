package tv.codely.mooc.video.infrastructure;

import java.time.LocalDate;

import tv.codely.mooc.video.domain.Clock;

public class CurrentClock implements Clock {

	@Override
	public LocalDate now() {
		return LocalDate.now();
	}

}
