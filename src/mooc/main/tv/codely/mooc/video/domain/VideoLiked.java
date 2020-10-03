package tv.codely.mooc.video.domain;

import tv.codely.shared.domain.DomainEvent;

public final class VideoLiked implements DomainEvent {
    private static final String FULL_QUALIFIED_EVENT_NAME = "codelytv.video.video.event.1.video.liked";

    private final String title;
    private final String userId;

    public VideoLiked(String title, String userId) {
        this.title = title;
        this.userId = userId;
    }

    public String fullQualifiedEventName() {
        return FULL_QUALIFIED_EVENT_NAME;
    }

    public String title() {
        return title;
    }

    public String userId() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VideoLiked that = (VideoLiked) o;

        if (!title.equals(that.title)) return false;
        return userId.equals(that.userId);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + userId.hashCode();
        return result;
    }
}
