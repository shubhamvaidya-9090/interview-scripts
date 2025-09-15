# Create S3 bucket
resource "aws_s3_bucket" "demo_bucket" {
  bucket = var.bucket_name
  acl    = "private"

  tags = {
    Name        = "DemoBucket"
    Environment = "Dev"
  }
}

# Create EC2 instance
resource "aws_instance" "demo_ec2" {
  ami           = var.ami_id
  instance_type = var.instance_type

  tags = {
    Name = "DemoEC2"
  }
}
