// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cognitiveservices.fluent.models.AccountInner;
import java.io.IOException;
import java.util.List;

/**
 * The list of cognitive services accounts operation response.
 */
@Fluent
public final class AccountListResult implements JsonSerializable<AccountListResult> {
    /*
     * The link used to get the next page of accounts.
     */
    private String nextLink;

    /*
     * Gets the list of Cognitive Services accounts and their properties.
     */
    private List<AccountInner> value;

    /**
     * Creates an instance of AccountListResult class.
     */
    public AccountListResult() {
    }

    /**
     * Get the nextLink property: The link used to get the next page of accounts.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of accounts.
     * 
     * @param nextLink the nextLink value to set.
     * @return the AccountListResult object itself.
     */
    public AccountListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: Gets the list of Cognitive Services accounts and their properties.
     * 
     * @return the value value.
     */
    public List<AccountInner> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AccountListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AccountListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AccountListResult.
     */
    public static AccountListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AccountListResult deserializedAccountListResult = new AccountListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nextLink".equals(fieldName)) {
                    deserializedAccountListResult.nextLink = reader.getString();
                } else if ("value".equals(fieldName)) {
                    List<AccountInner> value = reader.readArray(reader1 -> AccountInner.fromJson(reader1));
                    deserializedAccountListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAccountListResult;
        });
    }
}
