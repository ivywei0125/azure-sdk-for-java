// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Available options for detect face with attribute.
 */
public final class FaceAttributeType extends ExpandableStringEnum<FaceAttributeType> {

    /**
     * 3-D roll/yaw/pitch angles for face direction.
     */
    @Generated
    public static final FaceAttributeType HEAD_POSE = fromString("headPose");

    /**
     * Glasses type. Values include 'NoGlasses', 'ReadingGlasses', 'Sunglasses', 'SwimmingGoggles'.
     */
    @Generated
    public static final FaceAttributeType GLASSES = fromString("glasses");

    /**
     * Whether each facial area is occluded, including forehead, eyes and mouth.
     */
    @Generated
    public static final FaceAttributeType OCCLUSION = fromString("occlusion");

    /**
     * Accessories around face, including 'headwear', 'glasses' and 'mask'. Empty array means no accessories detected.
     * Note this is after a face is detected. Large mask could result in no face to be detected.
     */
    @Generated
    public static final FaceAttributeType ACCESSORIES = fromString("accessories");

    /**
     * Face is blurry or not. Level returns 'Low', 'Medium' or 'High'. Value returns a number between [0,1], the larger
     * the blurrier.
     */
    @Generated
    public static final FaceAttributeType BLUR = fromString("blur");

    /**
     * Face exposure level. Level returns 'GoodExposure', 'OverExposure' or 'UnderExposure'.
     */
    @Generated
    public static final FaceAttributeType EXPOSURE = fromString("exposure");

    /**
     * Noise level of face pixels. Level returns 'Low', 'Medium' and 'High'. Value returns a number between [0,1], the
     * larger the noisier.
     */
    @Generated
    public static final FaceAttributeType NOISE = fromString("noise");

    /**
     * Whether each face is wearing a mask. Mask type returns 'noMask', 'faceMask', 'otherMaskOrOcclusion', or
     * 'uncertain'. Value returns a boolean 'noseAndMouthCovered' indicating whether nose and mouth are covered.
     */
    @Generated
    public static final FaceAttributeType MASK = fromString("mask");

    /**
     * The overall image quality regarding whether the image being used in the detection is of sufficient quality to
     * attempt face recognition on. The value is an informal rating of low, medium, or high. Only 'high' quality images
     * are recommended for person enrollment and quality at or above 'medium' is recommended for identification
     * scenarios. The attribute is only available when using recognition models recognition_03 or recognition_04.
     */
    @Generated
    public static final FaceAttributeType QUALITY_FOR_RECOGNITION = fromString("qualityForRecognition");

    /**
     * Age in years.
     */
    @Generated
    public static final FaceAttributeType AGE = fromString("age");

    /**
     * Smile intensity, a number between [0,1].
     */
    @Generated
    public static final FaceAttributeType SMILE = fromString("smile");

    /**
     * Properties describing facial hair attributes.
     */
    @Generated
    public static final FaceAttributeType FACIAL_HAIR = fromString("facialHair");

    /**
     * Properties describing hair attributes.
     */
    @Generated
    public static final FaceAttributeType HAIR = fromString("hair");

    /**
     * Creates a new instance of FaceAttributeType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public FaceAttributeType() {
    }

    /**
     * Creates or finds a FaceAttributeType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FaceAttributeType.
     */
    @Generated
    public static FaceAttributeType fromString(String name) {
        return fromString(name, FaceAttributeType.class);
    }

    /**
     * Gets known FaceAttributeType values.
     *
     * @return known FaceAttributeType values.
     */
    @Generated
    public static Collection<FaceAttributeType> values() {
        return values(FaceAttributeType.class);
    }

    /**
     * Face attribute supported by Detection01.
     */
    public static final class ModelDetection01 {

        /**
         * 3-D roll/yaw/pitch angles for face direction.
         */
        public static final FaceAttributeType HEAD_POSE = FaceAttributeType.HEAD_POSE;

        /**
         * Glasses type. Values include 'NoGlasses', 'ReadingGlasses', 'Sunglasses', 'SwimmingGoggles'.
         */
        public static final FaceAttributeType GLASSES = FaceAttributeType.GLASSES;

        /**
         * Whether each facial area is occluded, including forehead, eyes and mouth.
         */
        public static final FaceAttributeType OCCLUSION = FaceAttributeType.OCCLUSION;

        /**
         * Accessories around face, including 'headwear', 'glasses' and 'mask'. Empty array means no accessories
         * detected.
         * Note this is after a face is detected. Large mask could result in no face to be detected.
         */
        public static final FaceAttributeType ACCESSORIES = FaceAttributeType.ACCESSORIES;

        /**
         * Face is blurry or not. Level returns 'Low', 'Medium' or 'High'. Value returns a number between [0,1], the
         * larger the blurrier.
         */
        public static final FaceAttributeType BLUR = FaceAttributeType.BLUR;

        /**
         * Face exposure level. Level returns 'GoodExposure', 'OverExposure' or 'UnderExposure'.
         */
        public static final FaceAttributeType EXPOSURE = FaceAttributeType.EXPOSURE;

        /**
         * Noise level of face pixels. Level returns 'Low', 'Medium' and 'High'. Value returns a number between [0,1],
         * the larger the noisier.
         */
        public static final FaceAttributeType NOISE = FaceAttributeType.NOISE;
    }

    /**
     * Face attribute supported by Detection03.
     */
    public static final class ModelDetection03 {

        /**
         * Face is blurry or not. Level returns 'Low', 'Medium' or 'High'. Value returns a number between [0,1], the
         * larger the blurrier.
         */
        public static final FaceAttributeType BLUR = FaceAttributeType.BLUR;

        /**
         * 3-D roll/yaw/pitch angles for face direction.
         */
        public static final FaceAttributeType HEAD_POSE = FaceAttributeType.HEAD_POSE;

        /**
         * Whether each face is wearing a mask. Mask type returns 'noMask', 'faceMask', 'otherMaskOrOcclusion', or
         * 'uncertain'. Value returns a boolean 'noseAndMouthCovered' indicating whether nose and mouth are covered.
         */
        public static final FaceAttributeType MASK = FaceAttributeType.MASK;
    }

    /**
     * Face attribute supported by Recognition03.
     */
    public static final class ModelRecognition03 {

        /**
         * The overall image quality regarding whether the image being used in the detection is of sufficient quality to
         * attempt face recognition on. The value is an informal rating of low, medium, or high. Only 'high' quality
         * images
         * are recommended for person enrollment and quality at or above 'medium' is recommended for identification
         * scenarios. The attribute is only available when using any combinations of detection models detection_01 or
         * detection_03, and recognition models recognition_03 or recognition_04.
         */
        public static final FaceAttributeType QUALITY_FOR_RECOGNITION = FaceAttributeType.QUALITY_FOR_RECOGNITION;
    }

    /**
     * Face attribute supported by Recognition04.
     */
    public static final class ModelRecognition04 {

        /**
         * The overall image quality regarding whether the image being used in the detection is of sufficient quality to
         * attempt face recognition on. The value is an informal rating of low, medium, or high. Only 'high' quality
         * images
         * are recommended for person enrollment and quality at or above 'medium' is recommended for identification
         * scenarios. The attribute is only available when using any combinations of detection models detection_01 or
         * detection_03, and recognition models recognition_03 or recognition_04.
         */
        public static final FaceAttributeType QUALITY_FOR_RECOGNITION = FaceAttributeType.QUALITY_FOR_RECOGNITION;
    }
}
