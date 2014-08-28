package testconsumers



import org.apache.log4j.Logger
import com.mercadolibre.bigqueue.BigQueueConsumer

class UserConsumerBigqueueConsumer extends BigQueueConsumer {
    static final Logger log = Logger.getLogger(this)

    String topicName = '1fd2c67f6e634497a1dfd1da9b2a5246-users-users_feed'
    String consumerName = 'b9e2f65f3c58490bb883b72e437d7278-billing-userConsumerTest'
    Integer concurrency = 1
    static List observedFields = ['userType','tags']

    void onDelivery(message) {
        try {


            String userId = message?.msg?.id
            List modifiedFields = message?.msg?.metadata?.modifiedFields

            if( observedFields.intersect(modifiedFields)  )
            {
                println "expected field modified"
            }

        }
        catch(Exception e) {
            println "Error"
        }
    }
}