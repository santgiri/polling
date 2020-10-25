package com.polling.app.payload;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class UserIdentityAvailability {
    private Boolean available;

    public UserIdentityAvailability(Boolean available) {
        this.available = available;
    }
}
