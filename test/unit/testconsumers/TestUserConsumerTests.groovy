package testconsumers

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*


import org.junit.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class TestUserConsumerTests {

    void setUp() {


    }

    void tearDown() {
        // Tear down logic here
    }

    void testSomething() {
        UserConsumerBigqueueConsumer consumer = new UserConsumerBigqueueConsumer()
        Map message = [ "uid":"e-00000d86:1383681736352:5595154",
                        "msg":[
                                "id": 71068581,
                                "metadata": [
                                        "modifiedFields": ["points","tags"],
                                        "isNew": false
                                ]
                        ],
                        "id": 21553055,
                        "recipientCallback": "nodeId:e-00000c32-6379:topic:1fd2c67f6e634497a1dfd1da9b2a5246-users-users_feed:consumerGroup:948c07dd9c6a4c5faa106651d0d2cafd-account-prof_user_consumer:id:21553055"
        ]

        consumer.onDelivery(message)

    }
}
