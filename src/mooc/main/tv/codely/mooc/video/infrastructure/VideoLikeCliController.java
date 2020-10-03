package tv.codely.mooc.video.infrastructure;

import tv.codely.mooc.notification.application.like.SendPushToSubscribersOnVideoLiked;
import tv.codely.mooc.video.application.like.VideoLiker;
import tv.codely.shared.application.DomainEventSubscriber;
import tv.codely.shared.domain.EventBus;
import tv.codely.shared.infrastructure.bus.ReactorEventBus;

import java.util.Set;

public class VideoLikeCliController {
    public static void main(String[] args) {
        final Set<DomainEventSubscriber> subscribers = Set.of(
            new SendPushToSubscribersOnVideoLiked()
        );
        final EventBus eventBus = new ReactorEventBus(subscribers);
        final var videoLiker = new VideoLiker(eventBus);

        final var videoTitle = "\uD83C\uDF89 New YouTube.com/CodelyTV video title";
        final var userId = "06e8bb44-486c-41ec-8395-ead1288e5b37";

        videoLiker.like(videoTitle, userId);
    }
}
