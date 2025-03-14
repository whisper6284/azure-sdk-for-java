// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Input for testing all routes.
 */
@Fluent
public final class TestAllRoutesInput implements JsonSerializable<TestAllRoutesInput> {
    /*
     * Routing source
     */
    private RoutingSource routingSource;

    /*
     * Routing message
     */
    private RoutingMessage message;

    /*
     * Routing Twin Reference
     */
    private RoutingTwin twin;

    /**
     * Creates an instance of TestAllRoutesInput class.
     */
    public TestAllRoutesInput() {
    }

    /**
     * Get the routingSource property: Routing source.
     * 
     * @return the routingSource value.
     */
    public RoutingSource routingSource() {
        return this.routingSource;
    }

    /**
     * Set the routingSource property: Routing source.
     * 
     * @param routingSource the routingSource value to set.
     * @return the TestAllRoutesInput object itself.
     */
    public TestAllRoutesInput withRoutingSource(RoutingSource routingSource) {
        this.routingSource = routingSource;
        return this;
    }

    /**
     * Get the message property: Routing message.
     * 
     * @return the message value.
     */
    public RoutingMessage message() {
        return this.message;
    }

    /**
     * Set the message property: Routing message.
     * 
     * @param message the message value to set.
     * @return the TestAllRoutesInput object itself.
     */
    public TestAllRoutesInput withMessage(RoutingMessage message) {
        this.message = message;
        return this;
    }

    /**
     * Get the twin property: Routing Twin Reference.
     * 
     * @return the twin value.
     */
    public RoutingTwin twin() {
        return this.twin;
    }

    /**
     * Set the twin property: Routing Twin Reference.
     * 
     * @param twin the twin value to set.
     * @return the TestAllRoutesInput object itself.
     */
    public TestAllRoutesInput withTwin(RoutingTwin twin) {
        this.twin = twin;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (message() != null) {
            message().validate();
        }
        if (twin() != null) {
            twin().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("routingSource", this.routingSource == null ? null : this.routingSource.toString());
        jsonWriter.writeJsonField("message", this.message);
        jsonWriter.writeJsonField("twin", this.twin);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TestAllRoutesInput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TestAllRoutesInput if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TestAllRoutesInput.
     */
    public static TestAllRoutesInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TestAllRoutesInput deserializedTestAllRoutesInput = new TestAllRoutesInput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("routingSource".equals(fieldName)) {
                    deserializedTestAllRoutesInput.routingSource = RoutingSource.fromString(reader.getString());
                } else if ("message".equals(fieldName)) {
                    deserializedTestAllRoutesInput.message = RoutingMessage.fromJson(reader);
                } else if ("twin".equals(fieldName)) {
                    deserializedTestAllRoutesInput.twin = RoutingTwin.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTestAllRoutesInput;
        });
    }
}
