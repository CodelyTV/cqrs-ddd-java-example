package tv.codely.mooc.shared.user.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@EqualsAndHashCode
@RequiredArgsConstructor
public final class UserId {
    private final String value;
    
    public String value() {
        return value;
    }
    
}
