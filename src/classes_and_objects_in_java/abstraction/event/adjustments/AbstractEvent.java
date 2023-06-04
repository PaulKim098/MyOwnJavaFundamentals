package classes_and_objects_in_java.abstraction.event.adjustments;

import java.sql.Timestamp;

public abstract class AbstractEvent implements Event { // implements the interface and added attributes in a single place

    protected Long createdTimestamp;
    protected String id;

    public AbstractEvent(String id){
        this.createdTimestamp = new Timestamp(System
                .currentTimeMillis()).getTime();
        this.id = id;
    }

    @Override
    public Long getTimeStamp(){ // implemented from Event Interface
        return this.createdTimestamp;
    }

    public abstract void process();
}
