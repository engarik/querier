package com.github.kuzznya.querier.builder.create;

import com.github.kuzznya.querier.builder.create.columns.Column;
import com.github.kuzznya.querier.builder.create.columns.CustomColumn;
import com.github.kuzznya.querier.builder.create.columns.CustomParameterColumn;
import com.github.kuzznya.querier.builder.create.columns.ParameterColumn;
import com.github.kuzznya.querier.builder.create.model.DataType;

public class AfterTableBuilder extends CreateBuilder {

    protected AfterTableBuilder(CreateBuilder parent) {
        super(parent);
    }

    public AfterTableBuilder INT(String name) {
        super.addColumn(new Column(name, DataType.INT));
        return new AfterTableBuilder(this);
    }

    public AfterTableBuilder INT(String name, int size) {
        super.addColumn(new ParameterColumn(name, DataType.INT, size));
        return new AfterTableBuilder(this);
    }

    public AfterTableBuilder VARCHAR(String name, int size) {
        super.addColumn(new ParameterColumn(name, DataType.VARCHAR, size));
        return new AfterTableBuilder(this);
    }

    public AfterTableBuilder TEXT(String name, int size) {
        super.addColumn(new ParameterColumn(name, DataType.TEXT, size));
        return new AfterTableBuilder(this);
    }

    public AfterTableBuilder DOUBLE(String name) {
        super.addColumn(new Column(name, DataType.DOUBLE));
        return new AfterTableBuilder(this);
    }

    public AfterTableBuilder DECIMAL(String name, int size, int fractionalPartSize) {
        super.addColumn(new ParameterColumn(name, DataType.DECIMAL, size, fractionalPartSize));
        return new AfterTableBuilder(this);
    }

    public AfterTableBuilder DATE(String name) {
        super.addColumn(new Column(name, DataType.DATE));
        return new AfterTableBuilder(this);
    }

    public AfterTableBuilder type(String typeName, String name) {
        super.addColumn(new CustomColumn(typeName, name, DataType.CUSTOM));
        return new AfterTableBuilder(this);
    }
    public AfterTableBuilder type(String typeName, String name, Integer ... params) {
        super.addColumn(new CustomParameterColumn(typeName, name, DataType.CUSTOM, params));
        return new AfterTableBuilder(this);
    }


    public String build() {
        return super.build();
    }
}
