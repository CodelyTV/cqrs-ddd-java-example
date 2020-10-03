package tv.codely.mooc.video.domain;

import tv.codely.mooc.shared.domain.user.UserId;
import tv.codely.shared.domain.AggregateRoot;

public class VideoLike extends AggregateRoot {
    private final VideoTitle title;
    private final UserId userId;

    private VideoLike(VideoTitle title, UserId userId) {
        this.title = title;
        this.userId = userId;
    }

    public static VideoLike like(VideoTitle title, UserId userId) {
        var videoLike = new VideoLike(title, userId);

        var videoLiked = new VideoLiked(title.value(), userId.value());

        videoLike.record(videoLiked);

        return videoLike;
    }

}
