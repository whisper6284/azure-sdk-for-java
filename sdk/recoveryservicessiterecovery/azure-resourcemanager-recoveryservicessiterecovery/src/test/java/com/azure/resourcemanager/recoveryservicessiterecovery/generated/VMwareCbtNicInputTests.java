// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VMwareCbtNicInput;
import org.junit.jupiter.api.Assertions;

public final class VMwareCbtNicInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VMwareCbtNicInput model = BinaryData.fromString(
            "{\"nicId\":\"vewwpzrdwcgldo\",\"isPrimaryNic\":\"gcandxfhhhtes\",\"targetSubnetName\":\"qtdn\",\"targetStaticIPAddress\":\"kkpljdsh\",\"isSelectedForMigration\":\"fkdxccyijjimhi\",\"targetNicName\":\"rqnjxmvvsduydwnw\",\"testSubnetName\":\"uhhqldrdymnswxie\",\"testStaticIPAddress\":\"wqnghxnimvyuj\"}")
            .toObject(VMwareCbtNicInput.class);
        Assertions.assertEquals("vewwpzrdwcgldo", model.nicId());
        Assertions.assertEquals("gcandxfhhhtes", model.isPrimaryNic());
        Assertions.assertEquals("qtdn", model.targetSubnetName());
        Assertions.assertEquals("kkpljdsh", model.targetStaticIpAddress());
        Assertions.assertEquals("fkdxccyijjimhi", model.isSelectedForMigration());
        Assertions.assertEquals("rqnjxmvvsduydwnw", model.targetNicName());
        Assertions.assertEquals("uhhqldrdymnswxie", model.testSubnetName());
        Assertions.assertEquals("wqnghxnimvyuj", model.testStaticIpAddress());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VMwareCbtNicInput model = new VMwareCbtNicInput().withNicId("vewwpzrdwcgldo")
            .withIsPrimaryNic("gcandxfhhhtes")
            .withTargetSubnetName("qtdn")
            .withTargetStaticIpAddress("kkpljdsh")
            .withIsSelectedForMigration("fkdxccyijjimhi")
            .withTargetNicName("rqnjxmvvsduydwnw")
            .withTestSubnetName("uhhqldrdymnswxie")
            .withTestStaticIpAddress("wqnghxnimvyuj");
        model = BinaryData.fromObject(model).toObject(VMwareCbtNicInput.class);
        Assertions.assertEquals("vewwpzrdwcgldo", model.nicId());
        Assertions.assertEquals("gcandxfhhhtes", model.isPrimaryNic());
        Assertions.assertEquals("qtdn", model.targetSubnetName());
        Assertions.assertEquals("kkpljdsh", model.targetStaticIpAddress());
        Assertions.assertEquals("fkdxccyijjimhi", model.isSelectedForMigration());
        Assertions.assertEquals("rqnjxmvvsduydwnw", model.targetNicName());
        Assertions.assertEquals("uhhqldrdymnswxie", model.testSubnetName());
        Assertions.assertEquals("wqnghxnimvyuj", model.testStaticIpAddress());
    }
}
