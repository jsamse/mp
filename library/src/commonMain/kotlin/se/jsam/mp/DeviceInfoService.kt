package se.jsam.mp

import kotlin.js.JsExport

@JsExport
class DeviceInfoService {
    fun getDeviceInfo(callback: (deviceInfo: DeviceInfo) -> Unit) {
        val deviceInfo = DeviceInfo(
            "ip",
            "city",
            "country",
        )
        callback(deviceInfo)
    }
}