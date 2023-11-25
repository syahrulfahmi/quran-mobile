import org.gradle.kotlin.dsl.DependencyHandlerScope


fun DependencyHandlerScope.appModule() {
    androidX()
    compose()
    testing()
}

fun DependencyHandlerScope.androidX() {
    implementation((AndroidX.androidCore))
    implementation((AndroidX.androidLifecycle))
    implementation((AndroidX.androidActivityCompose))
    testImplementaion(AndroidX.androidExtJUnit)
}

fun DependencyHandlerScope.testing() {
    androidTestImplementation(Testing.jUnit)
    androidTestImplementation(Testing.espresso)
}

fun DependencyHandlerScope.compose() {
    implementation(platform(Compose.composeBoM))
    androidTestImplementation(platform(Compose.composeBoM))
    androidTestImplementation(platform(Compose.composeUiTest))
    implementation(Compose.composeUi)
    implementation(Compose.composeGraphics)
    implementation(Compose.composeUiToolingPrev)
    implementation(Compose.composeMaterial3)
    debugImplementation(Compose.composeUiTooling)
    debugImplementation(Compose.composeUiManifest)
}


fun DependencyHandlerScope.implementation(platform: Any) {
    add("implementation", platform)
}

fun DependencyHandlerScope.testImplementaion(platform: Any) {
    add("testImplementation", platform)
}

fun DependencyHandlerScope.debugImplementation(platform: Any) {
    add("debugImplementation", platform)
}

fun DependencyHandlerScope.androidTestImplementation(platform: Any) {
    add("androidTestImplementation", platform)
}
