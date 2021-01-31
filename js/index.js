var mp = require("mp");

var service = new mp.se.jsam.mp.DeviceInfoService();

service.getDeviceInfo(function (info) {
    console.log(info);
})