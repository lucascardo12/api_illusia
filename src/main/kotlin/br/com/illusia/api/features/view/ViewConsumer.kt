package br.com.illusia.api.features.view

import br.com.illusia.api.features.message.QueueName
import com.github.sonus21.rqueue.annotation.RqueueListener
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component
class ViewConsumer {
    @Autowired
    lateinit var viewRepository: ViewRepository

    @RqueueListener(QueueName.VIEW, numRetries = "1", concurrency = "3")
    fun onMessage(view: ViewDto) {
        viewRepository.save(
            ViewEntity(
                comicId = view.comicId,
                pageId = view.pageId,
                createdAt = Date().time
            )
        )
    }
}