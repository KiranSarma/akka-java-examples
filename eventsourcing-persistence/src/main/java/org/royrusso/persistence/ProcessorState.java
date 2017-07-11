
package org.royrusso.persistence;

import org.royrusso.event.Event;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author royrusso@gmail.com
 */
public class ProcessorState implements Serializable {
    private final ArrayList<String> events;

    public ProcessorState() {
        this(new ArrayList<String>());
    }

    public ProcessorState(ArrayList<String> events) {
        this.events = events;
    }

    public ProcessorState copy() {
        return new ProcessorState(new ArrayList<String>(events));
    }

    public void update(Event event) {
        events.add(event.toString());
    }

    @Override
    public String toString() {
        return events.toString();
    }
}
