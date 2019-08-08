package com.example.bombok;

import java.util.ArrayList;
import java.util.List;

public class Event {
    String eventName;
    List<Reference> references;

    public Event(){
        references = new ArrayList<Reference>();
    }
}
