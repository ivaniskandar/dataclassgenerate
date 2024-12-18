/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

import com.facebook.kotlin.compilerplugins.dataclassgenerate.gradle.DataClassGenerateMode

plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.kotlin.serialization)
  id("kotlin-parcelize")
  id("com.github.ivaniskandar.dataclassgenerate")
}

android {
  compileSdk = 33
  namespace = "com.facebook.kotlin.compilerplugins.dataclassgenerate.examples"
}

dataClassGenerate {
  mode.set(DataClassGenerateMode.STRICT)
  generateSuperClass.set(true)
}

dependencies {
  implementation(libs.kotlin.parcelizeRuntime)
  implementation(libs.kotlin.serializationCoreJvm)
  implementation(libs.kotlin.serializationJsonJvm)

  testImplementation(project(":compiler:k1"))
  testImplementation(libs.junit)
  testImplementation(libs.assertj.core)
}
