enum class Lib(val version: String) {
    CORE_KTX("1.12.0"),
    LIFECYCLE_KTX("2.6.2"),
    ACTIVITY_COMPOSE("1.8.1"),
    ESPRESSO("3.5.1"),
    EXT_J_UNIT("1.1.5"),
    J_UNIT("4.13.2"),
    COMPOSE_BOM("2023.03.00")
}

object Compose {
    val composeBoM by lazy { "androidx.compose:compose-bom:${Lib.COMPOSE_BOM.version}" }
    val composeUi by lazy { "androidx.compose.ui:ui" }
    val composeUiTooling by lazy { "androidx.compose.ui:ui-tooling" }
    val composeGraphics by lazy { "androidx.compose.ui:ui-graphics" }
    val composeUiToolingPrev by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val composeMaterial3 by lazy { "androidx.compose.material3:material3" }
    val composeUiTest by lazy { "androidx.compose.ui:ui-test-junit4" }
    val composeUiManifest by lazy { "androidx.compose.ui:ui-test-manifest" }
}

object AndroidX {
    val androidCore by lazy { "androidx.core:core-ktx:${Lib.CORE_KTX.version}" }
    val androidLifecycle by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Lib.LIFECYCLE_KTX.version}" }
    val androidActivityCompose by lazy { "androidx.activity:activity-compose:${Lib.ACTIVITY_COMPOSE.version}" }
    val androidExtJUnit by lazy { "androidx.test.ext:junit:${Lib.EXT_J_UNIT.version}" }
}

object Testing {
    val jUnit by lazy { "junit:junit:${Lib.J_UNIT.version}" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:${Lib.ESPRESSO.version}" }
}