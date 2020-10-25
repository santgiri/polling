package com.polling.app.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class BaseResponse {
    private Boolean success;
    private String message;
}
