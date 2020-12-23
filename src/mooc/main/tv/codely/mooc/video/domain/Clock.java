package tv.codely.mooc.video.domain;

import java.time.Instant;
import java.time.LocalDate;

public interface Clock {
	public LocalDate now();

}
