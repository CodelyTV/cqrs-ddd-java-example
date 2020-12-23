package tv.codely.mooc.video.domain;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import tv.codely.shared.domain.DomainEvent;

@RequiredArgsConstructor
@EqualsAndHashCode
public final class VideoLiked  implements DomainEvent {
    private static final String FULL_QUALIFIED_EVENT_NAME = "codelytv.video.video.event.1.video.liked";
   
    private final String title;

    private final String userId;

    public String title() {
        return title;
    }

    public String userId() {
        return userId;
    }


    public String fullQualifiedEventName() {
        return FULL_QUALIFIED_EVENT_NAME;
    }
}