/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

plugins {
  kotlin("jvm")
  id("xyz.ivaniskandar.compilerplugins.dataclassgenerate")
  application
}

application {
  mainClass.set(
      "com.facebook.kotlin.compilerplugins.dataclassgenerate.sample.DataClassGenerateSampleKt")
}
