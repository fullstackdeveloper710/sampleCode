package vn.supremetech.examples.handdetection.handlandmark.data

/**
 * Palm detection result
 */
data class Detection(
    val labelId: Int,
    val score: Float,
    val locationData: LocationData
)
