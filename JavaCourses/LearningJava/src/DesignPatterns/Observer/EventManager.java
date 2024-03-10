package DesignPatterns.Observer;

import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    // This is basically the registry
    // A list of events mapped to what listeners need to be called for the same
    Map<String, List<EventListener>> listeners = new HashMap<>();


}
