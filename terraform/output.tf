output "ec2_public_ip" {
  description = "Public IP of the EC2 instance"
  value       = aws_instance.demo_ec2.public_ip
}

output "s3_bucket_name" {
  description = "Name of the created S3 bucket"
  value       = aws_s3_bucket.demo_bucket.bucket
}
