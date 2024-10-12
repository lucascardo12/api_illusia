package br.com.illusia.api.features.view

import br.com.illusia.api.features.message.MessageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/views")
class ViewController {
    @Autowired
    lateinit var messageService: MessageService

    @PostMapping("/v1")
    fun create(
        @RequestBody body: ViewDto
    ): ViewDto {
        messageService.sendView(body)
        return body
    }
}