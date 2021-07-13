package com.github.kuzznya.querier.builder.create.columns;

import com.github.kuzznya.querier.builder.create.model.DataType;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Column {
    protected String name;
    protected DataType type;

    @Override
    public String toString() {
        return name + " " + type.name();
    }
}
