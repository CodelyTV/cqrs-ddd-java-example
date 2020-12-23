package tv.codely.mooc.video.application.publish;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

import tv.codely.mooc.video.domain.Clock;
import tv.codely.mooc.video.infrastructure.CurrentClock;

final class CurrentSeasonShould {

	@Test
	void return_winter() {
		final Clock clock = mock(CurrentClock.class);
		final var currentSeason = new CurrentSeason(clock);
		
		when(clock.now()).thenReturn(LocalDate.of(2021, Month.JANUARY, 1));

		assertEquals("Winter", currentSeason.check());
	}
	
	@Test
	void return_summer() {
		final Clock clock = mock(CurrentClock.class);
		final var currentSeason = new CurrentSeason(clock);
		
		when(clock.now()).thenReturn(LocalDate.of(2021, Month.JUNE, 23));

		assertEquals("Summer", currentSeason.check());
	}

}
