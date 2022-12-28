# Ecommerce app

## Overview
A sample app based on [Spring Boot Microservice Project Full Course in 6 Hours](https://www.youtube.com/watch?v=mPPhcU7oWDU)

![](images/microservices.png)

We use a n-tier architecture to model the app
![](images/ntier.png)

## Setup
- install a mongo db client
```
sudo apt install mongodb-clients
```

- start infra (mongodb)
```
cd infrastructure
docker-compose up -d
```

- check that you can connect to mongodb products database and product collection
```
mongo admin -u root -p rootpassword
show dbs
use products
show collections
db.product.find()
```