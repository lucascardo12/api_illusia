package br.com.illusia.api.features.message

import br.com.illusia.api.features.view.ViewDto
import com.github.sonus21.rqueue.core.RqueueMessageEnqueuer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component


@Component
class MessageService {
    @Autowired
    lateinit var rqueueMessageEnqueuer: RqueueMessageEnqueuer

    fun sendView(view: ViewDto) {
        rqueueMessageEnqueuer.enqueue(QueueName.VIEW, view)
    }
}