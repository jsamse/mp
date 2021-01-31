package se.jsam.mp

import kotlin.js.JsExport

@JsExport
data class DeviceInfo(val ip: String, val city: String, val country: String)
