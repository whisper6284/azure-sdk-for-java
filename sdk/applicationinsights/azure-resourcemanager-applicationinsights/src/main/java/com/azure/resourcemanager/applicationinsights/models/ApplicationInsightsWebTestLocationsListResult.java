// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentWebTestLocationInner;
import java.io.IOException;
import java.util.List;

/**
 * Describes the list of web test locations available to an Application Insights Component.
 */
@Fluent
public final class ApplicationInsightsWebTestLocationsListResult
    implements JsonSerializable<ApplicationInsightsWebTestLocationsListResult> {
    /*
     * List of web test locations.
     */
    private List<ApplicationInsightsComponentWebTestLocationInner> value;

    /**
     * Creates an instance of ApplicationInsightsWebTestLocationsListResult class.
     */
    public ApplicationInsightsWebTestLocationsListResult() {
    }

    /**
     * Get the value property: List of web test locations.
     * 
     * @return the value value.
     */
    public List<ApplicationInsightsComponentWebTestLocationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of web test locations.
     * 
     * @param value the value value to set.
     * @return the ApplicationInsightsWebTestLocationsListResult object itself.
     */
    public ApplicationInsightsWebTestLocationsListResult
        withValue(List<ApplicationInsightsComponentWebTestLocationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model ApplicationInsightsWebTestLocationsListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApplicationInsightsWebTestLocationsListResult.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationInsightsWebTestLocationsListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationInsightsWebTestLocationsListResult if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ApplicationInsightsWebTestLocationsListResult.
     */
    public static ApplicationInsightsWebTestLocationsListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationInsightsWebTestLocationsListResult deserializedApplicationInsightsWebTestLocationsListResult
                = new ApplicationInsightsWebTestLocationsListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ApplicationInsightsComponentWebTestLocationInner> value = reader
                        .readArray(reader1 -> ApplicationInsightsComponentWebTestLocationInner.fromJson(reader1));
                    deserializedApplicationInsightsWebTestLocationsListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationInsightsWebTestLocationsListResult;
        });
    }
}
