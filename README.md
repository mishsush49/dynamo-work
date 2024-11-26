# dynamo-work
Integrating dynamoDB with Spring boot

# Creation of dynamo db table
aws dynamodb create-table --table-name books --attribute-definitions AttributeName=id,AttributeType=S --key-schema AttributeName=id,KeyType=HASH --provisioned-throughput ReadCapacityUnits=5,WriteCapacityUnits=5 --endpoint-url http://localhost:8000

# Published documentation
https://documenter.getpostman.com/view/33727738/2sAYBVhXVf

