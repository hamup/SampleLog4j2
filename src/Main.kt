import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.core.Logger

fun main() {
    val sampleLogger = SampleLogger()
    sampleLogger.runLogger()
}


class SampleLogger {
    // Logger生成
    val logger: Logger = LogManager.getLogger("Main") as Logger

    fun runLogger() {
        logger.trace("Start!!!")

        var a = 1
        var b = 2
        var c = "test"

        logger.info("info={}", a)
        logger.warn("warn={},={}" ,a,b)
        logger.error("error={}", c)
        logger.trace("end!!!")
    }
}

