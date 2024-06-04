import platform.UIKit.UIDevice
import kotlin.math.roundToInt

actual class BatteryManager {
    actual fun getBatteryLevel(): Int {
        UIDevice.currentDevice.batteryMonitoringEnabled = true
        val batteryLevel = UIDevice.currentDevice.batteryLevel

        return (batteryLevel * 100).roundToInt()
    }
}