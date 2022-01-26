package com.dio.acabemiadigital.infrastructure.jackson;

import com.dio.acabemiadigital.infrastructure.jackson.deserializ.LocalDateDescerializer;
import com.dio.acabemiadigital.infrastructure.jackson.deserializ.LocalDateTimeDescerializer;
import com.dio.acabemiadigital.infrastructure.jackson.serializ.LocalDateSerializer;
import com.dio.acabemiadigital.infrastructure.jackson.serializ.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
public class ObjectMapperConfig implements Jackson2ObjectMapperBuilderCustomizer {

    @Override
    public void customize(Jackson2ObjectMapperBuilder jacksonObjectMapperBuilder) {
        jacksonObjectMapperBuilder.featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .serializerByType(LocalDate.class, new LocalDateSerializer())
                .serializerByType(LocalDateTime.class, new LocalDateTimeSerializer())
                .deserializerByType(LocalDate.class, new LocalDateDescerializer())
                .deserializerByType(LocalDateTime.class, new LocalDateTimeDescerializer());
    }
}
