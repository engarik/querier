package com.github.kuzznya.querier.builder.create.columns;

import com.github.kuzznya.querier.builder.create.model.DataType;

public class CustomColumn extends Column {

    private final String typeName;

    public CustomColumn(String typeName, String name, DataType type) {
        super(name, type);
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return name + " " + typeName;
    }
}
