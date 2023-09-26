// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.fluent.models.UpdateRunInner;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpdate;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpgradeSpec;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpgradeType;
import com.azure.resourcemanager.containerservicefleet.models.NodeImageSelection;
import com.azure.resourcemanager.containerservicefleet.models.NodeImageSelectionType;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRunListResult;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRunStrategy;
import com.azure.resourcemanager.containerservicefleet.models.UpdateStage;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UpdateRunListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateRunListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\",\"strategy\":{\"stages\":[{\"name\":\"f\"},{\"name\":\"rwzwbng\"},{\"name\":\"itnwuizgazxufi\"}]},\"managedClusterUpdate\":{\"upgrade\":{\"type\":\"Full\",\"kubernetesVersion\":\"kyfi\"},\"nodeImageSelection\":{\"type\":\"Latest\"}},\"status\":{\"status\":{\"startTime\":\"2021-05-20T07:32:25Z\",\"completedTime\":\"2021-05-02T03:10:17Z\",\"state\":\"Skipped\"},\"stages\":[{}],\"nodeImageSelection\":{\"selectedNodeImageVersions\":[{},{}]}}},\"eTag\":\"sdkf\",\"id\":\"hwxmnteiwa\",\"name\":\"pvkmijcmmxdcuf\",\"type\":\"fsrpymzidnse\"},{\"properties\":{\"provisioningState\":\"Failed\",\"strategy\":{\"stages\":[{\"name\":\"sgfyccsnew\"},{\"name\":\"dwzjeiach\"},{\"name\":\"oosflnr\"},{\"name\":\"sfqpteehz\"}]},\"managedClusterUpdate\":{\"upgrade\":{\"type\":\"NodeImageOnly\",\"kubernetesVersion\":\"pyqr\"},\"nodeImageSelection\":{\"type\":\"Latest\"}},\"status\":{\"status\":{\"startTime\":\"2021-01-12T13:01:17Z\",\"completedTime\":\"2021-01-25T11:13:44Z\",\"state\":\"Failed\"},\"stages\":[{},{},{},{}],\"nodeImageSelection\":{\"selectedNodeImageVersions\":[{}]}}},\"eTag\":\"qxhcrmn\",\"id\":\"hjtckwhd\",\"name\":\"oifiyipjxsqwpgr\",\"type\":\"bznorcjxvsnby\"},{\"properties\":{\"provisioningState\":\"Canceled\",\"strategy\":{\"stages\":[{\"name\":\"ocpcy\"},{\"name\":\"hurzafblj\"}]},\"managedClusterUpdate\":{\"upgrade\":{\"type\":\"NodeImageOnly\",\"kubernetesVersion\":\"btoqcjmkljavbqid\"},\"nodeImageSelection\":{\"type\":\"Latest\"}},\"status\":{\"status\":{\"startTime\":\"2021-10-17T08:13:54Z\",\"completedTime\":\"2021-01-22T00:34:47Z\",\"state\":\"Completed\"},\"stages\":[{},{},{}],\"nodeImageSelection\":{\"selectedNodeImageVersions\":[{},{},{}]}}},\"eTag\":\"bzhfepgzgqexz\",\"id\":\"ocxscpaierhhbcs\",\"name\":\"l\",\"type\":\"mmajtjaodx\"},{\"properties\":{\"provisioningState\":\"Failed\",\"strategy\":{\"stages\":[{\"name\":\"k\"},{\"name\":\"pxokajionp\"}]},\"managedClusterUpdate\":{\"upgrade\":{\"type\":\"NodeImageOnly\",\"kubernetesVersion\":\"xg\"},\"nodeImageSelection\":{\"type\":\"Latest\"}},\"status\":{\"status\":{\"startTime\":\"2021-02-01T21:21:11Z\",\"completedTime\":\"2021-04-23T14:47:55Z\",\"state\":\"Stopped\"},\"stages\":[{}],\"nodeImageSelection\":{\"selectedNodeImageVersions\":[{},{}]}}},\"eTag\":\"wzrlovmclwhij\",\"id\":\"oejctbzaqsqsy\",\"name\":\"bkbfkgukdkex\",\"type\":\"ppofmxaxcfjpgdd\"}],\"nextLink\":\"c\"}")
                .toObject(UpdateRunListResult.class);
        Assertions.assertEquals("f", model.value().get(0).strategy().stages().get(0).name());
        Assertions
            .assertEquals(ManagedClusterUpgradeType.FULL, model.value().get(0).managedClusterUpdate().upgrade().type());
        Assertions.assertEquals("kyfi", model.value().get(0).managedClusterUpdate().upgrade().kubernetesVersion());
        Assertions
            .assertEquals(
                NodeImageSelectionType.LATEST, model.value().get(0).managedClusterUpdate().nodeImageSelection().type());
        Assertions.assertEquals("c", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateRunListResult model =
            new UpdateRunListResult()
                .withValue(
                    Arrays
                        .asList(
                            new UpdateRunInner()
                                .withStrategy(
                                    new UpdateRunStrategy()
                                        .withStages(
                                            Arrays
                                                .asList(
                                                    new UpdateStage().withName("f"),
                                                    new UpdateStage().withName("rwzwbng"),
                                                    new UpdateStage().withName("itnwuizgazxufi"))))
                                .withManagedClusterUpdate(
                                    new ManagedClusterUpdate()
                                        .withUpgrade(
                                            new ManagedClusterUpgradeSpec()
                                                .withType(ManagedClusterUpgradeType.FULL)
                                                .withKubernetesVersion("kyfi"))
                                        .withNodeImageSelection(
                                            new NodeImageSelection().withType(NodeImageSelectionType.LATEST))),
                            new UpdateRunInner()
                                .withStrategy(
                                    new UpdateRunStrategy()
                                        .withStages(
                                            Arrays
                                                .asList(
                                                    new UpdateStage().withName("sgfyccsnew"),
                                                    new UpdateStage().withName("dwzjeiach"),
                                                    new UpdateStage().withName("oosflnr"),
                                                    new UpdateStage().withName("sfqpteehz"))))
                                .withManagedClusterUpdate(
                                    new ManagedClusterUpdate()
                                        .withUpgrade(
                                            new ManagedClusterUpgradeSpec()
                                                .withType(ManagedClusterUpgradeType.NODE_IMAGE_ONLY)
                                                .withKubernetesVersion("pyqr"))
                                        .withNodeImageSelection(
                                            new NodeImageSelection().withType(NodeImageSelectionType.LATEST))),
                            new UpdateRunInner()
                                .withStrategy(
                                    new UpdateRunStrategy()
                                        .withStages(
                                            Arrays
                                                .asList(
                                                    new UpdateStage().withName("ocpcy"),
                                                    new UpdateStage().withName("hurzafblj"))))
                                .withManagedClusterUpdate(
                                    new ManagedClusterUpdate()
                                        .withUpgrade(
                                            new ManagedClusterUpgradeSpec()
                                                .withType(ManagedClusterUpgradeType.NODE_IMAGE_ONLY)
                                                .withKubernetesVersion("btoqcjmkljavbqid"))
                                        .withNodeImageSelection(
                                            new NodeImageSelection().withType(NodeImageSelectionType.LATEST))),
                            new UpdateRunInner()
                                .withStrategy(
                                    new UpdateRunStrategy()
                                        .withStages(
                                            Arrays
                                                .asList(
                                                    new UpdateStage().withName("k"),
                                                    new UpdateStage().withName("pxokajionp"))))
                                .withManagedClusterUpdate(
                                    new ManagedClusterUpdate()
                                        .withUpgrade(
                                            new ManagedClusterUpgradeSpec()
                                                .withType(ManagedClusterUpgradeType.NODE_IMAGE_ONLY)
                                                .withKubernetesVersion("xg"))
                                        .withNodeImageSelection(
                                            new NodeImageSelection().withType(NodeImageSelectionType.LATEST)))))
                .withNextLink("c");
        model = BinaryData.fromObject(model).toObject(UpdateRunListResult.class);
        Assertions.assertEquals("f", model.value().get(0).strategy().stages().get(0).name());
        Assertions
            .assertEquals(ManagedClusterUpgradeType.FULL, model.value().get(0).managedClusterUpdate().upgrade().type());
        Assertions.assertEquals("kyfi", model.value().get(0).managedClusterUpdate().upgrade().kubernetesVersion());
        Assertions
            .assertEquals(
                NodeImageSelectionType.LATEST, model.value().get(0).managedClusterUpdate().nodeImageSelection().type());
        Assertions.assertEquals("c", model.nextLink());
    }
}
