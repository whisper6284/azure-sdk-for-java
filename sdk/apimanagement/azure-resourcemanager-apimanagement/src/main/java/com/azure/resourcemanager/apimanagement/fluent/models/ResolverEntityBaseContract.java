// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * GraphQL API Resolver Entity Base Contract details.
 */
@Fluent
public final class ResolverEntityBaseContract implements JsonSerializable<ResolverEntityBaseContract> {
    /*
     * Resolver Name.
     */
    private String displayName;

    /*
     * Path is type/field being resolved.
     */
    private String path;

    /*
     * Description of the resolver. May include HTML formatting tags.
     */
    private String description;

    /**
     * Creates an instance of ResolverEntityBaseContract class.
     */
    public ResolverEntityBaseContract() {
    }

    /**
     * Get the displayName property: Resolver Name.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Resolver Name.
     * 
     * @param displayName the displayName value to set.
     * @return the ResolverEntityBaseContract object itself.
     */
    public ResolverEntityBaseContract withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the path property: Path is type/field being resolved.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Path is type/field being resolved.
     * 
     * @param path the path value to set.
     * @return the ResolverEntityBaseContract object itself.
     */
    public ResolverEntityBaseContract withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the description property: Description of the resolver. May include HTML formatting tags.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the resolver. May include HTML formatting tags.
     * 
     * @param description the description value to set.
     * @return the ResolverEntityBaseContract object itself.
     */
    public ResolverEntityBaseContract withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("path", this.path);
        jsonWriter.writeStringField("description", this.description);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResolverEntityBaseContract from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResolverEntityBaseContract if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResolverEntityBaseContract.
     */
    public static ResolverEntityBaseContract fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResolverEntityBaseContract deserializedResolverEntityBaseContract = new ResolverEntityBaseContract();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("displayName".equals(fieldName)) {
                    deserializedResolverEntityBaseContract.displayName = reader.getString();
                } else if ("path".equals(fieldName)) {
                    deserializedResolverEntityBaseContract.path = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedResolverEntityBaseContract.description = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResolverEntityBaseContract;
        });
    }
}
