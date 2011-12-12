package com.maestrodev.scala

import org.scalatest.FunSuite
class WidgetTest extends FunSuite {
  test("color") {
    expect("Blue") { new Widget().color }
  }

  test("disposition") {
    expect("Awesome") { new Widget().disposition }
  }
}
