package org.folio.processing.mapping.mapper.writer;

import org.folio.processing.mapping.mapper.value.StringValue;
import org.folio.processing.mapping.mapper.value.Value;
import org.folio.processing.mapping.model.context.EventContext;
import org.folio.processing.mapping.model.schemas.Instance;

public class InstanceWriter implements Writer {
    private Instance instance;

    public InstanceWriter(Instance instance) {
        this.instance = instance;
    }

    @Override
    public void initialize(EventContext eventContext) {

    }

    @Override
    public void write(String field, Value value) {
        this.instance.setName(((StringValue) value).getValue());
    }

    public void end(EventContext eventContext) {
        eventContext.putObject("instance", instance);
    }
}
