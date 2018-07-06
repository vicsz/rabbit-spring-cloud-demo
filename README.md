# Demo

Sample Example of RabbitMQ on PCF with Config Client to help isolate an observed creation issue. 

# Usage

## Configure Rabbit on PCF

### Create and Bind the Service

###  Add a Queue called "myQueue" to your RabbitMQ instance

> **Your RabbitMQ instance will need to have a queue create called myQueue**. Messages sent to the Default exchange with the **myQueue** routingkey will be automatically routed to the **myQueue** queue.

### Test messaging using the /getmessage and /sendmessage endpoints.

To send message, curl or point your browser to /sendmessage?input=YOUR_MESSAGE_STRING

To receive messages, curl or point your browser to /getmessage