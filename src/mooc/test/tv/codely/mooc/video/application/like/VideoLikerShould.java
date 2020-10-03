package tv.codely.mooc.video.application.like;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.video.domain.VideoLiked;
import tv.codely.shared.domain.EventBus;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

final class VideoLikerShould {
    @Test
    void publish_the_video_liked_domain_event() {
        final EventBus eventBus = mock(EventBus.class);
        final var videoLiker = new VideoLiker(eventBus);

        final var videoTitle = "\uD83C\uDF89 New YouTube.com/CodelyTV video title";
        final var userId = "This should be the video description \uD83D\uDE42";

        videoLiker.like(videoTitle, userId);

        final var expectedVideoLiked = new VideoLiked(videoTitle, userId);

        verify(eventBus).publish(List.of(expectedVideoLiked));
    }

}
