package tv.codely.mooc.notification.application.like;

import tv.codely.mooc.video.domain.VideoLiked;
import tv.codely.shared.application.DomainEventSubscriber;

public class SendPushToSubscribersOnVideoLiked implements DomainEventSubscriber<VideoLiked> {
    @Override
    public Class<VideoLiked> subscribedTo() {
        return VideoLiked.class;
    }

    @Override
    public void consume(VideoLiked event) {
        System.out.println(
            String.format(
                "Hey! User with ID <%s> liked video with title <%s>",
                event.userId(),
                event.title()
            )
        );
    }
}
