package whith

import java.lang.module.Configuration

class Configuration(var host: String, var port: Int)
/*
fun main(){
    val configuration = whith.Configuration(host = "127.0.0.1", port 8080)

    with(configuration){
        println("$host: $port")
    }

    // instead off
    println("${configuration.host}:${configuration.port}")
}

 */