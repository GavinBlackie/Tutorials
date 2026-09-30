import boto3

ec2 = boto3.resource('ec2')

instances = ec2.create_instances(

ImageId='ami-xxxxxxxx',

InstanceType='t2.micro',

KeyName='lab4key',

MinCount=1,

MaxCount=1

)

print("Launched:", instances[0].id)