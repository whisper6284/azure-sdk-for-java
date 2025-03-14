// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Role assignment entity.
 */
@Fluent
public final class RoleAssignmentEntityInner implements JsonSerializable<RoleAssignmentEntityInner> {
    /*
     * Role assignment entity id
     */
    private String id;

    /*
     * Role assignment entity name
     */
    private String name;

    /*
     * Role assignment entity properties
     */
    private RoleAssignmentEntityProperties innerProperties;

    /**
     * Creates an instance of RoleAssignmentEntityInner class.
     */
    public RoleAssignmentEntityInner() {
    }

    /**
     * Get the id property: Role assignment entity id.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Role assignment entity id.
     * 
     * @param id the id value to set.
     * @return the RoleAssignmentEntityInner object itself.
     */
    public RoleAssignmentEntityInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Role assignment entity name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Role assignment entity name.
     * 
     * @param name the name value to set.
     * @return the RoleAssignmentEntityInner object itself.
     */
    public RoleAssignmentEntityInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Role assignment entity properties.
     * 
     * @return the innerProperties value.
     */
    private RoleAssignmentEntityProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the principalId property: Principal Id.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalId();
    }

    /**
     * Set the principalId property: Principal Id.
     * 
     * @param principalId the principalId value to set.
     * @return the RoleAssignmentEntityInner object itself.
     */
    public RoleAssignmentEntityInner withPrincipalId(String principalId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentEntityProperties();
        }
        this.innerProperties().withPrincipalId(principalId);
        return this;
    }

    /**
     * Get the roleDefinitionId property: Role definition id.
     * 
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.innerProperties() == null ? null : this.innerProperties().roleDefinitionId();
    }

    /**
     * Set the roleDefinitionId property: Role definition id.
     * 
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the RoleAssignmentEntityInner object itself.
     */
    public RoleAssignmentEntityInner withRoleDefinitionId(String roleDefinitionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentEntityProperties();
        }
        this.innerProperties().withRoleDefinitionId(roleDefinitionId);
        return this;
    }

    /**
     * Get the scope property: Scope of the role assignment entity.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Set the scope property: Scope of the role assignment entity.
     * 
     * @param scope the scope value to set.
     * @return the RoleAssignmentEntityInner object itself.
     */
    public RoleAssignmentEntityInner withScope(String scope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentEntityProperties();
        }
        this.innerProperties().withScope(scope);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoleAssignmentEntityInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoleAssignmentEntityInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RoleAssignmentEntityInner.
     */
    public static RoleAssignmentEntityInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RoleAssignmentEntityInner deserializedRoleAssignmentEntityInner = new RoleAssignmentEntityInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRoleAssignmentEntityInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedRoleAssignmentEntityInner.name = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedRoleAssignmentEntityInner.innerProperties
                        = RoleAssignmentEntityProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRoleAssignmentEntityInner;
        });
    }
}
