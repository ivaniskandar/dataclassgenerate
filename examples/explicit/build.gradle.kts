/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

import com.facebook.kotlin.compilerplugins.dataclassgenerate.gradle.DataClassGenerateMode

plugins {
  kotlin("jvm")
  id("com.github.ivaniskandar.dataclassgenerate")
}

dataClassGenerate { mode.set(DataClassGenerateMode.EXPLICIT) }

dependencies {
  testImplementation(libs.junit)
  testImplementation(libs.assertj.core)
}
