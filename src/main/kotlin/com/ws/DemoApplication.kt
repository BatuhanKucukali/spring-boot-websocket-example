package com.ws

import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import org.springframework.web.socket.TextMessage
import org.springframework.web.socket.WebSocketSession
import org.springframework.web.socket.config.annotation.EnableWebSocket
import org.springframework.web.socket.config.annotation.WebSocketConfigurer
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry
import org.springframework.web.socket.handler.TextWebSocketHandler

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}

@Configuration
@EnableWebSocket
class WebSocketConfig : WebSocketConfigurer {
    override fun registerWebSocketHandlers(registry: WebSocketHandlerRegistry) {
        registry.addHandler(SocketTextHandler(), "/message")
                .setAllowedOrigins("*")
    }
}

@Component
class SocketTextHandler : TextWebSocketHandler() {
    private val logger = LoggerFactory.getLogger(javaClass)

    override fun handleTextMessage(session: WebSocketSession, message: TextMessage) {
        logger.info("Session : " + session.toString())
        for (i in 1..100) {
            Thread.sleep(3000)
            session.sendMessage(TextMessage("This is fine :) Message : $i"))
        }
    }
}