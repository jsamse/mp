package se.jsam.mp

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