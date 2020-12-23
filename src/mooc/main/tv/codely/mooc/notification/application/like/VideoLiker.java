package tv.codely.mooc.video.application.like;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import tv.codely.mooc.shared.user.domain.UserId;
import tv.codely.mooc.video.domain.VideoLike;
import tv.codely.mooc.video.domain.VideoTitle;
import tv.codely.shared.domain.EventBus;

@AllArgsConstructor
public final class VideoLiker {
    private final EventBus eventBus;
    
    public void like(String rawTitle, String rawUserId) {
        final var title = new VideoTitle(rawTitle);
        final var userId = new UserId(rawUserId);

        final var videoLike = VideoLike.like(title, userId);
        
        eventBus.publish(videoLike.pullDomainEvents());
    }


}
