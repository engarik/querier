package com.github.kuzznya.querier.builder.create.columns;

import com.github.kuzznya.querier.builder.create.model.DataType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomParameterColumn extends CustomColumn {

    private final List<Integer> params;

    public CustomParameterColumn(String typeName, String name, DataType type, Integer ... params) {
        super(typeName, name, type);
        this.params = Arrays.asList(params);
    }

    @Override
    public String toString() {
        return super.toString() +
                "(" + params.stream().map(String::valueOf).collect(Collectors.joining(", ")) + ")";
    }

}
