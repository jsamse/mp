package se.jsam.mp

import kotlin.test.Test
import kotlin.test.assertNotNull

class DeviceInfoServiceTest {
    @Test
    fun getDeviceInfo() {
        val service = DeviceInfoService()
        var info: DeviceInfo? = null
        service.getDeviceInfo {
            info = it
        }
        assertNotNull(info)
    }
}