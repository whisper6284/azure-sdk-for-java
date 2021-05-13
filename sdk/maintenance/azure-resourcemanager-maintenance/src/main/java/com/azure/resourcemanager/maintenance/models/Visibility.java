// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Visibility. */
public final class Visibility extends ExpandableStringEnum<Visibility> {
    /** Static value Custom for Visibility. */
    public static final Visibility CUSTOM = fromString("Custom");

    /** Static value Public for Visibility. */
    public static final Visibility PUBLIC = fromString("Public");

    /**
     * Creates or finds a Visibility from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Visibility.
     */
    @JsonCreator
    public static Visibility fromString(String name) {
        return fromString(name, Visibility.class);
    }

    /** @return known Visibility values. */
    public static Collection<Visibility> values() {
        return values(Visibility.class);
    }
}