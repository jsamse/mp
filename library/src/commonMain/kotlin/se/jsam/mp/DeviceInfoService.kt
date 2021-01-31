package se.jsam.mp

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.js.JsExport

@JsExport
class DeviceInfoService {

    private val client = HttpClient()
    private val scope = CoroutineScope(EmptyCoroutineContext)

    fun getDeviceInfo(callback: (deviceInfo: DeviceInfo) -> Unit) {
        scope.launch {
            val response = client.get<String> {
                url("https://ipinfo.io")
                accept(ContentType.Application.Json)
            }
            val json = Json.parseToJsonElement(response).jsonObject
            val deviceInfo = DeviceInfo(
                json["ip"].toString(),
                json["city"].toString(),
                json["country"].toString(),
            )
            callback(deviceInfo)
        }
    }
}