package com.colloquio.model;

import java.util.List;

public class StayResponseDTO {
    private String message;

    private List<Stay> stay;

    public StayResponseDTO(String message, List<Stay> stay) {
        this.message = message;
        this.stay = stay;
    }

    public void setStay(List<Stay> stay) {
        this.stay = stay;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Stay> getStay() {
        return stay;
    }
}
