package server_logic.trash

open class ServerIteratingSystem(val interval: Interval = EachFrame()) {
//    var accumulator: Float = 0f
//    open fun onTick(deltaTime: Float) {
//        when (interval) {
//            is Fixed -> {
//                accumulator += deltaTime
//                val stepRate = interval.step
//                while (accumulator >= stepRate) {
//                    onUpdate(deltaTime)
//                    accumulator -= stepRate
//                }
//                //onAlpha(accumulator/ stepRate)
//            }
//        }
//    }
//
//    open fun onUpdate(deltaTime: Float) {
//    }
}

open class Interval
class EachFrame : Interval()
class Fixed(val step: Float) : Interval()