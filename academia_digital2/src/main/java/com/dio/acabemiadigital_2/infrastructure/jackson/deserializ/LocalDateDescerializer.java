package com.dio.acabemiadigital_2.infrastructure.jackson.deserializ;

import com.dio.acabemiadigital_2.infrastructure.util.JavaTimeUtils;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;

public class LocalDateDescerializer extends StdDeserializer<LocalDate> {

    private static final long serialVersionUID = 1L;

    public LocalDateDescerializer() {
        super(LocalDate.class);
    }

    @Override
    public LocalDate deserialize(final JsonParser parser, final DeserializationContext deserializationContext) throws IOException, JacksonException {
        return LocalDate.parse(parser.readValueAs(String.class), JavaTimeUtils.LOCAL_DATE_FORMATTER);
    }
}
