import mu.KotlinLogging
private val logger = KotlinLogging.logger {}

fun main(args: Array<String>) {
    logger.debug { "Args: ${args}" }
}
