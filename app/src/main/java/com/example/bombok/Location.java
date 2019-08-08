package com.example.bombok;

import java.util.ArrayList;
import java.util.List;

public class Location {
    String locationName;
    List<Event> events;

    public Location(){
        events = new ArrayList<>();
    }
}
